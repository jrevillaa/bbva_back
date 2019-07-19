package com.bbva.pagorecibo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.pagorecibo.payload.Usuario;

@RestController
@RequestMapping("/api/")
public class LoginController {

	@PostMapping(name = "/login")
	public void login(@RequestBody Usuario usuario) {
		
	}

}