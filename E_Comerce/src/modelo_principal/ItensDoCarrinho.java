package modelo_principal;

import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Classse que guarda PRODUTOS. Cada PRODUTO tem um ID especifico
 * que acessamos de ITENSDoCarrinho para ver se existe desconto
 * para esse Código.
 * 
 * O atributo quantidade, representa quantos produtos temos no total,
 *repetidos ou não
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
	
	//Verificar pelo código se tem desconto
	public Double aplicaDesconto(int cupom) {
		return desconto;
		
	}
}
