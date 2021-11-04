package com.encora.tipocambio.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Utils {

	public static String encriptarPasswordToBCrypt(String password) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.encode(password);
	}
}
