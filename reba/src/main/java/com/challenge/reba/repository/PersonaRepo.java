package com.challenge.reba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.reba.model.Persona;

@Repository
public interface PersonaRepo extends JpaRepository <Persona, Long>{

	
}
