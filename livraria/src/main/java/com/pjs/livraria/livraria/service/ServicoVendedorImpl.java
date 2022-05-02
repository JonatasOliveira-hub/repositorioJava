package com.pjs.livraria.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjs.livraria.livraria.model.Cliente;
import com.pjs.livraria.livraria.repository.RepositorioVendedor;

@Service
public class ServicoVendedorImpl implements ServiceVendedor {

	//Como que isso ta sendo injetado aqui, sem que a interface esteja anotada?
	@Autowired
	private RepositorioVendedor repositorioVendedor;
	
	@Override
	public Cliente registrarCliente(Cliente cliente) {
		
		return repositorioVendedor.save(cliente);
	}
	
	
}
