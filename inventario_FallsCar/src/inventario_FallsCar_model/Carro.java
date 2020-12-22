package inventario_FallsCar_model;

public class Carro {

	private double id;
	private String cor;
	private double preco;
	private String modelo;
	private String status;//Livre, reservado, alugado, em manutenção
	
	
	
	public Carro(double id) {
		super();
		this.id = id;
	}
	
	public Carro(double id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Carro [id=" + id + ", cor=" + cor + ", preco=" + preco + ", modelo=" + modelo + ", status=" + status
				+ "]";
	}

	
}
