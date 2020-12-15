package modelo_teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import modelo_principal.Carrinho;
import modelo_principal.ItensDoCarrinho;
import modelo_principal.Produtos;

public class TestaCarrinho {

	@Test
	public void testaAdicionaItemAoCarrinho() { 
		
		//Preparação
		Produtos prod = new Produtos();
		ItensDoCarrinho item = new ItensDoCarrinho();
		Carrinho car = new Carrinho();
				
		item.setProduto(prod);
		
		ArrayList<ItensDoCarrinho> itens = new ArrayList<ItensDoCarrinho>();
		itens.add(item);
		
		//item adicionado ao carrinho - requisição
		car.setItens(itens);
		
		//validação
		for(int i=0; i<car.getItens().size();i++) {
		assertEquals(item.getQuantidadeDeProdutos(), car.getItens().get(i).getQuantidadeDeProdutos());
		}
	}

	@Test
	public void testarCepCarrinho() {
		String cep = "26.582.030";
		
		Carrinho car = new Carrinho();
		Double atual = car.calculaFrete(cep);
		Double esperado = 50.00;
		
		assertEquals(esperado, atual);
		
		
	}
	
	@Test
	public void testaValorTotal() {
		//Preparação
		Produtos prod = new Produtos();
		ItensDoCarrinho item = new ItensDoCarrinho();
		Carrinho car = new Carrinho();
						
		item.setProduto(prod);
			
		ArrayList<ItensDoCarrinho> itens = new ArrayList<ItensDoCarrinho>();
		itens.add(item);
				
		
		car.setItens(itens);
		/*
		System.out.println(item.getProduto());
		System.out.println(item.getDesconto());
		System.out.println(item.getQuantidadeDeProdutos());
		for(ItensDoCarrinho ic : car.getItens()) {
			System.out.println("ver o que tem aqui : " + ic);
		}
		for(ItensDoCarrinho ic : car.getItens()) {
			System.out.println("ver o que tem aqui : " + ic);
		}
		*/
		
		
		//tem que dar 2 bananas, ou seja, 20 reais 
		//O conteudo descrito acima, serve para instanciar os objetos e recuperar os valores unitarios
		
		
		//requisição
		Double resultado = car.somaPreco(itens);
		System.out.println(resultado);
		
		//item.getProduto().getPreco();
		
		//validação
		
		
	}
}
