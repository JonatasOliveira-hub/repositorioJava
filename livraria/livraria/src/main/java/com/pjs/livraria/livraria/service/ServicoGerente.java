package com.pjs.livraria.livraria.service;

import com.pjs.livraria.livraria.model.Cliente;
import com.pjs.livraria.livraria.model.Livro;

/*A classe JpaRepository, tem muitos métodos,
 * e não precisamos de todos na aplicação. Com isso, como é
 * um CRUD, vamos utilizar somente esses que estão aqui descritos
 * abaixo.*/
public interface ServicoGerente {

	Cliente registrarCliente(Cliente cliente);

	Livro contatarFornecedor(Livro livro);

	String verificarLivro(Livro livro);

	void realizarTrocaDeLivros();

	void emitirRelatorioDiario();

	void encomendarLivros(Livro livro);
}
