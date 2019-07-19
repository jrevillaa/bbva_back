package com.bbva.pagorecibo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.pagorecibo.payload.Usuario;
import com.bbva.pagorecibo.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public String login(Usuario usuario) {
		int validUser = userRepository.findByUsernameByPassword(usuario.getEmail(), usuario.getPassword());
		if (validUser == 1) {
			
		}
		return null;
	}

}