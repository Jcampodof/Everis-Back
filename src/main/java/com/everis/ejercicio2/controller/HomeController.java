package com.everis.ejercicio2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

	//para detectar rutas o url
	/*@RequestMapping("")
	public String hola() {
		return "Hello WOrld";
	}*/
	
	@RequestMapping("/chao")
	public String chao() {
		return "Bye WOrld";
	}
	
	@RequestMapping("/parametro")
	public String parametro(@RequestParam(value="q") String parametros, 
			@RequestParam(value="p") String parametro1,
			@RequestParam(value="nombre", required = false) String nombre,
			@RequestParam(value="edad") int edad) {
		return "Mis parametros son: "+parametros+" "+parametro1 +"NOmbre: "+nombre+" edad: "+edad;
	}
	
	@RequestMapping("/m/{modulo}/private/{seccion}/{tarea}")
	public String leccion(@PathVariable("modulo") String modulo,
			@PathVariable("seccion") String seccion,
			@PathVariable("tarea") String tarea) {
		return "Modulo: "+modulo+" Seccion: "+seccion+ " Tarea: "+tarea;
	}

	@RequestMapping("/m/{modulo}/public/{seccion}/{tarea}")
	public String leccionPublic(@PathVariable("modulo") String modulo,
			@PathVariable("seccion") String seccion,
			@PathVariable("tarea") String tarea) {
		return "Modulo: "+modulo+" Seccion: "+seccion+ " Tarea: "+tarea;
	}

}
