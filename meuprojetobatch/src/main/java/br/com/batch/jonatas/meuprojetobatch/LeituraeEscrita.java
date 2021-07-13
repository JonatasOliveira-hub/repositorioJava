package br.com.batch.jonatas.meuprojetobatch;

import java.io.File;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.spring.batch.support.CamelItemReader;
import org.apache.camel.component.spring.batch.support.CamelItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class LeituraeEscrita {

	@Autowired
	CamelContext camelContext;
	
	@Bean
	public CamelItemWriter<File> customerCamelWriter() {
	    ProducerTemplate producerTemplate = camelContext.createProducerTemplate();
	    CamelItemWriter<File> writer = new CamelItemWriter<File>(producerTemplate, "file:C:\\Users\\Desktop\\Documents");
	    return writer;
	}
	
	@Bean
	public CamelItemReader<File> customerCamelReader() {
	    ConsumerTemplate consumerTemplate = camelContext.createConsumerTemplate();
	    CamelItemReader<File> reader = new CamelItemReader<File>(consumerTemplate, "file:C:\\Users\\Desktop\\Documents\\Teste?noop=true");
	    return reader;
	}
}
