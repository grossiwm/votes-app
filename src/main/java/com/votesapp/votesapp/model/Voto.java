package com.votesapp.votesapp.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Voto {

	private int id;
	private LocalDateTime data;
	private String localizacao;
	
	private Eleitor eleitor;

	private Candidato candidato;

	private Eleicao eleicao;
	

	public Voto() {
		this.setData(LocalDateTime.now());
	}
	
}
