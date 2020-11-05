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
		ItensDoCarrinho item = new ItensDoCarrinho();
		//Produtos prod = new Produtos();
		//item.AdicionaItem(2, prod.ge);
		
		ArrayList<ItensDoCarrinho> itens = new ArrayList<ItensDoCarrinho>();
		itens.add(item);
		
		Carrinho car = new Carrinho();
		car.setItens(itens);
	}

	@Test
	public void testarCepCarrinho() {
		String cep = "26.582.030";
		
		Carrinho car = new Carrinho();
		Double atual = car.calculaFrete(cep);
		Double esperado = 50.00;
		
		assertEquals(esperado, atual);
		
		
	}
}
