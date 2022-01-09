package com.ecossistema.spring.restapi.service;

import java.util.List;
import java.util.Optional;

import com.ecossistema.spring.restapi.model.Produto;

/*Não entendi o pq dessa classe.
 * Agora entendi. A classe JpaRepository, tem muitos métodos,
 * e não precisamos de todos na aplicação. Com isso, como é
 * um CRUD, vamos utilizar somente esses que estão aqui descritos
 * abaixo.*/
public interface ServicoProduto {

	Produto salvar(Produto produto);
	
	List<Produto> findAll();
	
	Optional<Produto> findById(Long id);
	
	Produto atulizar(Produto produto);
	
	void excluirPorId(Long id);
}
