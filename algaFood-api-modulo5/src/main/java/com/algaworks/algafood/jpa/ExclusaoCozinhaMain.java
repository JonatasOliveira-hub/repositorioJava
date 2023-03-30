package com.algaworks.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgaFoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class ExclusaoCozinhaMain {

	public static void main(String[] args) {

		//Carregou todos os beans no contexto a partir da configuração na classe AlgaFoodApiApplication.
		ApplicationContext context = new SpringApplicationBuilder(AlgaFoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		//Recuperou o bean que outrora foi carregado no container
		//spring.jpa.show-sql=true
		CozinhaRepository bean = context.getBean(CozinhaRepository.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Brasileira");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Japonesa");
		
		cozinha1 = bean.save(cozinha1);
		cozinha2 = bean.save(cozinha2);

		System.out.printf("%d -- %s\n", cozinha1.getId(), cozinha1.getNome());
		System.out.printf("%d -- %s\n", cozinha2.getId(), cozinha2.getNome());
	}
}
