package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgaFoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class AlteracaoCozinhaMain {

	public static void main(String[] args) {

		//Carregou todos os beans no contexto a partir da configuração na classe AlgaFoodApiApplication.
		ApplicationContext context = new SpringApplicationBuilder(AlgaFoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		//Recuperou o bean que outrora foi carregado no container
		//spring.jpa.show-sql=true
		CozinhaRepository bean = context.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		cozinha.setNome("Chinesa com peixes.");
		
		cozinha = bean.save(cozinha);
		System.out.printf("%d -- %s\n", cozinha.getId(), cozinha.getNome());
	}
}
