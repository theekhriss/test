package com.pf.ingreso.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResouceNotFoundException extends RuntimeException {

	public static final long serialVersionUID = 1L;

	public ResouceNotFoundException(String messege) {
		super(messege);
	}

}
