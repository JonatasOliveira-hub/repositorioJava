package com.algaworks.logistica.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.logistica.domain.model.Cliente;
import com.algaworks.logistica.domain.repository.RepositorioCliente;
import com.algaworks.logistica.domain.service.CatalogoClienteServico;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private RepositorioCliente repositorioCliente;

	@Autowired
	private CatalogoClienteServico calatogoCliente;
	
	@GetMapping
	public List<Cliente> findAll() {
		return repositorioCliente.findAll();
	}

	@GetMapping("/{clienteId}")
	public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {

		return repositorioCliente.findById(clienteId).map(cliente -> ResponseEntity.ok(cliente))
				.orElse(ResponseEntity.notFound().build());

		/*
		 * Optional <Cliente> cliente = repositorioCliente.findById(clienteId); if
		 * (cliente.isPresent()) { return ResponseEntity.ok(cliente.get()); } return
		 * ResponseEntity.notFound().build();
		 */
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@Valid @RequestBody Cliente cliente) {

		return calatogoCliente.salvar(cliente);
	}

	@PutMapping("/{clienteId}")
	public ResponseEntity<Cliente> atualizar(@Valid @PathVariable Long clienteId,
			@RequestBody Cliente cliente) {

		if (!repositorioCliente.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}
		
		cliente.setId(clienteId);
		cliente = calatogoCliente.salvar(cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@DeleteMapping("/{clienteId}")
	public ResponseEntity<Void> remover (@PathVariable Long clienteId){
		if (!repositorioCliente.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}
		
		calatogoCliente.excluir(clienteId);
		return ResponseEntity.noContent().build();
	}
}
