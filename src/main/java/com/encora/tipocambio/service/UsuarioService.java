package com.encora.tipocambio.service;

import com.encora.tipocambio.entity.Usuario;

public interface UsuarioService {

	Usuario findByUsername(String username);

}
