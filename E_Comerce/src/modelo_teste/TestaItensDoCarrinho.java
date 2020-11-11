package modelo_teste;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo_principal.ItensDoCarrinho;
import modelo_principal.Produtos;

public class TestaItensDoCarrinho {

	//Adicionar um produto
	
	//Verificar a quantidade de produtos
		
	//Verificar pelo c�digo se tem desconto
	
	@Test
	public void testaQuantidadeDeProdutos() {
	
		//Prepara��o
		int quantosProdutos = 2;
		ItensDoCarrinho itens = new ItensDoCarrinho();
		
		//Requisi��o
		itens.quantidadeDeItens(quantosProdutos);
		
		//Valida��o
		assertEquals(itens.getQuantidadeDeProdutos(), quantosProdutos);
	}
	
	
	@Test
	public void testaAdicionarProdutos() {
		//Prepara��o
		int quantidade = 2;
		Produtos prod = new Produtos();
		
		//Requisi��o
		ItensDoCarrinho item = new ItensDoCarrinho();
		item.AdicionaItem(quantidade, prod);
		
		//valida��o
		assertEquals(prod.getCodigo(), item.getProduto().getCodigo());
		assertEquals(quantidade, item.getQuantidadeDeProdutos());
		
	}
	
	@Test
	public void testaDesconto() {
		
		//prepara��o
		int cupom = 789;
		ItensDoCarrinho itens = new ItensDoCarrinho();
		
		//Requisi��o
		Double valorNovodoProduto = itens.aplicaDesconto(cupom);
				
		//Valida��o
		System.out.println("Valor do produto como o deconto: " + valorNovodoProduto);
		assertEquals(valorNovodoProduto, valorNovodoProduto);
	}

}
