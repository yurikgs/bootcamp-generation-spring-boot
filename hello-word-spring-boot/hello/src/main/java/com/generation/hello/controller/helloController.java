package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {
	
	@GetMapping 
	public String hello() {
		
		return "Hello World \n\n"
				+ "Habilidades e ementalidades que usei: atenção aos detalhes, "
				+ "proatividade.\n\n"
				+ "Objetivos de Aprendizagem:"
				+ "\n\n"
				+ "Objetivo de aprendizagem essa semana: Persistência, Responsablidade Pessoal";
	}
	
}
