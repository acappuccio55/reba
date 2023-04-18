package com.challenge.reba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.reba.model.Relacion;

@Repository
public interface RelacionRepo extends JpaRepository <Relacion, Long> {

	List<Relacion> findByDni1AndDni2(Long dni1, Long dni2);
}
