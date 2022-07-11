package com.votesapp.votesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.votesapp.votesapp.model.Voto;
import com.votesapp.votesapp.service.VotoService;

@Controller
public class VotoController {
	
	@Autowired
	private VotoService votoService;

    @GetMapping(value = "/votos")
    public String telaLista(Model model) {
        model.addAttribute("lista", votoService.obterLista());
        return "voto/lista";
    }

    @GetMapping(value = "/voto")
    public String telaCadastro() {
        return "voto/cadastro";
    }


    @PostMapping(value = "/voto/incluir")
    public String incluir(Voto voto) {
        votoService.incluir(voto);
        return "redirect:/votos";
    }

    @GetMapping(value = "/voto/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        votoService.excluir(id);
        return "redirect:/votos";
    }

}
