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
		//para agregar validaciones
		//personaRepo.findById(dni1).get();
		//personaRepo.findById(dni2).get();
		
		Relacion rel = new Relacion();
		
        try {
    		rel.setDni1(dni1);
    		rel.setDni2(dni2);
    		rel.setTipoDeRelacion(r);
    		relacionRepo.save(rel);
    		return true;
    		
        }catch(Exception err){
        	
            return false;
        }
		
	}
	
	public String getRelacionEntrePersonas(Long dni1, Long dni2) {
		
		return relacionRepo.findByDni1AndDni2(dni1, dni2);
		
	}
	

}
