package br.csv;

import java.io.FileWriter;
import java.util.List;

public class Transforma_CSV {

	public static void tocsv(List<String> lista, String arq) {
	
		try {
			FileWriter writer = new FileWriter(arq);
			writer.append("Nomes");
			for(int i=0; i<lista.size();i++) {
				writer.append(lista.get(i).toString());
			}
			writer.flush();
			writer.close();
		}catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}
}
