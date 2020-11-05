package modelo_teste;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo_principal.ItensDoCarrinho;
import modelo_principal.Produtos;

public class TestaProdutos {

	@Test
	public void testarNomedoProduto() {
		
		Produtos produto = new Produtos();
		String resp = produto.validaNome(produto.getNome());
		String esperado = produto.getNome();
		assertEquals(esperado, resp);
		
	}
	
	@Test
	public void testarCodigodoProduto() {
		
		Produtos produto = new Produtos();
		boolean esperado = true;
		
		boolean atual = produto.validaCodigo(produto.getCodigo());
		assertEquals(esperado, atual);		
	}
	
	@Test
	public void testarPrecodoProduto() {
		
		Produtos produto = new Produtos();
		Double atual = produto.validapreco(produto.getPreco());
		Double esperado = produto.getPreco();
		assertEquals(esperado, atual); 
	}
	
	

}
