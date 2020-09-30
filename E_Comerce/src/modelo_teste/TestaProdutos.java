package modelo_teste;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo_principal.ItensDoCarrinho;
import modelo_principal.Produtos;

public class TestaProdutos {

	@Test
	public void testarNomedoProduto() {
		
		String nome = "banana";
		Produtos produto = new Produtos();
		String resp = produto.validaNome(nome);
		assertEquals(nome, resp);
		System.out.println("Resposta: " + resp);
		
	}
	
	@Test
	public void testarCodigodoProduto() {
		
		String cod = "48654asd";
		Produtos produto = new Produtos();
		boolean esperado = true;
		
		boolean atual = produto.validaCodigo(cod);
		assertEquals(esperado, atual);		
	}
	
	@Test
	public void testarPrecodoProduto() {
		Double valor = -0.1;
		Produtos produto = new Produtos();
		Double atual = produto.validapreco(valor);
		assertEquals(valor, atual); 
	}
	
	

}
