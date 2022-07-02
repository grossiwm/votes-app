package com.votesapp.votesapp.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.votesapp.votesapp.model.Voto;


@FeignClient(url = "${votes-api.url}", name = "votoClient")
public interface VotoClient {

    @GetMapping(value = "/voto")
    public List<Voto> retornaVotos();
    
    @PostMapping(value = "/voto")
    public void incluiVoto(@RequestBody Voto voto);

    @DeleteMapping(value = "/voto/{id}")
    public void excluiVoto(@PathVariable Integer id);

}
