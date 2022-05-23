package com.pjs.livraria.livraria.service;

import java.util.List;
import java.util.Optional;

import com.pjs.livraria.livraria.model.Livro;

public interface ServicoLivro {

	List<Livro> findAll();

	Optional<Livro> consultarLivroById(Long id);
	
	Livro inserirLivro(Livro livro);
	
	Livro alterarLivro(Livro livro);
	
	void excluirLivroPorId(Long id);

}
