package com.bbva.pagorecibo.exception;

public class PagoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PagoException(String mensaje) {
		super(mensaje);
	}

}