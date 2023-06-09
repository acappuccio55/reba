package com.challenge.reba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.reba.model.Persona;
import com.challenge.reba.model.Relacion;
import com.challenge.reba.repository.PersonaRepo;
import com.challenge.reba.repository.RelacionRepo;

@Service
public class PersonaService {
	
	
	@Autowired
	private PersonaRepo personaRepo;
	@Autowired
	private RelacionRepo relacionRepo;
	
	public boolean relacionarPersonas(Long dni1, Long dni2, String r) {
		
		Relacion rel = new Relacion();
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1 = personaRepo.findById(dni1).get();
		p2 = personaRepo.findById(dni2).get();
		
		//Se revisa en el if si la persona cumple con las condiciones del Nivel 1
		if (p1.getEdad() > 18 && p2.getEdad() > 18 
				&& !(p1.getTelefono().isEmpty() || p1.getEmail().isEmpty()) 
				&& !(p2.getTelefono().isEmpty() || p2.getEmail().isEmpty())
				&& !(p1.getPaisDeNacimiento().isEmpty() && p2.getPaisDeNacimiento().isEmpty())
				&& p1.getDni() != p2.getDni()) {
		
					//Se guardan los datos ingresados sobre la relacion entre dos personas para el metodo POST
					rel.setDni1(dni1);
					rel.setDni2(dni2);
					rel.setTipoDeRelacion(r);
					relacionRepo.save(rel);
					return true;
    			}
			else return false;
	}
	
	public void getRelacionEntrePersonas(Long dni1, Long dni2) {
		
		List<Relacion> personas = relacionRepo.findByDni1AndDni2(dni1, dni2);
		
		personas.forEach((p) -> {
			System.out.println(p.getTipoDeRelacion());
		});
		
		
		
	}
	

}
