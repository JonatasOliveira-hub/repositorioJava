package com.pjs.livraria.livraria.service;

import java.util.Optional;

import com.pjs.livraria.livraria.model.PedidoFornecedor;

public interface ServicoPedidoFornecedor {
	
	void pagamentoFornecedor();
	
	Optional <PedidoFornecedor> recuperarPedidoFornecedor(Long id);

}
