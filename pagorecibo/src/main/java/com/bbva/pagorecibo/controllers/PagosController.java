package com.bbva.pagorecibo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.pagorecibo.exception.PagoException;
import com.bbva.pagorecibo.payload.Pago;
import com.bbva.pagorecibo.service.PagoService;

@RestController
@CrossOrigin
public class PagosController {

	@Autowired
	private PagoService pagoService;

	@PostMapping(value = "/api/pago")
	public void registrarPago(@RequestBody Pago pagoRequest) {
		boolean tarjetaValida = pagoService.validarTarjeta(pagoRequest.getNumeroTarjeta(), pagoRequest.getIdRecibo());
		if (tarjetaValida) {
			pagoService.registrarPago(pagoRequest);
		} else {
			throw new PagoException("La tarjeta no es valida");
		}
	}

}