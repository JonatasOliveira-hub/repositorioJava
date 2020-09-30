package seminario.model;

import java.io.Serializable; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Aluno implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Matricula")
	private Integer Id_Matricula;
	
	@Column(name = "Nome")
	private String Nome_Aluno;
	
	@Column(name = "RG")
	private String RG;
	
	@Column(name = "Data_de_Nascimento")
	private String Data_Nascimento;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Endereco")
	private String Endereco;
	
	@Column(name = "Estado_Civil")
	private String Estado_Civil;
	
	@Column(name = "Celular")
	private int Celular;
	
	@Column(name = "Nome_do_Pai")
	private String Nome_Pai;
	
	@Column(name = "Nome_da_Mae")
	private String Nome_Mae;
	
	@Column(name = "Data_de_Ingresso")
	private String Data_Ingeresso;
	
	@OneToOne()
	@JoinColumn(name = "Boletim")
	private Boletim Nota;
	
	@OneToOne()
	@JoinColumn(name = "Historico")
	private Historico Disciplinas;
	
	public Aluno() {
	}
	
	public Aluno(Integer id_Matricula, String nome_Aluno) {
		super();
		Id_Matricula = id_Matricula;
		Nome_Aluno = nome_Aluno;
	}
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
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getData_Nascimento() {
		return Data_Nascimento;
	}
	public void setData_Nascimento(String data_Nascimento) {
		Data_Nascimento = data_Nascimento;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getEstado_Civil() {
		return Estado_Civil;
	}
	public void setEstado_Civil(String estado_Civil) {
		Estado_Civil = estado_Civil;
	}
	public int getCelular() {
		return Celular;
	}
	public void setCelular(int celular) {
		Celular = celular;
	}
	public String getNome_Pai() {
		return Nome_Pai;
	}
	public void setNome_Pai(String nome_Pai) {
		Nome_Pai = nome_Pai;
	}
	public String getNome_Mae() {
		return Nome_Mae;
	}
	public void setNome_Mae(String nome_Mae) {
		Nome_Mae = nome_Mae;
	}
	public String getData_Ingeresso() {
		return Data_Ingeresso;
	}
	public void setData_Ingeresso(String data_Ingeresso) {
		Data_Ingeresso = data_Ingeresso;
	}
	public Boletim getNota() {
		return Nota;
	}
	public void setNota(Boletim nota) {
		Nota = nota;
	}
	public Historico getDisciplinas() {
		return Disciplinas;
	}
	public void setDisciplinas(Historico disciplinas) {
		Disciplinas = disciplinas;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Id_Matricula+" "+Nome_Aluno;
	}
}
