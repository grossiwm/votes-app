package com.votesapp.votesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.votesapp.votesapp.model.Eleitor;
import com.votesapp.votesapp.service.EleitorService;

@Controller
public class EleitorController {
	
	@Autowired
	private EleitorService eleitorService;

    @GetMapping(value = "/eleitores")
    public String telaLista(Model model) {
        model.addAttribute("lista", eleitorService.obterLista());
        return "eleitor/lista";
    }

    @GetMapping(value = "/eleitor")
    public String telaCadastro() {
        return "eleitor/cadastro";
    }


    @PostMapping(value = "/eleitor/incluir")
    public String incluir(Eleitor eleitor) {
        eleitorService.incluir(eleitor);
        return "redirect:/eleitores";
    }

    @GetMapping(value = "/eleitor/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        eleitorService.excluir(id);
        return "redirect:/eleitores";
    }

}
