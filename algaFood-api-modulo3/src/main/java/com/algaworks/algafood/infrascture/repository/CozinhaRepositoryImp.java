package com.algaworks.algafood.infrascture.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

@Component
public class CozinhaRepositoryImp implements CozinhaRepository {

	@PersistenceContext
	private EntityManager manager;

	public List<Cozinha> listar() {
		TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class);
		return query.getResultList();
	}

	// Anotação para indicar que o método ocorre em uma transação.
	@Transactional
	public Cozinha salvar(Cozinha cozinha) {
		// merge retorna a instância persistida do objeto
		return manager.merge(cozinha);
	}

	public Cozinha buscarPorId(Long id) {
		// merge retorna a instância persistida do objeto
		return manager.find(Cozinha.class, id);
	}

	@Transactional
	public void remover(Long id) {
		Cozinha cozinha = buscarPorId(id);

		if (cozinha == null) {
			throw new EmptyResultDataAccessException(1);
		}
		manager.remove(cozinha);
	}
}
