package inventario_FallsCar_model;

public class ReservaCarro {

	public Carro car;
	private String localDaRetirada;
	private String localDadevolucao;
	private int duracaoDoContrato;
	
		
	public Carro getCar() {
		return car;
	}

	public void setCar(Carro car) {
		this.car = car;
	}

	public String getLocalDaRetirada() {
		return localDaRetirada;
	}

	public void setLocalDaRetirada(String localDaRetirada) {
		this.localDaRetirada = localDaRetirada;
	}

	public String getLocalDadevolucao() {
		return localDadevolucao;
	}

	public void setLocalDadevolucao(String localDadevolucao) {
		this.localDadevolucao = localDadevolucao;
	}

	public int getDuracaoDoContrato() {
		return duracaoDoContrato;
	}

	public void setDuracaoDoContrato(int duracaoDoContrato) {
		this.duracaoDoContrato = duracaoDoContrato;
	}

	@Override
	public String toString() {
		return "ReservaCarro [car=" + car + ", localDaRetirada=" + localDaRetirada + ", localDadevolucao="
				+ localDadevolucao + ", duracaoDoContrato=" + duracaoDoContrato + "]";
	}




	public String reservaCarro(double idCarrro) {
		String resp = "Erro durante o processo de reserva";
		if(idCarrro==789) {
			resp = "Carro reservado";
		}
		
		return resp;
		}
	
	
}
