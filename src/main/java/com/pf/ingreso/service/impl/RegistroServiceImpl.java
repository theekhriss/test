package com.pf.ingreso.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pf.OutPut.OutPut;
import com.pf.ingreso.modelo.registros;
import com.pf.ingreso.modelo.tipo_musica;
import com.pf.ingreso.repository.registros_Repository;
import com.pf.ingreso.repository.tipo_musica_Repository;
import com.pf.ingreso.service.registros_service;

@Service
public class RegistroServiceImpl implements registros_service {

	@Autowired
	private registros_Repository rr;

	@Autowired
	private tipo_musica_Repository tmr;

	public OutPut obtenerResultado() {
		HashMap<Long, Integer> hash = new HashMap<Long, Integer>();
		OutPut output = new OutPut();
		try {
			List<registros> lr = rr.findAll();
			for (int i = 0; i < lr.size(); i++) {
				if (hash.get(lr.get(i).getTipo_musica().getId_tipo_musica()) == null) {
					hash.put(lr.get(i).getTipo_musica().getId_tipo_musica(), 1);
				} else {
					hash.put(lr.get(i).getTipo_musica().getId_tipo_musica(),
							hash.get(lr.get(i).getTipo_musica().getId_tipo_musica()) + 1);
				}
			}

			output.setCode(hash.size() == 0 ? 2 : 1);
			output.setMessenger(hash.size() == 0 ? "Busqueda sin exito" : "Listado de registros");
			output.setJson(hash);
		} catch (Exception e) {
			e.printStackTrace();
			output.setCode(0);
			output.setDetail(e.toString());
			output.setMessenger("Ocurrio un error al realizar el ingreso.");

		}
		return output;
	}

	public OutPut listar_tipo_musica() {
		OutPut output = new OutPut();
		try {
			List<tipo_musica> tm = tmr.findAll();
			output.setCode(tm == null ? 2 : 1);
			output.setMessenger(tm == null ? "Busqueda sin exito" : "Listado de registros");
			output.setJson(tm);
		} catch (Exception e) {
			e.printStackTrace();
			output.setCode(0);
			output.setDetail(e.toString());
			output.setMessenger("Ocurrio un error al realizar el ingreso.");
		}
		return output;
	}

	public OutPut save(registros r) {
		OutPut output = new OutPut();
		try {
			rr.save(r);
			output.setCode(1);
			output.setMessenger("Ingreso exitoso.");
		} catch (Exception e) {
			e.printStackTrace();
			output.setCode(0);
			output.setDetail(e.toString());
			output.setMessenger("Ocurrio un error al realizar el ingreso.");
		}
		return output;
	}

}
