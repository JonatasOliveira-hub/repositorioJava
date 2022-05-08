package com.pjs.livraria.livraria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long codFornecedor;
	private String nomeFantasia;
	private int cnpj;
	
	public Long getCodFornecedor() {
		return codFornecedor;
	}
	public void setCodFornecedor(Long codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
}
