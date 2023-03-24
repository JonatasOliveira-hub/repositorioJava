package com.algaworks.algafood.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algaworks.algafood.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.exception.RestauranteNaoEncontradoException;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository repository;

	@Autowired
	private CozinhaRepository cozinhaRepository;

	public Restaurante salvar(Restaurante restaurante) {

		final Long idCozinha = restaurante.getCozinha().getId();
		final Cozinha cozinha = cozinhaRepository.buscarPorId(idCozinha);

		// Se a cozinha não existir, lance exceção.
		if (cozinha == null) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe cozinha cadastrada com o código %d.", idCozinha));
		}

		restaurante.setCozinha(cozinha);
		return repository.salvar(restaurante);
	}

	public List<Restaurante> listarRestaurantes() {
		return repository.listar();
	};

	public Restaurante buscarPorId(Long id) {
		return repository.buscarPorId(id);
	}

	public Restaurante atualizar(Long restauranteId, Restaurante restaurante) {

		final Restaurante restauranteAtual = buscarPorId(restauranteId);
		final Long idCozinha = restaurante.getCozinha().getId();
		final Cozinha cozinha = cozinhaRepository.buscarPorId(idCozinha);

		// Se a cozinha não existir, lance exceção.
		if (cozinha == null) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe cozinha cadastrada com o código %d.", idCozinha));
		}
		
		// Se o restaurante não existe, lance exceção
		if (restauranteAtual == null) {
			throw new RestauranteNaoEncontradoException(
					String.format("Não existe restaurante cadastrado com o código %d.", restauranteId));
		}
		restauranteAtual.setCozinha(cozinha);
		restauranteAtual.setNome(restaurante.getNome());
		restauranteAtual.setTaxaFrete(restaurante.getTaxaFrete());
		return repository.salvar(restauranteAtual);
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
