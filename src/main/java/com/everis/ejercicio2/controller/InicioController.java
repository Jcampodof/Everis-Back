package com.everis.ejercicio2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class InicioController {

	@RequestMapping("/inicio")
	public String inicio() {
		return "Esto es InicioCOntroller";
	}
}
