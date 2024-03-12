package com.pf.ingreso.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "registros")
public class registros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_registros", nullable = false)
	private Long id_registros;
	
	@Column(name = "email", nullable = false, length = 250)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_musica", nullable = true)   
	private tipo_musica tipo_musica;

	public registros() {
		super();
	}
    	
	public tipo_musica getTipo_musica() {
		return tipo_musica;
	}

	public void setTipo_musica(tipo_musica tipo_musica) {
		this.tipo_musica = tipo_musica;
	}

	public Long getId_registros() {
		return id_registros;
	}

	public void setId_registros(Long id_registros) {
		this.id_registros = id_registros;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
