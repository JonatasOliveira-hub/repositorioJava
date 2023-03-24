package com.algaworks.algafood.infrascture.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

@Component
public class RestauranteRepositoryImp implements RestauranteRepository {

	@PersistenceContext
	private EntityManager manager;

	public List<Restaurante> listar() {
		TypedQuery<Restaurante> query = manager.createQuery("from Restaurante", Restaurante.class);
		return query.getResultList();
	}
	
	//Anotação para indicar que o método ocorre em uma transação.
	@Transactional
	public Restaurante salvar(Restaurante restaurante) {
		//merge retorna a instância persistida do objeto
		return manager.merge(restaurante);
	}
	
	public Restaurante buscarPorId(Long id) {
		//merge retorna a instância persistida do objeto
		return manager.find(Restaurante.class, id);
	}
	
	@Transactional
	public void remover(Restaurante restaurante) {
		restaurante = buscarPorId(restaurante.getId());
		manager.remove(restaurante);
	}
}
