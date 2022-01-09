package com.ecossistema.spring.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecossistema.spring.restapi.model.Produto;

/*Interface que extende a classe que tem os métodos de acesso 
 * ao banco. O nome desse padrão é Repository.
 * Sua real função é trabalhar como uma porta ou janela 
 * de acesso a outra camada, que poderia ser o DAO.*/
public interface RepositorioProduto extends JpaRepository<Produto, Long> {

}
