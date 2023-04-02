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
import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.service.CadastroCidadeService;

@RestController
@RequestMapping(value = "/cidades", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
public class CidadeController {

	@Autowired
	private CadastroCidadeService cidadeService;

	@GetMapping
	public List<Cidade> listarTodasCozinhas() {

		return cidadeService.listarCidades();

	}

	@GetMapping("/{cidadeId}")
	public Cidade buscar(@PathVariable Long cozinhaId) {

		return cidadeService.buscarCidade(cozinhaId).get();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	// @RequestBody - Faz o Bind do objeto recebido para o tipo Java
	public Cidade adicionar(@RequestBody Cidade cidade) {

		return cidadeService.salvar(cidade);
	}

	@PutMapping("/{cidadeId}")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Cidade> atualizarCozinha(@PathVariable Long cidadeId, @RequestBody Cidade cidade) {

		Optional<Cidade> cidadeAtual = cidadeService.buscarCidade(cidadeId);

		if (cidadeAtual.isPresent()) {
			cidadeAtual.get().setNome(cidade.getNome());

			cidadeService.salvar(cidadeAtual.get());

			return ResponseEntity.ok(cidadeAtual.get());
		}

		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> removerCozinha(@PathVariable Long cozinhaId) {

		try {

			cidadeService.excluir(cozinhaId);

			return ResponseEntity.noContent().build();

		} catch (EntidadeNaoEncontradaException e) {
			return ResponseEntity.notFound().build();

		} catch (EntidadeEmUsoException e) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}

	}
}
