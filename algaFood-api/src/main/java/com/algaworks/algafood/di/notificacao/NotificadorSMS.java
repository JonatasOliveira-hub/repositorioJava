package com.algaworks.algafood.di.notificacao;

import static com.algaworks.algafood.di.notificacao.NivelUrgencia.NORMAL;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@TipoDoNotificador(NORMAL)
@Component
public class NotificadorSMS implements Notificador{

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
