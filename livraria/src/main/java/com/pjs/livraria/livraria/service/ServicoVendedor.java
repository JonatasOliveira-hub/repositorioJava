package com.pjs.livraria.livraria.service;

import com.pjs.livraria.livraria.model.Cliente;

/*A classe JpaRepository, tem muitos métodos,
 * e não precisamos de todos na aplicação. Com isso, como é
 * um CRUD, vamos utilizar somente esses que estão aqui descritos
 * abaixo.*/
public interface ServicoVendedor {

	Cliente registrarCliente(Cliente vendedor);

}
