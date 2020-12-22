package inventario_FallsCar_model;


public class AlugaCarro {
	
	private double valorDoAluguel;
	
	
	
	public double getValorDoAluguel() {
		return valorDoAluguel;
	}



	public void setValorDoAluguel(double valorDoAluguel) {
		this.valorDoAluguel = valorDoAluguel;
	}



	public NotaFiscal alugarCarro(Carro car, double valor) {
		String resp = "Erro durante o processo de reserva";
		AlugaCarro alugar = new AlugaCarro();
	
		if(car.getId()==789 && car.getStatus()=="Livre") {
			resp = "Carro reservado";
			car.setStatus("Reservado");
		}else {
			throw new IllegalArgumentException();
		}
		
		if(car.getPreco()==valor) {
			alugar.setValorDoAluguel(valor);
			resp = "Carro reservado";			
		}else {
			throw new IllegalArgumentException();
		}
		
		NotaFiscal notaFiscal = new NotaFiscal(car, alugar, resp);
		return notaFiscal;
		
	}
}
