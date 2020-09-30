package seminario.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boletim implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_boletim")
	private int id;
	
	@Column(name = "Matricula")
	private Aluno Id_Matricula;
	
	@Column(name = "Nome")
	private Aluno Nome_Aluno;
	
	@Column(name = "Nota")
	private float Nota_aluno;
	
	@Column(name = "Trimestre")
	private String Trimestre;
	
	@Column(name = "Disciplina")
	private Aluno Disciplinas;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Aluno getId_Matricula() {
		return Id_Matricula;
	}
	public void setId_Matricula(Aluno id_Matricula) {
		Id_Matricula = id_Matricula;
	}
	
	public Aluno getNome_Aluno() {
		return Nome_Aluno;
	}
	public void setNome_Aluno(Aluno nome_Aluno) {
		Nome_Aluno = nome_Aluno;
	}
	
	public float getNota_aluno() {
		return Nota_aluno;
	}
	public void setNota_aluno(float nota_aluno) {
		Nota_aluno = nota_aluno;
	}
	
	public String getTrimestre() {
		return Trimestre;
	}
	public void setTrimestre(String trimestre) {
		Trimestre = trimestre;
	}
	
	public Aluno getDisciplinas() {
		return Disciplinas;
	}
	public void setDisciplinas(Aluno disciplinas) {
		Disciplinas = disciplinas;
	}
	
	

}
