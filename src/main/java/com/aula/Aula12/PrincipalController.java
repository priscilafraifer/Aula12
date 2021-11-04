package com.aula.Aula12;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PrincipalController {

	@GetMapping ("/") 
	public String principal() {
		return "index";
	}
	
	@GetMapping ("/sobre") 
	public String pagSobre() {
		return "sobre";
	}
	
	@GetMapping ("/curiosidades") 
	public String pagCuriosidades() {
		return "curiosidades";
	}
	
	@GetMapping ("/favoritos") 
	public String pagFavoritos() {
		return "favoritos";
	}
	
	
	
}
