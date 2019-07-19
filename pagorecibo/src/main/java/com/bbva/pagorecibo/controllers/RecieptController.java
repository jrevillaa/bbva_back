package com.bbva.pagorecibo.controllers;

import com.bbva.pagorecibo.entity.Receipt;
import com.bbva.pagorecibo.payload.UserConsult;
import com.bbva.pagorecibo.repository.ReceiptRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RecieptController {
    
    @Autowired
	private ReceiptRepository receiptRepository;
    
    @GetMapping(name = "/api/dashboard")
	public List<Receipt> dashboard(@RequestBody UserConsult userConsult) {
		
           //return ReceiptRepository.findByUserId(userConsult.getId());
           return receiptRepository.findByUserId(userConsult.getId());

	}
}
