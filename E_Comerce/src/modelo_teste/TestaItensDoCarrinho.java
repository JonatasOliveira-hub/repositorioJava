package modelo_teste;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo_principal.ItensDoCarrinho;
import modelo_principal.Produtos;

public class TestaItensDoCarrinho {

	//Adicionar um produto
	
	//Verificar a quantidade de produtos
		
	//Verificar pelo código se tem desconto
	
	/*@Test
	public void testaQuantidadeDeProdutos() {
		fail("Not yet implemented");
	}*/
	
	
	@Test
	public void testaAdicionarProdutos() {
		//Preparação
		int quantidade = 1;
		Produtos prod = new Produtos();
		
		//Requisição
		ItensDoCarrinho item = new ItensDoCarrinho();
		item.AdicionaItem(quantidade, prod);
		
		//validação
		assertEquals(prod.getCodigo(), item.getProduto().getCodigo());
		assertEquals(quantidade, item.getQuantidadeDeProdutos());
		
	}
	
	@Test
	public void testaDesconto() {
		int cupom = 789;
		ItensDoCarrinho itens = new ItensDoCarrinho();
		//Double desconto = itens.aplicaDesconto(cupom, );
	}

}
