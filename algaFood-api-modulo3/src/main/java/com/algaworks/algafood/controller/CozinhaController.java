package com.algaworks.algafood.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.service.CadastroCozinhaService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@RestController
@RequestMapping(value = "/cozinhas", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
public class CozinhaController {

	@Autowired
	private CozinhaRepository repository;
	
	@Autowired
	private CadastroCozinhaService cozinhaService;

	@GetMapping
	public List<Cozinha> listarTodasCozinhas() {

		return repository.listar();

	}

	@GetMapping("/{cozinhaId}")
	public Cozinha buscar(@PathVariable Long cozinhaId) {

		return repository.buscarPorId(cozinhaId);

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

		Cozinha cozinhaAtual = repository.buscarPorId(cozinhaId);

		if (cozinhaAtual != null) {
			cozinhaAtual.setNome(cozinha.getNome());

			repository.salvar(cozinhaAtual);

			return ResponseEntity.ok(cozinhaAtual);
		}

		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> removerCozinha(@PathVariable Long cozinhaId) {

		try {
			Cozinha cozinhaAtual = repository.buscarPorId(cozinhaId);

			if (cozinhaAtual != null) {
				repository.remover(cozinhaAtual);

				return ResponseEntity.noContent().build();
			}

			return ResponseEntity.notFound().build();
		} catch (DataIntegrityViolationException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}

	}
}
