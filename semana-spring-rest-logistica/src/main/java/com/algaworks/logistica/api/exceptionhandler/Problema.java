package com.algaworks.logistica.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

//Classe que representa um erro na entrada
@Data
@JsonInclude(Include.NON_NULL)
public class Problema {

	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	private List<Campo> campos;
	
	@AllArgsConstructor
	@Getter
	public static class Campo{
		private String nomeDoCampoErrado;
		private String mensagemDeErro;
	}
}
