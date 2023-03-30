package com.algaworks.algafood.jpa;

import java.util.Optional;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgaFoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class ConsultaCozinhaPorIdMain {

	public static void main(String[] args) {

		//Carregou todos os beans no contexto a partir da configuração na classe AlgaFoodApiApplication.
		ApplicationContext context = new SpringApplicationBuilder(AlgaFoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		//Recuperou o bean que outrora foi carregado no container
		//spring.jpa.show-sql=true
		CozinhaRepository bean = context.getBean(CozinhaRepository.class);
		
		Optional<Cozinha> cozinha1 = java.util.Optional.empty(); 
		cozinha1.get().setNome("Brasileira");
		
		cozinha1 = bean.findById(1L);

		System.out.printf("%d -- %s\n", cozinha1.get().getId(), cozinha1.get().getNome());
	}
}
