package br.com.bingo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bingo.dominio.Bingo;
import br.com.bingo.dominio.Cartela;
import br.com.bingo.service.CartelaService;

@Controller
public class CartelaController {
    
	private final static String INDEX = "home";
	
	@Autowired
	private CartelaService service;
	private List<Cartela> cartelas;
	
	@Value("${application.message:Hello World}")
	private String message = "Lote de Cartelas Geradas com Sucesso.";

	@RequestMapping("/")
	public String iniciar(Map<String, Object> model) {
		System.out.println("Chamando GET..");
		if(cartelas == null)
			cartelas = new ArrayList<Cartela>();
		model.put("listaCartelas", cartelas);
		return INDEX;
	}
	
	@PostMapping("/")
    public String gerarCartelas(@ModelAttribute Bingo bingo) {
		System.out.println("Chamando POST..");
		cartelas.addAll(service.gerarCartelas());
        return INDEX;
    }

}
