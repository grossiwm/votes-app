package com.votesapp.votesapp.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Candidato {
	
	private int id;
	private int numero;
	private String nome;

	private List<Voto> votos;

	private Eleicao eleicao;
	
}
