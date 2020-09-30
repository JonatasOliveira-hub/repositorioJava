package br.csv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		for(int i=0; i < 3; i++) {
			System.out.println("Entre com seu nome: ");
			Scanner ler = new Scanner(System.in);
			lista.add(ler.nextLine());
		}
		String cam = "C:\\Users\\JONATAS\\Desktop\\Programas";
		Transforma_CSV tcsv = new Transforma_CSV();
		tcsv.tocsv(lista, cam);
		
		
		 /*Iterator it = lista.iterator();
		    while (it.hasNext()) {
		        System.out.println(it.next());
		  }*/
		// tocsv("c:\\test.csv"); 
	}

}
