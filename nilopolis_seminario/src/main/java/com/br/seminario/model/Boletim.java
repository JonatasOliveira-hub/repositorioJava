package com.br.seminario.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Boletim {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Boletim;
	
	
	//private Aluno id_Matricula;
	
	
	//private Aluno Nome;
	
	
	private float Nota;
	
	
	private String Trimestre;
	
	@OneToMany(targetEntity = Disciplinas.class, cascade = CascadeType.ALL, mappedBy = "boletim")
	//@JoinColumn(name = "id_Disciplina")
	private List <Disciplinas> disciplinas;
 
	public int getId_Boletim() {
		return id_Boletim;
	}

	public void setId_Boletim(int id_Boletim) {
		this.id_Boletim = id_Boletim;
	}

	public float getNota() {
		return Nota;
	}

	public void setNota(float nota) {
		Nota = nota;
	}

	public String getTrimestre() {
		return Trimestre;
	}

	public void setTrimestre(String trimestre) {
		Trimestre = trimestre;
	}

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
		
}
