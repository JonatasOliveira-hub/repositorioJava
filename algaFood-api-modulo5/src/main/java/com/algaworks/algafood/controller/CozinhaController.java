package com.algaworks.algafood.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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

import com.algaworks.algafood.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.service.CadastroCozinhaService;

@RestController
@RequestMapping(value = "/cozinhas", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
public class CozinhaController {

	@Autowired
	private CadastroCozinhaService cozinhaService;

	@GetMapping
	public List<Cozinha> listarTodasCozinhas() {

		return cozinhaService.listarCozinhas();

	}

	@GetMapping("/{cozinhaId}")
	public Cozinha buscar(@PathVariable Long cozinhaId) {

		return cozinhaService.listarCozinha(cozinhaId).get();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	// @RequestBody - Faz o Bind do objeto recebido para o tipo Java
	public Cozinha adicionar(@RequestBody Cozinha cozinha) {

		return cozinhaService.salvar(cozinha);
	}

	@PutMapping("/{cozinhaId}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Cozinha> atualizarCozinha(@PathVariable Long cozinhaId, @RequestBody Cozinha cozinha) {
		// BeanUtils.copyProperties(cozinhaId, cozinha, "id");

		Optional<Cozinha> cozinhaAtual = cozinhaService.listarCozinha(cozinhaId);

		if (cozinhaAtual.isPresent()) {
			cozinhaAtual.get().setNome(cozinha.getNome());

			cozinhaService.salvar(cozinhaAtual.get());

			return ResponseEntity.ok(cozinhaAtual.get());
		}

		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> removerCozinha(@PathVariable Long cozinhaId) {

		try {

			cozinhaService.excluir(cozinhaId);

			return ResponseEntity.noContent().build();

		} catch (EntidadeNaoEncontradaException e) {
			return ResponseEntity.notFound().build();

		} catch (EntidadeEmUsoException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}

	}
}
