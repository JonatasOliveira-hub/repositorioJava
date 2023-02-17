package com.algaworks.algafood.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algaworks.algafood.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository repository;

	public Restaurante salvar(Restaurante restaurante) {

		return repository.salvar(restaurante);
	}

	public List<Restaurante> listarRestaurantes() {
		return repository.listar();
	};

	public Restaurante buscarPorId(Long id) {
		return repository.buscarPorId(id);
	}

	public void excluir(Restaurante restaurante) {

		try {
			repository.remover(restaurante);
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe um cadastro de cozinha com o código %d.", restaurante.getId()));
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(String
					.format("Cozinha de código %d não pode ser removida, pois está em uso.", restaurante.getId()));
		}
	}
}
