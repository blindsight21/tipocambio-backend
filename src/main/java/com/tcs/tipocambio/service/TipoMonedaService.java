package com.tcs.tipocambio.service;

import com.tcs.tipocambio.entity.TipoMoneda;

public interface TipoMonedaService {
	
	TipoMoneda findByTxtIsoDivisa(String txtIsoDivisa) throws Exception;
}
