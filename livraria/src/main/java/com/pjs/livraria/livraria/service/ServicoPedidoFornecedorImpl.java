package com.pjs.livraria.livraria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pjs.livraria.livraria.model.PedidoFornecedor;
import com.pjs.livraria.livraria.repository.RepositorioPedidoFornecedor;

public class ServicoPedidoFornecedorImpl implements ServicoPedidoFornecedor {

	@Autowired
	RepositorioPedidoFornecedor repositorioPedidoFornecedor;

	@Override
	public void pagamentoFornecedor() {
		System.out.println("Pagamento Efetuado");
		System.out.println("Pagamento Aprovado!");
	}

	@Override
	public Optional <PedidoFornecedor> recuperarPedidoFornecedor(Long id) {
		return repositorioPedidoFornecedor.findById(id);
	}

}
