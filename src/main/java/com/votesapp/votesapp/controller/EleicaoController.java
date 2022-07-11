package com.votesapp.votesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.votesapp.votesapp.model.Eleicao;
import com.votesapp.votesapp.service.EleicaoService;

@Controller
public class EleicaoController {
	@Autowired
	private EleicaoService eleicaoService;

    @GetMapping(value = "/eleicoes")
    public String telaLista(Model model) {
        model.addAttribute("lista", eleicaoService.obterLista());
        return "eleicao/lista";
    }

    @GetMapping(value = "/eleicao")
    public String telaCadastro() {
        return "eleicao/cadastro";
    }


    @PostMapping(value = "/eleicao/incluir")
    public String incluir(Eleicao eleicao) {
        eleicaoService.incluir(eleicao);
        return "redirect:/eleicoes";
    }

    @GetMapping(value = "/eleicao/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        eleicaoService.excluir(id);
        return "redirect:/eleicoes";
    }
}
