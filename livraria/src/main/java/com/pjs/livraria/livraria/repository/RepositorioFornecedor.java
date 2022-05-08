package com.pjs.livraria.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjs.livraria.livraria.model.Fornecedor;

public interface RepositorioFornecedor extends JpaRepository<Fornecedor, Long> {

}
