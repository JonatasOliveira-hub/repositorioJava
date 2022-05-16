package com.pjs.livraria.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pjs.livraria.livraria.model.PedidoCliente;

public interface RepositorioPedidoCliente extends JpaRepository<PedidoCliente, Long> {

}
