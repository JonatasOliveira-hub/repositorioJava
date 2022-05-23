package com.pjs.livraria.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjs.livraria.livraria.model.Cliente;
import com.pjs.livraria.livraria.repository.RepositorioFuncionario;

@Service
public class ServicoVendedorImpl implements ServicoVendedor {

	@Autowired
	private RepositorioFuncionario repositorioFuncionario;

	@Override
	public Cliente registrarCliente(Cliente cliente) {
		return repositorioFuncionario.save(cliente);
	}

	
}
