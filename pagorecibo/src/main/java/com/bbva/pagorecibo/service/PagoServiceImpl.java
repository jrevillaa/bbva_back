package com.bbva.pagorecibo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.pagorecibo.entity.Receipt;
import com.bbva.pagorecibo.entity.Transaction;
import com.bbva.pagorecibo.payload.Pago;
import com.bbva.pagorecibo.repository.ReceiptRepository;
import com.bbva.pagorecibo.repository.TransactionRepository;

@Service
public class PagoServiceImpl implements PagoService {

	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private ReceiptRepository reciboRepository;

	@Override
	public boolean validarTarjeta(String numeroTarjeta, Long idRecibo) {
		Receipt recibo = reciboRepository.findByIdRecibo(idRecibo);
		System.out.println("Monto a pagar " + recibo.getMonto());
		return true;
	}

	@Override
	@Transactional
	public int registrarPago(Pago pagoRequest) {
		int result = 1;
		try {
			transactionRepository.save(new Transaction.Builder()
					.withRecibo(pagoRequest.getIdRecibo())
					.withUser(pagoRequest.getIdUsuario())
					.build());

			// actualizamos el estaod de recibo a pagado
			reciboRepository.updateEstadoRecibo(pagoRequest.getIdRecibo(), 2l);
		} catch (Exception e) {
			result = 0;
		}
		return result;
	}

	@Override
	public List<Transaction> listarPagosByIdUsuario(String idUsuario) {
		 return transactionRepository.findByIdUsuario(Long.valueOf(idUsuario));
	}

}