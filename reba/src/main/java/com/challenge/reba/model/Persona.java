package com.challenge.reba.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(schema = "Personas")
public class Persona {
	
	@Column
	@NotNull
	private String tipoDni;
	@Column
	@NotNull
	@Id
	private Long dni;
	@Column
	@NotNull
	private Integer edad;
	@Column
	@NotNull
	private String paisDeNacimiento;
	@Column
	@Email(message = "correo con formato incorrecto")
	private String email;
	@Column
	private String telefono;
	
	
	public String getTipoDni() {
		return tipoDni;
	}
	public void setTipoDni(String tipoDni) {
		this.tipoDni = tipoDni;
	}
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public String getPaisDeNacimiento() {
		return paisDeNacimiento;
	}
	public void setPaisDeNacimiento(String pais) {
		this.paisDeNacimiento = pais;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer fechaDeNacimiento) {
		this.edad = fechaDeNacimiento;
	}
	
	
	

	

}
