package com.bbva.pagorecibo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.pagorecibo.entity.Receipt;
import com.bbva.pagorecibo.repository.ReceiptRepository;

@RestController
@CrossOrigin
public class RecieptController {

	@Autowired
	private ReceiptRepository receiptRepository;

	@GetMapping(value = "/api/dashboard/{idUsuario}")
	public List<Receipt> dashboard(@PathVariable String idUsuario) {
		return receiptRepository.findPendientesByIdUsuario(Long.valueOf(idUsuario));
	}

}