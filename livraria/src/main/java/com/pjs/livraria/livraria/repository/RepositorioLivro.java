package com.pjs.livraria.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjs.livraria.livraria.model.Livro;

public interface RepositorioLivro extends JpaRepository<Livro, Long>{

}
