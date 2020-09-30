package modelo_teste;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo_principal.ItensDoCarrinho;
import modelo_principal.Produtos;

public class TestaItensDoCarrinho {

	//Adicionar um produto
	
	//Verificar a quantidade de produtos
		
	//Verificar pelo código se tem desconto
	
	@Test
	public void testaQuantidadeDeProdutos() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testaAdicionarProdutos() {
		//Preparação
		int quantidade = 2;
		Produtos prod = new Produtos();
		boolean resp = prod.validaCodigo("4862");
		
		if(resp == true) {
			prod.setCodigo("4862");
		}
		String banana = "azul";
		String resp1 = prod.validaNome(banana);
		if(resp1.equals(banana)) {
			prod.setNome(banana);
		}
		
		Double preco = 14.45;
		if(prod.validapreco(preco).equals(preco)) {
			prod.setPreco(preco);
		}
		
		//Requisição
		ItensDoCarrinho item = new ItensDoCarrinho();
		item.AdicionaItem(quantidade, prod);
		
		//validação
		assertEquals(prod.getCodigo(), item.getProduto().getCodigo());
		assertEquals(quantidade, item.getQuantidadeDeProdutos());
		
	}
	
	@Test
	public void testaDesconto() {
		fail("Not yet implemented");
	}

}
