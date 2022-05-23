package com.pjs.livraria.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjs.livraria.livraria.repository.RepositorioPedidoCliente;

@Service
public class ServicoPedidoClienteImpl implements ServicoPedidoCliente {

	@Autowired
	private RepositorioPedidoCliente repositorioPedidoCliente;

	@Override
	public void pagamentoCliente() {

		
	}

}
