package com.tcs.tipocambio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.tipocambio.entity.TipoMoneda;
import com.tcs.tipocambio.repository.TipoMonedaRepository;
import com.tcs.tipocambio.service.TipoMonedaService;

@Service
public class TipoMonedaServiceImpl implements TipoMonedaService{

	@Autowired
	private TipoMonedaRepository tipoMonedaRepository;
	
	@Override
	public TipoMoneda findByTxtIsoDivisa(String txtIsoDivisa) throws Exception {
		
		return tipoMonedaRepository.findByTxtIsoDivisa(txtIsoDivisa);
		
	}

}
