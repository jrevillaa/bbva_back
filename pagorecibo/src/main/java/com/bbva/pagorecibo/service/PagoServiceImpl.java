package com.bbva.pagorecibo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.pagorecibo.entity.Transaction;
import com.bbva.pagorecibo.payload.Pago;
import com.bbva.pagorecibo.repository.TransactionRepository;

@Service
public class PagoServiceImpl implements PagoService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public boolean validarTarjeta(String numeroTarjeta, Long idRecibo) {
		return true;
	}

	@Override
	public int registrarPago(Pago pagoRequest) {
		int result = 1;
		try {
			transactionRepository.save(new Transaction.Builder()
					.withRecibo(pagoRequest.getIdRecibo())
					.withUser(pagoRequest.getIdUsuario())
					.build());
		} catch (Exception e) {
			result = 0;
		}
		return result;
	}

}