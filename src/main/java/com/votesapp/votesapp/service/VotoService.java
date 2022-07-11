package com.votesapp.votesapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votesapp.votesapp.client.VotoClient;
import com.votesapp.votesapp.model.Voto;

@Service
public class VotoService {
	
	@Autowired
	private VotoClient votoClient;

	public Object obterLista() {
		return votoClient.retornaVotos();
	}

	public void incluir(Voto voto) {
		votoClient.incluiVoto(voto);
		
	}

	public void excluir(Integer id) {
		votoClient.excluiVoto(id);
		
	}
}
