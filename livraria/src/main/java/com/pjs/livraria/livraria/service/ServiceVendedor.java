package com.pjs.livraria.livraria.service;

/*A classe JpaRepository, tem muitos métodos,
 * e não precisamos de todos na aplicação. Com isso, como é
 * um CRUD, vamos utilizar somente esses que estão aqui descritos
 * abaixo.*/
public interface ServiceVendedor {

	void registrarCliente();
	
	void realizarVenda();
}
