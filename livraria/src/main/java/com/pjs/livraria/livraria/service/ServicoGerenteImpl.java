package com.pjs.livraria.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjs.livraria.livraria.repository.RepositorioFuncionario;
import com.pjs.livraria.livraria.repository.RepositorioGerente;

@Service
public class ServicoGerenteImpl implements ServicoGerente  {

	@Autowired
	private RepositorioFuncionario repositorioFuncionario;
	
	@Autowired
	private RepositorioGerente repositorioGerente;
	
	@Override
	public void contatarFornecedor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verificarLivro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarTrocaDeLivros() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirRelatorioDiario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encomendarLivros() {
		// TODO Auto-generated method stub
		
	}

}
