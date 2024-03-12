package com.pf.ingreso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pf.OutPut.OutPut;
import com.pf.ingreso.modelo.registros;
import com.pf.ingreso.service.registros_service;

@RestController
@RequestMapping("/api/test")
public class RegistrosController {

	@Autowired
	private registros_service rs;

	@GetMapping("/WS_listar_tipo_musica")
	public OutPut listar_tipo_musica() {
		return rs.listar_tipo_musica();
	}

	
	@GetMapping("/WS_listar_registros")
	public OutPut lista_registros() {
		return rs.obtenerResultado();
	}

	@PostMapping("/WS_insert_data")
	public OutPut insert_data(@RequestBody registros r) {
		return rs.save(r);
	}

}
