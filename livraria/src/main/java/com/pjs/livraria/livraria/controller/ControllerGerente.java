package com.pjs.livraria.livraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjs.livraria.livraria.model.Cliente;
import com.pjs.livraria.livraria.model.Livro;
import com.pjs.livraria.livraria.service.ServicoGerente;

@RestController
@RequestMapping("apiRest/v1/gerente")
public class ControllerGerente {

	@Autowired
	private ServicoGerente servicoGerente;

	@PostMapping("/registrarCliente")
	public ResponseEntity<Cliente> registrarCliente(@RequestBody Cliente cliente) {
		return ResponseEntity.status(HttpStatus.CREATED).body(servicoGerente.registrarCliente(cliente));
	}

	@GetMapping("/consultarCliente")
	public ResponseEntity<List<Cliente>> consultarCliente() {
		return ResponseEntity.status(HttpStatus.OK).body(servicoGerente.listarCliente());
	}

	@PostMapping("/contatarFornecedor")
	public ResponseEntity<Livro> contatarFornecedor(@RequestBody Livro livro) {
		return ResponseEntity.status(HttpStatus.OK).body(servicoGerente.contatarFornecedor(livro));
	}

	@GetMapping("/verificarLivro")
	public ResponseEntity<String> verificarLivro(@RequestBody Livro livro) {
		return ResponseEntity.status(HttpStatus.OK).body(servicoGerente.verificarLivro(livro));
	}

	@PutMapping
	public ResponseEntity<?> realizarTrocaDeLivros() {
		servicoGerente.realizarTrocaDeLivros();
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@PostMapping
	public ResponseEntity<?> encomendarLivros(@RequestBody Livro livro) {
		servicoGerente.encomendarLivros(livro);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
