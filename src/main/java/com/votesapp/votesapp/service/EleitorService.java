package com.votesapp.votesapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votesapp.votesapp.client.EleitorClient;
import com.votesapp.votesapp.model.Eleitor;

@Service
public class EleitorService {

	@Autowired
	private EleitorClient eleitorClient;

	public Object obterLista() {
		return eleitorClient.retornaEleitores();
	}

	public void incluir(Eleitor eleitor) {
		eleitorClient.incluiEleitor(eleitor);
	}

	public void excluir(Integer id) {
		eleitorClient.excluirEleitor(id);
	}
	
	
}
