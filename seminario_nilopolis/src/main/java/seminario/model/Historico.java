package seminario.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Historico implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_historico")
	private int id;
	
	@Column(name = "Matricula")
	private Aluno Id_Matricula;
	
	@Column(name = "Nome")
	private Aluno Nome_Aluno;
	
	@Column(name = "Disciplina")
	private Aluno Disciplinas;
	
	@Column(name = "Carga_horaria")
	private int Carga_Horaria;
	
	@Column(name = "Nota_do_aluno")
	private float Nota_aluno;
	
	@Column(name = "Ano_do_curso")
	private int Ano_Curso;
	
	
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
	
	public Aluno getDisciplinas() {
		return Disciplinas;
	}
	public void setDisciplinas(Aluno disciplinas) {
		Disciplinas = disciplinas;
	}
	
	public int getCarga_Horaria() {
		return Carga_Horaria;
	}
	public void setCarga_Horaria(int carga_Horaria) {
		Carga_Horaria = carga_Horaria;
	}
	
	public float getNota_aluno() {
		return Nota_aluno;
	}
	public void setNota_aluno(float nota_aluno) {
		Nota_aluno = nota_aluno;
	}
	
	public int getAno_Curso() {
		return Ano_Curso;
	}
	public void setAno_Curso(int ano_Curso) {
		Ano_Curso = ano_Curso;
	}
	
}
