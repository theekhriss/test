package com.pf.ingreso.service;

import com.pf.ingreso.modelo.registros;
import com.pf.OutPut.OutPut;

public interface registros_service {
	
	public OutPut obtenerResultado();
	public OutPut save(registros r); 
	public OutPut listar_tipo_musica(); 

}
