package br.com.springbatch.lerArquivoCsv;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableBatchProcessing
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
public class LerArquivoCsvApplication {

	 @Autowired
	  private JobBuilderFactory fabricaJob;
	 
	  @Autowired
	  private StepBuilderFactory fabricaStep;
	
	public static void main(String[] args) {
		SpringApplication.run(LerArquivoCsvApplication.class, args);
	}

	@Bean("aeronaveJob")
	  public Job criarAeroavetJob(final Step aeronaveStep) {
	    return fabricaJob.get("aeronaveJob")
	        .incrementer(new RunIdIncrementer())
	        .flow(aeronaveStep)
	        .end()
	        .build();
	  }
	
	@Bean("aeronaveStep")
	  public Step criarAeronaveStep(ProcessaItemAeronave processa, LerArquivo leArquivo, GravarDadosAeronave escreve) {
	    return fabricaStep.get("aeronaveStep")
	        .<Aeronave, Aeronave>chunk(3).reader(leArquivo)
	        .processor(processa)
	        .writer(escreve)
	        .build();
	  }	
}
