package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgaFoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class CadastroCozinhaMain {

	public static void main(String[] args) {

		//Carregou todos os beans no contexto a partir da configuração na classe AlgaFoodApiApplication.
		ApplicationContext context = new SpringApplicationBuilder(AlgaFoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		//Recuperou o bean que outrora foi carregado no container
		//spring.jpa.show-sql=true
		CadastroCozinha bean = context.getBean(CadastroCozinha.class);
		List<Cozinha> cozinhas = bean.listar();
		
		for(Cozinha cozinha : cozinhas) {
			System.out.println(cozinha.getNome());
		}
	}
}
