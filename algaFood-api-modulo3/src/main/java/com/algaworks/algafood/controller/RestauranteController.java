package com.algaworks.algafood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.service.CadastroRestauranteService;

@RestController
@RequestMapping(value = "/restaurantes", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE })
public class RestauranteController {

	@Autowired
	private CadastroRestauranteService serviceRestaurante;

	@GetMapping
	public List<Restaurante> listar() {

		return serviceRestaurante.listarRestaurantes();
	}

	@GetMapping("/{idRestautante}")
	public Restaurante listarRestaurantePorId(@PathVariable Long idRestautante) {

		return serviceRestaurante.buscarPorId(idRestautante);
	}

	@PostMapping
	public ResponseEntity<?> salvarRestaurante(@RequestBody Restaurante restaurante) {

		try {
			restaurante = serviceRestaurante.salvar(restaurante);

			return ResponseEntity.status(HttpStatus.CREATED).body(restaurante);
		} catch (EntidadeNaoEncontradaException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
