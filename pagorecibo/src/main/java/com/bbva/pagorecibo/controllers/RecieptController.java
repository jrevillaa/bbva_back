package com.bbva.pagorecibo.controllers;

import com.bbva.pagorecibo.entity.Receipt;
import com.bbva.pagorecibo.payload.UserConsult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RecieptController {
    
    @GetMapping(name = "/api/dashboard")
	public Receipt dashboard(@RequestBody UserConsult userConsult) {
		
            userConsult.getId();
                    
            return null;
	}
}
