package br.com.springbatch.lerArquivoCsv;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class Configuracao {
	
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgres.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:1500/postgres");
		dataSource.setUsername("postgres");
		dataSource.setPassword("211195deus");
		return dataSource;
	}
}
