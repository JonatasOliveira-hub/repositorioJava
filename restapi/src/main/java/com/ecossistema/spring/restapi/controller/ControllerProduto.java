package com.ecossistema.spring.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecossistema.spring.restapi.model.Produto;
import com.ecossistema.spring.restapi.service.ServicoProduto;

/* iremos implementar as seguintes operações: 
 * criar um produto (POST), 
 * atualizar um produto (PUT), 
 * listar os produtos cadastrados (GET) 
 * e remover um produto (DELETE).
 
 *Já o @RestController faz automaticamente tudo
 *o que o @Controller faz é retornar tudo em 
 *JSON e não precisamos utilizar a 
 *anotação @ResponseBody, pois, já está contido
 *nele, então vamos usar o @RestController.
 */

@RestController
@RequestMapping("apiRest/v1/produtos")
public class ControllerProduto {

	@Autowired
	private ServicoProduto servicoProduto;

	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(servicoProduto.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Produto>> findById(@PathVariable Long id) {
		// O @PathVariable é utilizado quando o valor da variável é passada diretamente
		// na URL
		return ResponseEntity.status(HttpStatus.OK).body(servicoProduto.findById(id));
	}

	@PostMapping
	public ResponseEntity<Produto> create(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(servicoProduto.salvar(produto));
	}

	@PutMapping
	public ResponseEntity<Produto> update(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.OK).body(servicoProduto.atulizar(produto));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		servicoProduto.excluirPorId(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
