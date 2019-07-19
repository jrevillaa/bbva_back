package com.bbva.pagorecibo.payload;

public class BasicResponse {

	private String mensaje;

	public BasicResponse(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
