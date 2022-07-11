package com.votesapp.votesapp.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.votesapp.votesapp.model.Candidato;

@FeignClient(url = "${votes-api.url}", name = "candidatoClient")
public interface CandidatoClient {

    @GetMapping(value = "/candidato")
    public List<Candidato> retornaCandiatos();

    @PostMapping(value = "/candidato")
    public void incluiCandidato(@RequestBody Candidato candidato);

    @DeleteMapping(value = "/candidato/{id}")
    public void excluiCandidato(@PathVariable Integer id);
}
