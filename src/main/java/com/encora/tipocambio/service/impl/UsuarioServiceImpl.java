package com.encora.tipocambio.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.encora.tipocambio.entity.Usuario;
import com.encora.tipocambio.service.UsuarioService;
import com.encora.tipocambio.util.Constants;
import com.encora.tipocambio.util.Utils;

@Service
public class UsuarioServiceImpl implements UsuarioService, UserDetailsService{

	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		List<GrantedAuthority> authorities = Constants.ROLES_USUARIO
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role: " + authority.getAuthority()))
				.collect(Collectors.toList());
		
		return new User(Constants.USUARIO_PRUEBA, Utils.encriptarPasswordToBCrypt(Constants.PASSWORD_PRUEBA), Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, authorities);
	}
	
	@Override
	@Transactional(readOnly=true)
	public Usuario findByUsername(String username) {
		return new Usuario();
	}

}
