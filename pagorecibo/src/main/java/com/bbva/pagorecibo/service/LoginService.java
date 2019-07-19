package com.bbva.pagorecibo.service;

import com.bbva.pagorecibo.entity.User;
import com.bbva.pagorecibo.payload.Usuario;

public interface LoginService {

	public User login(Usuario usuario);

	public User registrar(Usuario usuario);

}