package com.votesapp.votesapp.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Eleitor {
	
	private int id;
	private String codigo;
	private String nome;
	private String email;
	private String telefone;
	private String token;
	
	private List<Voto> votos;
}
