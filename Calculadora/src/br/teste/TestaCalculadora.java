package br.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.model.Calculadora;

class TestaCalculadora {

	/*@Test
	void testarSoma() {
		
		
			//Prepara��o - preparar os valores a serem passados ao m�todo
		double a = 86;
		double b = 9;
		double esperado = 95;
		
		//Ac�o - chmar o m�todo a ser terstado
		Calculadora cal = new Calculadora();
		double atual = cal.somaSimples(a, b);
				
		//valida��o
		assertEquals(esperado, atual, "Soma simples deu certo !");		
	}

	@Test
	void testarSomadeMuitosValores() {
		
		//Prepara��o - preparar os valores a serem passados ao m�todo
		ArrayList<Double> numeros = new ArrayList<Double>() {
			{
				add(1.6);
				add(2.0);
			}
		};
		
		double esperado = 3.6;
		
		//Ac�o - chmar o m�todo a ser terstado
		Calculadora cal =  new Calculadora();
		double atual = cal.somaComplexa(numeros);
		
		//valida��o
		assertEquals(esperado, atual);
		
		
	}

	@Test
	void testarSubtracaoSimples() {
		
		//Prepara��o - preparar os valores a serem passados ao m�todo
		double a = 5;
		double b = -80;
		double esperado = -75;
		
		//Ac�o - chmar o m�todo a ser terstado
		Calculadora cal = new Calculadora();
		double atual = cal.subtracaoSimples(a, b);
		
		System.out.println("Atual: " + atual + "Esperado: " + esperado);
		//valida��o
		assertEquals(esperado, atual, "Subtra��o simples deu certo !");
		
	}
	
	@Test
	void testarMultiplicacaoSimples() {
		
		//Prepara��o - preparar os valores a serem passados ao m�todo
		double a = -5;
		double b = 0.8;
		double esperado = -4.0;
		
		//Ac�o - chmar o m�todo a ser terstado
		Calculadora cal = new Calculadora();
		double atual = cal.multiplicacaoSimples(a, b);
		
		System.out.println("Atual: " + atual + "Esperado: " + esperado);
		
		//valida��o
		assertEquals(esperado, atual, "Subtra��o simples deu certo !");
		
	}*/
	
	@Test
	void testarDivisaoSimples() {
		
		//Prepara��o - preparar os valores a serem passados ao m�todo
		double a = -4;
		double b = 0;
		double esperado = 0;
		
		//Ac�o - chmar o m�todo a ser terstado
		try {
			Calculadora cal = new Calculadora();
			
			double atual = cal.divisaoSimples(a, b);
			
			System.out.println("Atual: " + atual + "\n" + "Esperado: " + esperado);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		//valida��o
		
		
	}
	
}
