package com.pjs.livraria.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjs.livraria.livraria.model.Cliente;
import com.pjs.livraria.livraria.repository.RepositorioVendedor;

@Service
public class ServicoVendedorImpl implements ServicoVendedor {

	@Autowired
	private RepositorioVendedor repositorioVendedor;

	@Override
	public Cliente salvar(Cliente cliente) {

		return repositorioVendedor.save(cliente);
	}

}
