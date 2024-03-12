package com.pf.ingreso.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


import javax.persistence.Id;

@Entity
@Table(name = "tipo_musica")
public class tipo_musica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_musica")
	private Long id_tipo_musica;
	
	@Column(name = "detalle_tipo_musica", nullable = false, length = 200)
	private String detalle_tipo_musica;
	
	
	public tipo_musica() {
		super();
	}
	
	public Long getId_tipo_musica() {
		return id_tipo_musica;
	}

	public void setId_tipo_musica(Long id_tipo_musica) {
		this.id_tipo_musica = id_tipo_musica;
	}

	public String getDetalle_tipo_musica() {
		return detalle_tipo_musica;
	}

	public void setDetalle_tipo_musica(String detalle_tipo_musica) {
		this.detalle_tipo_musica = detalle_tipo_musica;
	}

}