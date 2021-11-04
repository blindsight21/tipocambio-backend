package com.encora.tipocambio.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encora.tipocambio.dto.ActualizarTipoCambioPostRequest;
import com.encora.tipocambio.dto.RealizarTipoCambioGetResponse;
import com.encora.tipocambio.entity.TipoCambio;
import com.encora.tipocambio.entity.TipoMoneda;
import com.encora.tipocambio.repository.TipoCambioRepository;
import com.encora.tipocambio.service.TipoCambioService;
import com.encora.tipocambio.service.TipoMonedaService;

@Service
public class TipoCambioServiceImpl implements TipoCambioService{

	@Autowired
	private TipoMonedaService tipoMonedaService;
	
	@Autowired
	private TipoCambioRepository tipoCambioRepository;
	
	@Override
	public RealizarTipoCambioGetResponse realizarTipoCambioGetResponse(BigDecimal monto, String monedaOrigen,
			String monedaDestino) throws Exception{
		
		TipoMoneda tipoMonedaOrigen = tipoMonedaService.findByTxtIsoDivisa(monedaOrigen);
		TipoMoneda tipoMonedaDestino = tipoMonedaService.findByTxtIsoDivisa(monedaDestino);

		TipoCambio tipoCambioEncontrado = tipoCambioRepository.findByMonedaOrigenAndDestino(tipoMonedaOrigen.getTxtIsoDivisa(), tipoMonedaDestino);
		
		BigDecimal calculoMonto = tipoCambioEncontrado.getNumValorMonetario().multiply(monto);
		
		return RealizarTipoCambioGetResponse.builder()
				.monedaDestino(monedaDestino)
				.monedaOrigen(monedaOrigen)
				.monto(calculoMonto)
				.montoTipoCambio(tipoCambioEncontrado.getNumValorMonetario())
				.tipoCambio(tipoMonedaDestino.getTxtTipoMoneda())
				.build();
		
	}

	@Override
	public void actualizarTipoCambio(ActualizarTipoCambioPostRequest actualizarTipoCambioPostRequest) throws Exception {
		
		TipoMoneda tipoMonedaDestino = tipoMonedaService.findByTxtIsoDivisa(actualizarTipoCambioPostRequest.getTxtIsoDivisaDestino());
		
		TipoCambio tipoCambioEncontrado = tipoCambioRepository
				.findByMonedaOrigenAndDestino(actualizarTipoCambioPostRequest.getTxtIsoDivisaOrigen(), tipoMonedaDestino);
		
		tipoCambioEncontrado.setNumValorMonetario(actualizarTipoCambioPostRequest.getNumValorMonetario());
		
		tipoCambioRepository.save(tipoCambioEncontrado);
		
	}	
}
