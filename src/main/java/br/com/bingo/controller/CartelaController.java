package br.com.bingo.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bingo.dominio.Cartela;
import br.com.bingo.service.CartelaService;

@Controller
public class CartelaController {

	@Autowired
	private CartelaService service;
	
	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("numeracao", message+" - "+new Date());
		model.put("listaCartelas", service.gerarCartelas());
		return "home";
	}
	
	@PostMapping("/")
    public String greetingSubmit(@ModelAttribute Cartela greeting) {
		
        return "home";
    }
	

}
