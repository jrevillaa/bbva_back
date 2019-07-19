package com.bbva.pagorecibo.service;

import java.util.List;

import com.bbva.pagorecibo.entity.Transaction;
import com.bbva.pagorecibo.payload.Pago;

public interface PagoService {

	public boolean validarTarjeta(String numeroTarjeta, Long idRecibo);

	public int registrarPago(Pago pagoRequest);

	public List<Transaction> listarPagosByIdUsuario(String idUsuario);

}