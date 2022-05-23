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

	private Long quantidade;

	private int codDeBarras;

	private boolean defeito;

	private Long precoLivro;

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

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public int getCodDeBarras() {
		return codDeBarras;
	}

	public void setCodDeBarras(int codDeBarras) {
		this.codDeBarras = codDeBarras;
	}

	public boolean isDefeito() {
		return defeito;
	}

	public void setDefeito(boolean defeito) {
		this.defeito = defeito;
	}

	public Long getPrecoLivro() {
		return precoLivro;
	}

	public void setPrecoLivro(Long precoLivro) {
		this.precoLivro = precoLivro;
	}

}
