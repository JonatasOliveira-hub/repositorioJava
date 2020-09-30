package modelo;


public class Aluno {

	Integer Id_Matricula;
	String Nome_Aluno;
	String RG;
	String Data_Nascimento;
	String Email;
	String Endereco;
	String Estado_Civil;
	int Celular;
	String Nome_Pai;
	String Nome_Mae;
	String Data_Ingeresso;
	float Nota;
	String Disciplinas;
	
	
	
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
	public float getNota() {
		return Nota;
	}
	public void setNota(float nota) {
		Nota = nota;
	}
	public String getDisciplinas() {
		return Disciplinas;
	}
	public void setDisciplinas(String disciplinas) {
		Disciplinas = disciplinas;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id_Matricula == null) ? 0 : Id_Matricula.hashCode());
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (Id_Matricula == null) {
			if (other.Id_Matricula != null)
				return false;
		} else if (!Id_Matricula.equals(other.Id_Matricula))
			return false;
		if (RG == null) {
			if (other.RG != null)
				return false;
		} else if (!RG.equals(other.RG))
			return false;
		return true;
	}
	
	
	
}
