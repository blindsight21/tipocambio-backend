package com.tcs.tipocambio.service;

import com.tcs.tipocambio.entity.Usuario;

public interface UsuarioService {

	Usuario findByUsername(String username);

}
