package com.pjs.livraria.livraria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long codLivro;

	private String nomeLivro;
	
	private String nomeAutor;
	
	private String editora;
	
	private String quantidade;
	
	private int codDeBarras;

	public Long getCodLivro() {
		return codLivro;
	}

	public void setCodLivro(Long codLivro) {
		this.codLivro = codLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public int getCodDeBarras() {
		return codDeBarras;
	}

	public void setCodDeBarras(int codDeBarras) {
		this.codDeBarras = codDeBarras;
	}
}
