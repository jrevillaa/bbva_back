package com.bbva.pagorecibo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		if ("12345678".equals(usuario.getDni()) && "jose".equals(usuario.getPassword())) {
			User user = new User();
			user.setId(1l);
			user.setName("Jose");
			user.setLastName("Sanchez");
			user.setEmail("Jose@gmail.com");
			user.setDni("12345678");
			return user;
		}
		return null;
	}

	@PostMapping(value = "/api/registrar")
	public User registrar(@RequestBody Usuario usuario) {
		User user = new User();
		user.setName(usuario.getNombre());
		user.setLastName(usuario.getApellidos());
		user.setEmail(usuario.getEmail());
		user.setDni(usuario.getDni());
		return userRepository.save(user);
	}

}