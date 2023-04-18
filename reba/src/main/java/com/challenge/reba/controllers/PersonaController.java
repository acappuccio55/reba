package com.challenge.reba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.reba.service.PersonaService;

@RestController
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping(value = {"/", "", "home"})
	public String home() {
		return "Home";
	}
	
	@PostMapping(value = "/personas/{dni1}/{r}/{dni2}")
	public String relacionarPersonas(Long dni1, Long dni2, String r) {
        
        personaService.relacionarPersonas(dni1, dni2, r);
        return "Personas relacionadas";
        
	}
	
	@GetMapping(value = "/relaciones/{dni1}/{dni2}")
	private String verRelacion(Long dni1, Long dni2) {
		return this.personaService.getRelacionEntrePersonas(dni1, dni2);
	}
	
}
