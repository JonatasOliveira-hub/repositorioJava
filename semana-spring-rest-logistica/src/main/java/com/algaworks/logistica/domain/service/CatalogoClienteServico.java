package com.algaworks.logistica.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.logistica.domain.exception.NegocioException;
import com.algaworks.logistica.domain.model.Cliente;
import com.algaworks.logistica.domain.repository.RepositorioCliente;

/*Classe reponsavel por gerenciar o cliente
 * 
 * @Service indica que a classe tem a 
 * semântica de um serviço, onde colocamos
 * regras de negócio.
 */

@Service
public class CatalogoClienteServico {

	@Autowired
	private RepositorioCliente repositorioCliente;

	@Transactional
	public Cliente salvar(Cliente cliente) {

		boolean emailEmUso = repositorioCliente.findByEmail(cliente.getEmail()).stream()
				.anyMatch(clienteExistente -> !clienteExistente.equals(cliente));
		if (emailEmUso) {
			throw new NegocioException("Já existe um cliente cadastrado com esse e-mail.");
		}
		return repositorioCliente.save(cliente);
	}

	@Transactional
	public void excluir(Long clienteId) {
		repositorioCliente.deleteById(clienteId);
	}
}
