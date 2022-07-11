package com.votesapp.votesapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votesapp.votesapp.client.CandidatoClient;
import com.votesapp.votesapp.model.Candidato;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoClient candidatoClient;

	public List<Candidato> obterLista() {
		return candidatoClient.retornaCandiatos();
	}

	public void excluir(Integer id) {
		candidatoClient.excluiCandidato(id);
	}
	
	public void incluir(Candidato candidato) {
		candidatoClient.incluiCandidato(candidato);
	}
	

}
