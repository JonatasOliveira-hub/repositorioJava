package com.algaworks.algafood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	/*
	 * @PostConstruct //Executado após o construtor, mesmo o padrão, que é vazio;
	 * public void init() {
	 * 
	 * }
	 * 
	 * @PreDestroy public void destroy() {
	 * 
	 * }
	 */

	public void ativar(Cliente cliente) {
		cliente.ativar();

		/* publicando envento para o container */
		publisher.publishEvent(new ClienteAtivadoEvent(cliente));
		
		/*
		 * Ao invés de notificar o cliente, nós vamos notificar o container, dizendo que
		 * nesse momento, o cliente está ativo. //notificador.notificar(cliente,
		 * "Seu cadastro no sistema está ativo!");
		 * 
		 */
	}

}
