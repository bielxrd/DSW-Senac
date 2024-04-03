package br.senac.tads.dsw.exemplosspringmvc.controller;

import br.senac.tads.dsw.exemplosspringmvc.model.Dados;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@org.springframework.stereotype.Controller
@RequestMapping("/exemplo")
public class Controller {

    @GetMapping("/mensagem2")
    public ModelAndView saudar2() {
        System.out.println("entrou");
        return new ModelAndView("index");
    }

    @GetMapping("/exemplo-request-param")
    public ModelAndView exemploRequestParam(@RequestParam(value = "param1str", required = true, defaultValue = "valor") String param1, @RequestParam(value = "param2int", required = false, defaultValue = "99") String param2) {
        System.out.println("Entrou");
        System.out.println(param1);
        System.out.println(param2);
        ModelAndView resposta = new ModelAndView("index");
        resposta.addObject("param1", param1);
        resposta.addObject("param2", param2);
        return resposta;
    }

    @GetMapping("/exemplo-path-var/{param1str}/{param2int}")
    public ModelAndView exemploPathVariable(@PathVariable(value = "param1str", required = true) String param1, @PathVariable(value = "param2int", required = true) int param2) {
        ModelAndView resposta = new ModelAndView("index");
        System.out.println(param1);
        System.out.println(param2);
        resposta.addObject("param3", param1);
        resposta.addObject("param4", param2);
        return resposta;
    }

    @GetMapping("/exemplo-view-obj")
    public ModelAndView exemploViewObj() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("texto", "Texto gerado");
        mv.addObject("numero", 100);
        mv.addObject("dataHora", LocalDateTime.now());
        return mv;
    }

    @PostMapping("/cadastrar")
    public ModelAndView enviarDados() {
        Dados dados = new Dados("Gabriel", "gabriel@gmail.com", 100);
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("dados", dados);
        return mv;
    }

}
