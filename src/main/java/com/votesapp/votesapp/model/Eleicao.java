package com.votesapp.votesapp.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Eleicao {

	private int id;
	private LocalDateTime data;
	private String descricao;	
	private List<Candidato> candidatos;
	private List<Voto> votos;
	
}
