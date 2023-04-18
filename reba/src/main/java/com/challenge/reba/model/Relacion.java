package com.challenge.reba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(schema = "Relacion")
public class Relacion {

	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	@NotNull
	private Long dni1;
	@Column
	@NotNull
	private Long dni2;
	@Column
	@NotNull
	private String tipoDeRelacion;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDni1() {
		return dni1;
	}
	public void setDni1(Long dni1) {
		this.dni1 = dni1;
	}
	public Long getDni2() {
		return dni2;
	}
	public void setDni2(Long dni2) {
		this.dni2 = dni2;
	}
	public String getTipoDeRelacion() {
		return tipoDeRelacion;
	}
	public void setTipoDeRelacion(String tipoDeRelacion) {
		this.tipoDeRelacion = tipoDeRelacion;
	}
	

	
	
}
