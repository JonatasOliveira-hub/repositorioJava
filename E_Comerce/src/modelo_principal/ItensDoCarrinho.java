package modelo_principal;

import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Classse que guarda PRODUTOS. Cada PRODUTO tem um ID especifico
 * que acessamos de ITENSDoCarrinho para ver se existe desconto
 * para esse C�digo.
 * 
 * O atributo quantidade, representa quantos produtos temos no total,
 *repetidos ou n�o
 */
public class ItensDoCarrinho {

	private int quantidadeDeProdutos;
	private Produtos produto;
	private Double desconto;
	
	
	public int getQuantidadeDeProdutos() {
		return quantidadeDeProdutos;
	}


	public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
		this.quantidadeDeProdutos = quantidadeDeProdutos;
	}


	public Produtos getProduto() {
		return produto;
	}


	public void setProduto(Produtos produto) {
		this.produto = produto;
	}


	public Double getDesconto() {
		return desconto;
	}


	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}


	@Override
	public String toString() {
		return "ItensDoCarrinho [quantidadeDeProdutos=" + quantidadeDeProdutos + ", produto=" + produto + ", desconto="
				+ desconto + "]";
	}

	//Adicionar um produto
	public void AdicionaItem(int quantidadeDeProdutos, Produtos produto) {
		this.quantidadeDeProdutos = quantidadeDeProdutos;
		this.produto = produto;
	}
	
		
	//Verificar a quantidade de produtos
	public int quantidadeDeItens(int quantidade) {
		if(quantidade <= 0) {
			throw new Error("Quantidade de itens n�o pode ser menor ou igual a zero");
		}else
		{
			return this.quantidadeDeProdutos = quantidade;
		}
	}
	
	//Verificar pelo c�digo se tem desconto
	public Double aplicaDesconto(int cupom) {
		int cupomexiste = 789;
		double novoValor = 0.00;
		Produtos prod = new Produtos();
		
		if(cupomexiste == cupom) {
			int valordoDesconto = 1;
			novoValor = prod.getPreco() - valordoDesconto;
		}
		
		return novoValor;
		
		
	}
}
