package com.bbva.pagorecibo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.pagorecibo.entity.User;
import com.bbva.pagorecibo.payload.Usuario;
import com.bbva.pagorecibo.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping(value = "/api/login")
	public User login(@RequestBody Usuario usuario) {
		return loginService.login(usuario);
	}

	@PostMapping(value = "/api/registrar")
	public User registrar(@RequestBody Usuario usuario) {
		return loginService.registrar(usuario);
	}

}