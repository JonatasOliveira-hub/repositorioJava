package br.com.springbatch.lerArquivoCsv;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.expression.ParseException;

/*Essa classe recebe a informação de uma 
 * única linha do arquivo e lê cada campo 
 * baseado em sua posição na linha*/

public class AeronaveMapeamento  implements FieldSetMapper<Aeronave> {
	
	 public Aeronave mapFieldSet(FieldSet campoArquivo) throws ParseException{
		 	Aeronave aer = new Aeronave();
		 	aer.setIataCodigo(campoArquivo.readString(0));
		 	aer.setIcaoCodigo(campoArquivo.readString(1));
		 	aer.setNome(campoArquivo.readString(2));
		 	return aer;
		  }

	
	}

