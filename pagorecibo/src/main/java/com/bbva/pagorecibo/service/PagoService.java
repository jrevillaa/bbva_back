package com.bbva.pagorecibo.service;

import com.bbva.pagorecibo.payload.Pago;

public interface PagoService {

	public boolean validarTarjeta(String numeroTarjeta, Long idRecibo);

	public int registrarPago(Pago pagoRequest);

}