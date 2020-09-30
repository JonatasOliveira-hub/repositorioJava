package com.br.seminario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Historico {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Historico;
	
	/*@Column(name="Matricula")
	private Aluno id_Matricula;
	
	@Column(name="Nome")
	private Aluno Nome;
	*/
	@Column(name="Carga_Horaria")
	private Float Carga_horaria;
	
	/*@Column(name="Nota")
	private Boletim Nota;
	*/
	@Column(name="Ano_que_Cursou")
	private String Ano_Curso;
	

	public int getId() {
		return id_Historico;
	}

	public void setId(int id) {
		this.id_Historico = id;
	}


	public Float getCarga_horaria() {
		return Carga_horaria;
	}

	public void setCarga_horaria(Float carga_horaria) {
		Carga_horaria = carga_horaria;
	}

	public String getAno_Curso() {
		return Ano_Curso;
	}

	public void setAno_Curso(String ano_Curso) {
		Ano_Curso = ano_Curso;
	}
	
	
}
