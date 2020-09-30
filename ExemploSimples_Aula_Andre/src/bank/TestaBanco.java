package bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaBanco {

	/*@Test
	void testBanco() {
		fail("Not yet implemented");
	}*/

	@Test
	void testDebitar() {
		double saldoinicial = 11.99;
	    double saque = 15.00;
	    double expected = -3.01;
	    Banco conta = new Banco("Mr. Jônatas Oliveira", saldoinicial);

	    // Debitar
	    conta.debitar(saque);

	    // Comparar
	    double atual = conta.getSaldo();
	    assertEquals(expected, atual, " Vericação ");
		//fail("Not yet implemented");
	}

	/*@Test
	void testCreditar() {
		fail("Not yet implemented");
	}*/

}
