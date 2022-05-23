package com.pjs.livraria.livraria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjs.livraria.livraria.model.Cliente;
import com.pjs.livraria.livraria.model.Livro;
import com.pjs.livraria.livraria.repository.RepositorioFuncionario;
import com.pjs.livraria.livraria.repository.RepositorioGerente;
import com.pjs.livraria.livraria.repository.RepositorioLivro;

@Service
public class ServicoGerenteImpl implements ServicoGerente {

	@Autowired
	private RepositorioFuncionario repositorioFuncionario;

	@Autowired
	private RepositorioGerente repositorioGerente;

	@Autowired
	private RepositorioLivro repositorioLivro;

	@Override
	public Cliente registrarCliente(Cliente cliente) {
		return repositorioFuncionario.save(cliente);
	}

	@Override
	public Livro contatarFornecedor(Livro livro) {
		// Retorna o livro pelo ID
		Optional<Livro> retorno = repositorioLivro.findById(livro.getCodLivro());

		if (retorno.get().getQuantidade() < 3) {
			encomendarLivros(livro);
		}
		return livro;
	}

	@Override
	public String verificarLivro(Livro livro) {
		System.out.println("Verificando livro...");
		String troca = null;
		if (livro.isDefeito()) {
			realizarTrocaDeLivros();
			return troca = "Livro trocado";
		} else {
			return troca = "Livro não apresenta defeito.";
		}

	}

	@Override
	public void realizarTrocaDeLivros() {
		System.out.println("Livro trocado.");
	}

	@Override
	public void emitirRelatorioDiario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void encomendarLivros(Livro livro) {
		repositorioLivro.save(livro);
	}

}
