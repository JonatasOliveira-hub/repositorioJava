package com.pjs.livraria.livraria.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RestController;

import com.pjs.livraria.livraria.model.Fornecedor;
import com.pjs.livraria.livraria.service.ServicoFornecedor;

@RestController
@RequestMapping("apiRest/v1/fornecedor")
public class ControllerFornecedor {

	@Autowired
	private ServicoFornecedor servicoFornecedor;


	@GetMapping
	public ResponseEntity<List<Fornecedor>> consultarFornecedor() {
		return ResponseEntity.status(HttpStatus.OK).body(servicoFornecedor.consultarFornecedor());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Fornecedor>> consultarFornecedorById(@PathVariable Long id) {
		// O @PathVariable é utilizado quando o valor da variável é passada diretamente
		// na URL
		return ResponseEntity.status(HttpStatus.OK).body(servicoFornecedor.consultarFornecedorById(id));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> excluirFornecedor(@PathVariable Long id) {
		servicoFornecedor.excluirFornecedor(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@PutMapping
	public ResponseEntity<Fornecedor> alterarFornecedor(@RequestBody Fornecedor fornecedor) {
		return ResponseEntity.status(HttpStatus.OK).body(servicoFornecedor.alterarFornecedor(fornecedor));
	}
	
	@PostMapping
	public ResponseEntity<Fornecedor> inserirFornecedor(@RequestBody Fornecedor fornecedo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(servicoFornecedor.inserirFornecedor(fornecedo));
	}

	

	
}
