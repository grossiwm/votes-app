package com.votesapp.votesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.votesapp.votesapp.model.Candidato;
import com.votesapp.votesapp.service.CandidatoService;

@Controller
public class CandidatoController {
	

	@Autowired
	private CandidatoService candidatoService;

    @GetMapping(value = "/candidatos")
    public String telaLista(Model model) {
        model.addAttribute("lista", candidatoService.obterLista());
        return "candidato/lista";
    }

    @GetMapping(value = "/candidato")
    public String telaCadastro() {
        return "candidato/cadastro";
    }


    @PostMapping(value = "/candidato/incluir")
    public String incluir(Candidato candidato) {
        candidatoService.incluir(candidato);
        return "redirect:/candidatos";
    }

    @GetMapping(value = "/candidato/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        candidatoService.excluir(id);
        return "redirect:/candidatos";
    }

}
