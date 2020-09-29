package modelo_principal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Classe que tem os produtos que serão adicionados ou retirados 
 * dos itens do carrinho
 */
public class Produtos {

	private String codigo;//codigo do produto
	private String nome;//nome do produto
	private double preco;//preço unitario do produto
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//Nomes inválidos não serão aceitos
	public String validaNome(String nome) {
		
		//recurso encontrado
		Pattern pattern = Pattern.compile("[0-9]*[!@#$%¨¨&]+[a-zA-Z0-9]*$");
		Matcher match = pattern.matcher(nome);
		
		if (match.find() == true || nome.isEmpty()) {
			System.out.println("A string não pode começar por caracteres especiais, números, ou ser vazio.");
			throw new IllegalArgumentException();
		} else {
			System.out.println("Nome válido");
			return nome;
		}
	}

	//Código do Produto só pode ser numérico
	public boolean validaCodigo(String cod) {
		boolean resp = true;

		try {
	        Integer.valueOf(cod);
	        return resp;
	    } catch (Exception e) {
	    	resp = false;
	    	
	    	throw new IllegalArgumentException(e.getMessage());
	    	
	    }
	}
	
	//Preço só pode ser maior que ZERO
	public Double validapreco(Double valor) {
		if(valor<0) {
			throw new Error("Preço menor que zero não pode");
		}else
		{
			return valor;
		}
	}
	
	
}
