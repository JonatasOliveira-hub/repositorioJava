package com.pjs.livraria.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjs.livraria.livraria.model.Cliente;
import com.pjs.livraria.livraria.service.ServicoVendedor;

@RestController
@RequestMapping("apiRest/v1/cliente")
public class ControllerVendedor {

	@Autowired
	private ServicoVendedor servicoVendedor;

	@PostMapping
	public ResponseEntity<Cliente> registrarCliente(@RequestBody Cliente cliente) {
		return ResponseEntity.status(HttpStatus.CREATED).body(servicoVendedor.registrarCliente(cliente));
	}
	
}
