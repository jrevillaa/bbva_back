package com.bbva.pagorecibo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbva.pagorecibo.entity.User;
import com.bbva.pagorecibo.exception.LoginException;
import com.bbva.pagorecibo.payload.Usuario;
import com.bbva.pagorecibo.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User login(Usuario usuario) {
		return userRepository.findByDniByPassword(usuario.getDni(), usuario.getPassword());
	}

	@Override
	public User registrar(Usuario usuario) {
		User user = userRepository.findByDni(usuario.getDni());
		if (user == null) {
			return userRepository.save(User.from(usuario));
		}
		throw new LoginException("Ya existe un usuario registrado con ese DNI");
	}

}