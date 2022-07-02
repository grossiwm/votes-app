package com.votesapp.votesapp.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.votesapp.votesapp.model.Eleitor;

@FeignClient(url = "${votes-api.url}", name = "eleitorClient")
public interface EleitorClient {

	@GetMapping(value = "/eleitor")
	public List<Eleitor> retornaEleitores();

	@PostMapping(value = "/eleitor")
	public void incluiEleitor(@RequestBody Eleitor eleitor);

	@DeleteMapping(value = "/eleitor/{id}")
	public void excluirEleitor(@PathVariable Integer id);
}
