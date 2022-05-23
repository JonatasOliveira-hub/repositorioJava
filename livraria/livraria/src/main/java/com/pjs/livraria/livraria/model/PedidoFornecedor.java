package com.pjs.livraria.livraria.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PedidoFornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long codPedFornecedor;
	private Date dataRecebimento;
	
	public Long getCodPedFornecedor() {
		return codPedFornecedor;
	}
	public void setCodPedFornecedor(Long codPedFornecedor) {
		this.codPedFornecedor = codPedFornecedor;
	}
	public Date getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	
}
