package com.encora.tipocambio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encora.tipocambio.entity.TipoMoneda;
import com.encora.tipocambio.repository.TipoMonedaRepository;
import com.encora.tipocambio.service.TipoMonedaService;

@Service
public class TipoMonedaServiceImpl implements TipoMonedaService{

	@Autowired
	private TipoMonedaRepository tipoMonedaRepository;
	
	@Override
	public TipoMoneda findByTxtIsoDivisa(String txtIsoDivisa) throws Exception {
		
		return tipoMonedaRepository.findByTxtIsoDivisa(txtIsoDivisa);
		
	}

}
