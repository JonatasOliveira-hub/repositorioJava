package com.pjs.livraria.livraria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjs.livraria.livraria.model.Fornecedor;
import com.pjs.livraria.livraria.repository.RepositorioFornecedor;

@Service
public class ServicoFornecedorImpl implements ServicoFornecedor {

	@Autowired
	RepositorioFornecedor repositorioFornecedor;

	@Override
	public List<Fornecedor> consultarFornecedor() {
		return repositorioFornecedor.findAll();

	}

	@Override
	public Optional<Fornecedor> consultarFornecedorById(Long id) {
		return repositorioFornecedor.findById(id);
	}

	@Override
	public void excluirFornecedor(Long id) {
		repositorioFornecedor.deleteById(id);
	}

	@Override
	public Fornecedor alterarFornecedor(Fornecedor fornecedor) {
		return repositorioFornecedor.save(fornecedor);
	}

	@Override
	public Fornecedor inserirFornecedor(Fornecedor fornecedor) {
		return repositorioFornecedor.save(fornecedor);
	}

}
