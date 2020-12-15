package inventario_FallsCar_teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import inventario_FallsCar_model.Carro;
import inventario_FallsCar_model.ReservaCarro;

class Testa_reservaCarro {

	/* alugados, livres, reservados e em manuten��o*/
	@Test
	void testaReserva() {
		//Prepara��o
		double id = 787; 
		//Carro car = new Carro(id);
		//s� passamos o Id do carro, a classe carro pega um carro a partir do Id
		
		//Requisi��o
		ReservaCarro reseCarro = new ReservaCarro();
		String resp = reseCarro.reservaCarro(id);
		
		//Valida��o
		if(resp.contains("Erro durante o processo de reserva")) {
			fail("Erro durante o processo de reserva");
		}
		System.out.println("Resposta a reserva: " + resp);
		
	}

}