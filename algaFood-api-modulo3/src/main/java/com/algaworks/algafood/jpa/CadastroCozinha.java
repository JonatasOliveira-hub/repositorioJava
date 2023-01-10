package com.algaworks.algafood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Cozinha;

@Component
public class CadastroCozinha {

	@PersistenceContext
	private EntityManager manager;

	public List<Cozinha> listar() {
		TypedQuery<Cozinha> query = manager.createQuery("from Cozinha", Cozinha.class);
		return query.getResultList();
	}
	
	//Anotação para indicar que o método ocorre em uma transação.
	@Transactional
	public Cozinha salvar(Cozinha cozinha) {
		//merge retorna a instância persistida do objeto
		return manager.merge(cozinha);
	}
	
	public Cozinha buscarPorId(Long id) {
		//merge retorna a instância persistida do objeto
		return manager.find(Cozinha.class, id);
	}
	
	@Transactional
	public void remover(Cozinha cozinha) {
		cozinha = buscarPorId(cozinha.getId());
		manager.remove(cozinha);
	}
}
