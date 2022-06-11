package com.pjs.livraria.livraria.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjs.livraria.livraria.model.PedidoFornecedor;
import com.pjs.livraria.livraria.service.ServicoPedidoFornecedor;

@RestController
@RequestMapping("apiRest/v1/pedidoFornecedor")
public class ControllerPedidoFornecedor {

	@Autowired
	private ServicoPedidoFornecedor servicoPedidoFornecedor;
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<PedidoFornecedor>> consultarFornecedorById(@PathVariable Long id) {
		
		return ResponseEntity.status(HttpStatus.OK).body(servicoPedidoFornecedor.recuperarPedidoFornecedor(id));
	}
}
