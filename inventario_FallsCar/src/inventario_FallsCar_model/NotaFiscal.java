package inventario_FallsCar_model;

public class NotaFiscal {

	private Carro car;
	private AlugaCarro alugar;
	private String resposta;
	
	public Carro getCar() {
		return car;
	}
	
	public void setCar(Carro car) {
		this.car = car;
	}
	
	public AlugaCarro getAlugar() {
		return alugar;
	}
	
	public void setAlugar(AlugaCarro alugar) {
		this.alugar = alugar;
	}
	
	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public NotaFiscal(Carro car, AlugaCarro alugar, String resposta) {
		super();
		this.car = car;
		this.alugar = alugar;
		this.resposta = resposta;
	}

	@Override
	public String toString() {
		return "NotaFiscal [car=" + car + ", alugar=" + alugar + ", resposta=" + resposta + "]";
	}
		
}
