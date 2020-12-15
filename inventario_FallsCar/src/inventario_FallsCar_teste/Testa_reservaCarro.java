package inventario_FallsCar_teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import inventario_FallsCar_model.Carro;
import inventario_FallsCar_model.ReservaCarro;

class Testa_reservaCarro {

	/* alugados, livres, reservados e em manutenção*/
	@Test
	void testaReserva() {
		//Preparação
		double id = 787; 
		//Carro car = new Carro(id);
		//só passamos o Id do carro, a classe carro pega um carro a partir do Id
		
		//Requisição
		ReservaCarro reseCarro = new ReservaCarro();
		String resp = reseCarro.reservaCarro(id);
		
		//Validação
		if(resp.contains("Erro durante o processo de reserva")) {
			fail("Erro durante o processo de reserva");
		}
		System.out.println("Resposta a reserva: " + resp);
		
	}

}