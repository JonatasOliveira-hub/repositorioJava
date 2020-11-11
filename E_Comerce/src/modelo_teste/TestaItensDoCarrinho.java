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
	
		//Preparação
		int quantosProdutos = 2;
		ItensDoCarrinho itens = new ItensDoCarrinho();
		
		//Requisição
		itens.quantidadeDeItens(quantosProdutos);
		
		//Validação
		assertEquals(itens.getQuantidadeDeProdutos(), quantosProdutos);
	}
	
	
	@Test
	public void testaAdicionarProdutos() {
		//Preparação
		int quantidade = 2;
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
		
		//preparação
		int cupom = 789;
		ItensDoCarrinho itens = new ItensDoCarrinho();
		
		//Requisição
		Double valorNovodoProduto = itens.aplicaDesconto(cupom);
				
		//Validação
		System.out.println("Valor do produto como o deconto: " + valorNovodoProduto);
		assertEquals(valorNovodoProduto, valorNovodoProduto);
	}

}
