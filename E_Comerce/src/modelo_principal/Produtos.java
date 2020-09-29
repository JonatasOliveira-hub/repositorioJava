package modelo_principal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Classe que tem os produtos que ser�o adicionados ou retirados 
 * dos itens do carrinho
 */
public class Produtos {

	private String codigo;//codigo do produto
	private String nome;//nome do produto
	private double preco;//pre�o unitario do produto
	
	
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
	
	//Nomes inv�lidos n�o ser�o aceitos
	public String validaNome(String nome) {
		
		//recurso encontrado
		Pattern pattern = Pattern.compile("[0-9]*[!@#$%��&]+[a-zA-Z0-9]*$");
		Matcher match = pattern.matcher(nome);
		
		if (match.find() == true || nome.isEmpty()) {
			System.out.println("A string n�o pode come�ar por caracteres especiais, n�meros, ou ser vazio.");
			throw new IllegalArgumentException();
		} else {
			System.out.println("Nome v�lido");
			return nome;
		}
	}

	//C�digo do Produto s� pode ser num�rico
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
	
	//Pre�o s� pode ser maior que ZERO
	public Double validapreco(Double valor) {
		if(valor<0) {
			throw new Error("Pre�o menor que zero n�o pode");
		}else
		{
			return valor;
		}
	}
	
	
}
