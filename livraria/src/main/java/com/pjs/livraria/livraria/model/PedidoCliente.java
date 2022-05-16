package com.pjs.livraria.livraria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PedidoCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long codPedidoCliente;

	public Long getCodPedidoCliente() {
		return codPedidoCliente;
	}

	public void setCodPedidoCliente(Long codPedidoCliente) {
		this.codPedidoCliente = codPedidoCliente;
	}

}
