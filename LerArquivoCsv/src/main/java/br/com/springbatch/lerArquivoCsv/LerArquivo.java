package br.com.springbatch.lerArquivoCsv;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class LerArquivo extends FlatFileItemReader<Aeronave>{

	public LerArquivo() {
	    DefaultLineMapper<Aeronave> linhaMapeada = new DefaultLineMapper<>();
	    linhaMapeada.setLineTokenizer(new DelimitedLineTokenizer());
	    linhaMapeada.setFieldSetMapper(new AeronaveMapeamento());
	    this.setLineMapper(linhaMapeada);
	    this.setResource(new ClassPathResource("Naves.dat"));
	  }
}
