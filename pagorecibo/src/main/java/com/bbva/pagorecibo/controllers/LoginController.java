package com.bbva.pagorecibo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.pagorecibo.entity.User;
import com.bbva.pagorecibo.payload.Usuario;
import com.bbva.pagorecibo.repository.UserRepository;

@RestController
public class LoginController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping(value = "/api/login")
	public User login(@RequestBody Usuario usuario) {
		return userRepository.findByDniByPassword(usuario.getDni(), usuario.getPassword());
	}

	@PostMapping(value = "/api/registrar")
	public User registrar(@RequestBody Usuario usuario) {
		return userRepository.save(User.from(usuario));
	}

}