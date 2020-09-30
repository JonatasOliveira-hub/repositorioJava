package com.br.seminario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Aluno")
public class Aluno {

	@Id
	private Integer Id_Matricula;
	
	@Column(name="Nome")
	private String Nome;
	
	@Column(name="Rg")
	private String RG;
	
	@Column(name="Cpf")
	private String Cpf;
	
	@Column(name="Data_Nascimeto")
	private String Data_Nascimento;
	
	@Column(name="Email")
	private String Email;
	
	@Column(name="Endereco")
	private String Endereco;
	
	@Column(name="Est_Civil")
	private String Estado_Civil;
	
	@Column(name="Cel")
	private int Celular;
	
	@Column(name="NomePai")
	private String Nome_Pai;
	
	@Column(name="NomeMae")
	private String Nome_mae;
	
	@Column(name="Data_Ingresso")
	private String Data_Ingresso;
	 
	//@Column(name="Nota")
	//private Boletim id_boletim;
	
	
	
	public Integer getId_Matricula() {
		return Id_Matricula;
	}
	public void setId_Matricula(Integer id_Matricula) {
		Id_Matricula = id_Matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
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
	public String getNome_mae() {
		return Nome_mae;
	}
	public void setNome_mae(String nome_mae) {
		Nome_mae = nome_mae;
	}
	public String getData_Ingresso() {
		return Data_Ingresso;
	}
	public void setData_Ingresso(String data_Ingresso) {
		Data_Ingresso = data_Ingresso;
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
