package com.tcs.tipocambio.util;

import java.util.Arrays;
import java.util.List;

import com.tcs.tipocambio.dto.RoleDto;

public class Constants {

	public static final List<RoleDto> ROLES_USUARIO = Arrays
			.asList(new RoleDto(1L,"ADMIN"), new RoleDto(2L,"USER"));
	
	public static final String USUARIO_PRUEBA = "ocollado";
	
	public static final String PASSWORD_PRUEBA = "123456";
}
