package inventario_FallsCar_teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import inventario_FallsCar_model.AlugaCarro;
import inventario_FallsCar_model.Carro;
import inventario_FallsCar_model.NotaFiscal;

class Testa_AlugaCarro {

	
	//testar que um caro foi realmente alugado, mediante reserva anterior.
	//tem de emitir a nota fiscal
	@Test
	void TestaAluguel() {
		//Preparação
		String estado = "Reservado";
		double valorPago = 200.00;
		double id = 789;
		
		//Requisição
		Carro car = new Carro(id, estado);
		car.setPreco(200.00);
		
		AlugaCarro aluga = new AlugaCarro();
		NotaFiscal nota = aluga.alugarCarro(car, valorPago);
		
		//Validação
		if(nota.getCar().getStatus().equals(car.getStatus())) {
			System.out.println("Carro reservado");
		}
	}

}
