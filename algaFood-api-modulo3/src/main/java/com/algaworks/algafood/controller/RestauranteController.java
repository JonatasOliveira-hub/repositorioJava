package com.algaworks.algafood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.service.CadastroRestauranteService;


@RestController
@RequestMapping(value ="/restaurantes" , produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class RestauranteController {

	@Autowired
	private CadastroRestauranteService serviceRestaurante;

	@GetMapping
	public List<Restaurante> listar() {
		
		return serviceRestaurante.listarRestaurantes();

	}
	
	@GetMapping("/{restauranteId}")
	public Restaurante listarRestaurantePorId(@PathVariable Long idRestautante) {
		
		return serviceRestaurante.buscarPorId(idRestautante);

	}
}
