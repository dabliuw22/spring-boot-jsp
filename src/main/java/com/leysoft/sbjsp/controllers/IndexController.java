package com.leysoft.sbjsp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@Value("${controller.titulo}")
	private String titulo;
	
	@GetMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("saludo", titulo);
		return "index";
	}
}
