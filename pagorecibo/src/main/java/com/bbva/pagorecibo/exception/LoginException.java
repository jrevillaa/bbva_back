package com.bbva.pagorecibo.exception;

public class LoginException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LoginException(String mensaje) {
		super(mensaje);
	}

}