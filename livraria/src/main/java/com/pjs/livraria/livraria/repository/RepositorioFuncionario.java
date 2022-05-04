package com.pjs.livraria.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjs.livraria.livraria.model.Cliente;

/* Interface que extende a classe que tem os métodos de acesso 
 * ao banco. O nome desse padrão é Repository.
 * Sua real função é trabalhar como uma porta ou janela 
 * de acesso a outra camada, que poderia ser o DAO.
 * 
 * 
 * O repositório de Funcionário, gerencia um cliente, executando o método 
 * registrarCliente. */
public interface RepositorioFuncionario extends JpaRepository<Cliente, Long>{
	
}
