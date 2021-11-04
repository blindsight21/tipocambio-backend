package com.encora.tipocambio.service;

import java.math.BigDecimal;

import com.encora.tipocambio.dto.ActualizarTipoCambioPostRequest;
import com.encora.tipocambio.dto.RealizarTipoCambioGetResponse;

public interface TipoCambioService {

	RealizarTipoCambioGetResponse realizarTipoCambioGetResponse (BigDecimal monto, String monedaOrigen, String monedaDestino) throws Exception;

	void actualizarTipoCambio(ActualizarTipoCambioPostRequest actualizarTipoCambioPostRequest) throws Exception;
}
