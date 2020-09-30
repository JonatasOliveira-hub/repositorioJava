package modelo;

public class Historico {

	Integer Id_Matricula;
	String Nome_Aluno;
	String Disciplinas;
	int Carga_Horaria;
	float Nota_aluno;
	int Ano_Curso;
	
	
	public Integer getId_Matricula() {
		return Id_Matricula;
	}
	public void setId_Matricula(Integer id_Matricula) {
		Id_Matricula = id_Matricula;
	}
	public String getNome_Aluno() {
		return Nome_Aluno;
	}
	public void setNome_Aluno(String nome_Aluno) {
		Nome_Aluno = nome_Aluno;
	}
	public String getDisciplinas() {
		return Disciplinas;
	}
	public void setDisciplinas(String disciplinas) {
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
