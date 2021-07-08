package br.com.batch.jonatas.meuprojetobatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableBatchProcessing
public class MeuprojetobatchApplication {

	@Autowired
	private JobBuilderFactory fabricaJob;

	@Autowired
	private StepBuilderFactory fabricaStep;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuprojetobatchApplication.class, args);
	}

	@Bean
	public Step step() {
		return fabricaStep.get("step2").tasklet(new Tasklet() {
			@Override
			public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
				System.out.println("Hello, World! Teste do novo nome de step");
				return RepeatStatus.FINISHED;
			}
		}).build();
	}
	
	@Bean
	public Job trabalho() {
		return  this.fabricaJob.get("JobTeste").start(step()).build();
	}
}
