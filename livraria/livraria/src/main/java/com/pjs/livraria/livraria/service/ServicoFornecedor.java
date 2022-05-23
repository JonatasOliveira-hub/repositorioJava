package com.pjs.livraria.livraria.service;

import java.util.List;
import java.util.Optional;

import com.pjs.livraria.livraria.model.Fornecedor;

public interface ServicoFornecedor {

	List<Fornecedor> consultarFornecedor();
	
	Optional<Fornecedor> consultarFornecedorById(Long id);
	
	void excluirFornecedor(Long id);
	
	Fornecedor alterarFornecedor(Fornecedor fornecedor);
	
	Fornecedor inserirFornecedor(Fornecedor fornecedor);
}
