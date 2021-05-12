package br.com.springbatch.lerArquivoCsv;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//import lombok.Getter;
//import lombok.Setter;

/*Essa classe é um POJO. Essa classe será anotada como @Entity 
 *pois servirá a um duplo propósito: armazenar os dados lidos do arquivo 
 *e criar a tabela no banco de dados onde os dados serão armazenados.*/

@Entity
public class Aeronave implements Serializable {

	  private static final long serialVersionUID = 9058350955651091145L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable = false, unique = true)
	private String recordKey;

	@Column(nullable = false)
	private String nome;

	
	private String iataCodigo;

	private String icaoCodigo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(String recordKey) {
		this.recordKey = recordKey;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIataCodigo() {
		return iataCodigo;
	}

	public void setIataCodigo(String iataCodigo) {
		this.iataCodigo = iataCodigo;
	}

	public String getIcaoCodigo() {
		return icaoCodigo;
	}

	public void setIcaoCodigo(String icaoCodigo) {
		this.icaoCodigo = icaoCodigo;
	}
	
	
}
