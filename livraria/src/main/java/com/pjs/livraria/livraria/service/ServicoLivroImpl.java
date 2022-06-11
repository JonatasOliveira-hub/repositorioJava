package com.pjs.livraria.livraria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjs.livraria.livraria.model.Livro;
import com.pjs.livraria.livraria.repository.RepositorioLivro;

@Service
public class ServicoLivroImpl implements ServicoLivro {

	@Autowired
	private RepositorioLivro repositorioLivro;

	@Override
	public List<Livro> findAll() {

		return repositorioLivro.findAll();
	}

	@Override
	public Optional<Livro> consultarLivroById(Long id) {

		return repositorioLivro.findById(id);
	}

	@Override
	public Livro inserirLivro(Livro livro) {
		return repositorioLivro.save(livro);
	}

	@Override
	public Livro alterarLivro(Livro livro) {
		return repositorioLivro.save(livro);
	}

	@Override
	public void excluirLivroPorId(Long id) {
		repositorioLivro.deleteById(id);

	}

}
