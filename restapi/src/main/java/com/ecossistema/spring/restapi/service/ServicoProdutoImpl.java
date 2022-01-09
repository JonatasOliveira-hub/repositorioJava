package com.ecossistema.spring.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecossistema.spring.restapi.model.Produto;
import com.ecossistema.spring.restapi.repository.RepositorioProduto;

@Service
public class ServicoProdutoImpl implements ServicoProduto {

	//Como que isso ta sendo injetado aqui, sem que a interface esteja anotada?
	@Autowired
	private RepositorioProduto repositorioProduto;
	
	@Override
	public Produto salvar(Produto produto) {
		return repositorioProduto.save(produto);
	}

	@Override
	public List<Produto> findAll() {
		return repositorioProduto.findAll();
	}

	@Override
	public Optional<Produto> findById(Long id) {
		return repositorioProduto.findById(id);
	}

	@Override
	public Produto atulizar(Produto produto) {
		return repositorioProduto.save(produto);
	}

	@Override
	public void excluirPorId(Long id) {
		repositorioProduto.deleteById(id);
	}
	
	
}
