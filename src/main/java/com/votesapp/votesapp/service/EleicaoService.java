package com.votesapp.votesapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votesapp.votesapp.client.EleicaoClient;
import com.votesapp.votesapp.model.Eleicao;

@Service
public class EleicaoService {

	@Autowired
	private EleicaoClient eleicaoClient;

	public Object obterLista() {
		
		return eleicaoClient.retornaEleicoes();
	}

	public void incluir(Eleicao eleicao) {
		
		eleicaoClient.incluiEleicao(eleicao);
	}

	public void excluir(Integer id) {
		
		eleicaoClient.excluiEleicao(id);	
	}
}
