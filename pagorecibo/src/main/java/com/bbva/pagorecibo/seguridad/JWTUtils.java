package com.bbva.pagorecibo.seguridad;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;

@Component
public class JWTUtils {

	public JwtResponse crearJWT(String username) {
		String jws = Jwts.builder().claim("username", username).compact();
			//	.setExpiration(Date.from(LocalDateTime.now().plusSeconds(5000)))
//				.signWith(SignatureAlgorithm.HS256).compact();
	    return new JwtResponse(jws);
	}

}