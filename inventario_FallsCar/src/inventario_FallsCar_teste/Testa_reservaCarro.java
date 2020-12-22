package inventario_FallsCar_teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import inventario_FallsCar_model.Carro;
import inventario_FallsCar_model.ReservaCarro;

class Testa_reservaCarro {

	/* alugados, livres, reservado e em manutenção*/
	@Test
	void testaReserva() {
		//Preparação
		double id = 789;
		
		Carro car = new Carro(id, "reservado");
		//só passamos o Id do carro, a classe carro pega um carro a partir do Id
		
		//Requisição
		ReservaCarro reseCarro = new ReservaCarro();
		String resp = reseCarro.reservaCarro(car);
		
		//Validação
		if(resp.contains("Erro durante o processo de reserva")) {
			//fail("Erro durante o processo de reserva");
		}
		System.out.println("Resposta a reserva: " + resp);
		
	}

	@Test
	void testaPeriodo() {
		int periodo = 15;
		
		ReservaCarro reservaCar = new ReservaCarro();

			reservaCar.verificaPeriodo(periodo);
	}
}