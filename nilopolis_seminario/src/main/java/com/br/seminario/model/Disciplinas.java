package com.br.seminario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Disciplinas {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Disciplina;
	
	@Column
	private String nome_disciplina;
	
	@ManyToOne
	private Boletim boletim;
	

	public int getId() {
		return id_Disciplina;
	}

	public void setId(int id) {
		this.id_Disciplina = id;
	}

	public String getNome_disciplina() {
		return nome_disciplina;
	}

	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}

	
}
