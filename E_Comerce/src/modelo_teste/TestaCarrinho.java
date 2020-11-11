package modelo_teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import modelo_principal.Carrinho;
import modelo_principal.ItensDoCarrinho;
import modelo_principal.Produtos;

public class TestaCarrinho {

	@Test
	public void testaCarrinho() {
		
		//Preparação
		Produtos prod = new Produtos();
		ItensDoCarrinho item = new ItensDoCarrinho();
		Carrinho car = new Carrinho();
		
		
		item.setProduto(prod);
		System.out.println(item.getProduto());
		System.out.println(item.getDesconto());
		System.out.println(item.getQuantidadeDeProdutos());
		
		ArrayList<ItensDoCarrinho> itens = new ArrayList<ItensDoCarrinho>();
		itens.add(item);
		
		
		car.setItens(itens);
		
		
		
		for(ItensDoCarrinho ic : car.getItens()) {
			System.out.println("ver o que tem aqui : " + ic);
		}
		
		
		//tem que dar 2 bananas, ou seja, 20 reais 
		//O conteudo descrito acima, serve para instanciar os objetos e recuperar os valores unitarios
		
	}

	/*@Test
	public void testarCepCarrinho() {
		String cep = "26.582.030";
		
		Carrinho car = new Carrinho();
		Double atual = car.calculaFrete(cep);
		Double esperado = 50.00;
		
		assertEquals(esperado, atual);
		
		
	}*/
}
