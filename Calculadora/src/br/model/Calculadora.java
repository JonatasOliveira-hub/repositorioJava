package br.model;


import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
	
	double valor;
	
	public double somaSimples(double a, double b) {
		
		return a + b;	
	}
	
	public double somaComplexa(ArrayList<Double> cal) {
		double soma = 0;
		for(int i = 0; i < cal.size(); i++) {
			soma = soma + cal.get(i);
		}
		
		return soma;
		
	}
	
	public double subtracaoSimples(double a, double b) {
		double sub = 0;
		
		if(a < 0 && b < 0 ) {
			 sub = a + b;
		}else {
			if(a < 0 && b > 0) {
				sub =a + b;
			}
			else {
				if(a > 0 && b < 0) {
					sub = a + b;
				}
			}
		}
	return sub;	
	} 

	public double multiplicacaoSimples(double a, double b) {
		return a * b;
	}
	
	public double divisaoSimples(double a, double b) {
			
		if(b == 0) {
			throw new ArithmeticException("divisão por zero não pode");
		}
		
		return a/b;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Entre com os valores para soma: ");
		
		//Calculadora cal = new Calculadora();
		ArrayList<Double> cal = new ArrayList<Double>();
		
		Calculadora  test = new Calculadora();
		for(int i = 0; i < 8;i++) {
			Scanner ler = new Scanner(System.in);
			cal.add(ler.nextDouble());
		}
		
		double valor = test.somaComplexa(cal);
		System.out.println("Testando o código do main: " + valor);*/
		
		
		/*try {
			Calculadora cal = new Calculadora();
			
		 cal.divisaoSimples(2, 0);
			
			//System.out.println("Atual: " + atual + "\n" + "Esperado: " + esperado);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}*/
		

	}

}
