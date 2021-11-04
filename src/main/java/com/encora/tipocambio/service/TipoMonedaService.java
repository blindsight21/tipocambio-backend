package com.encora.tipocambio.service;

import com.encora.tipocambio.entity.TipoMoneda;

public interface TipoMonedaService {
	
	TipoMoneda findByTxtIsoDivisa(String txtIsoDivisa) throws Exception;
}
