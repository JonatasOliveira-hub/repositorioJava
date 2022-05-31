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

import com.pjs.livraria.livraria.model.Livro;
import com.pjs.livraria.livraria.service.ServicoLivro;

@RestController
@RequestMapping("apiRest/v1/livros")
public class ControllerLivro {

	@Autowired
	private ServicoLivro servicoLivro;

	@GetMapping
	public ResponseEntity<List<Livro>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(servicoLivro.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Livro>> findById(@PathVariable Long id) {
		// O @PathVariable é utilizado quando o valor da variável é passada diretamente
		// na URL
		return ResponseEntity.status(HttpStatus.OK).body(servicoLivro.consultarLivroById(id));
	}

	@PostMapping
	public ResponseEntity<Livro> create(@RequestBody Livro livro) {
		return ResponseEntity.status(HttpStatus.CREATED).body(servicoLivro.inserirLivro(livro));
	}

	@PutMapping
	public ResponseEntity<Livro> update(@RequestBody Livro livro) {
		return ResponseEntity.status(HttpStatus.OK).body(servicoLivro.alterarLivro(livro));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		servicoLivro.excluirLivroPorId(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
