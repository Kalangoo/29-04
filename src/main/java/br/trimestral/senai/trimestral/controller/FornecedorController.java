package br.senai.controller;

import br.senai.service.FornecedorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FornecedorController {

    @Autowired
    FornecedorServiceImpl fornecedorService;

    @GetMapping("/fornecedor/list")
    public String findAll(Model model){
        System.out.println(fornecedorService.findAll());
        return "fornecedor/list";
    }
}
