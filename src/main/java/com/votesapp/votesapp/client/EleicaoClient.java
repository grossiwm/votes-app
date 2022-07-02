package com.votesapp.votesapp.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.votesapp.votesapp.model.Eleicao;

@FeignClient(url = "${votes-api.url}", name = "eleicaoClient")
public interface EleicaoClient {

    @GetMapping(value = "/eleicao")
    public List<Eleicao> retornaEleicoes();

    @PostMapping(value = "/eleicao")
    public void incluiEleicao(@RequestBody Eleicao eleicao);

    @DeleteMapping(value = "/eleicao/{id}")
    public void excluiEleicao(@PathVariable Integer id);
}
