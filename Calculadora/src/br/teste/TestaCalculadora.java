package br.teste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.model.Calculadora;

class TestaCalculadora {

	/*@Test
	void testarSoma() {
		
		
			//Preparação - preparar os valores a serem passados ao método
		double a = 86;
		double b = 9;
		double esperado = 95;
		
		//Acão - chmar o método a ser terstado
		Calculadora cal = new Calculadora();
		double atual = cal.somaSimples(a, b);
				
		//validação
		assertEquals(esperado, atual, "Soma simples deu certo !");		
	}

	@Test
	void testarSomadeMuitosValores() {
		
		//Preparação - preparar os valores a serem passados ao método
		ArrayList<Double> numeros = new ArrayList<Double>() {
			{
				add(1.6);
				add(2.0);
			}
		};
		
		double esperado = 3.6;
		
		//Acão - chmar o método a ser terstado
		Calculadora cal =  new Calculadora();
		double atual = cal.somaComplexa(numeros);
		
		//validação
		assertEquals(esperado, atual);
		
		
	}

	@Test
	void testarSubtracaoSimples() {
		
		//Preparação - preparar os valores a serem passados ao método
		double a = 5;
		double b = -80;
		double esperado = -75;
		
		//Acão - chmar o método a ser terstado
		Calculadora cal = new Calculadora();
		double atual = cal.subtracaoSimples(a, b);
		
		System.out.println("Atual: " + atual + "Esperado: " + esperado);
		//validação
		assertEquals(esperado, atual, "Subtração simples deu certo !");
		
	}
	
	@Test
	void testarMultiplicacaoSimples() {
		
		//Preparação - preparar os valores a serem passados ao método
		double a = -5;
		double b = 0.8;
		double esperado = -4.0;
		
		//Acão - chmar o método a ser terstado
		Calculadora cal = new Calculadora();
		double atual = cal.multiplicacaoSimples(a, b);
		
		System.out.println("Atual: " + atual + "Esperado: " + esperado);
		
		//validação
		assertEquals(esperado, atual, "Subtração simples deu certo !");
		
	}*/
	
	@Test
	void testarDivisaoSimples() {
		
		//Preparação - preparar os valores a serem passados ao método
		double a = -4;
		double b = 0;
		double esperado = 0;
		
		//Acão - chmar o método a ser terstado
		try {
			Calculadora cal = new Calculadora();
			
			double atual = cal.divisaoSimples(a, b);
			
			System.out.println("Atual: " + atual + "\n" + "Esperado: " + esperado);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		//validação
		
		
	}
	
}
