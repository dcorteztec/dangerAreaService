package br.com.dangerAreaService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getTexto() {
        return "<h1>Bem vindo a transparência</h1>";
    }

}