package com.algaworks.algafood.domain.repository;

import java.util.List;

import com.algaworks.algafood.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();

	Restaurante salvar(Restaurante restaurante);

	Restaurante buscarPorId(Long id);

	void remover(Restaurante restaurante);
}
