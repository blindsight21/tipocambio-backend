package com.tcs.tipocambio.service;

import java.math.BigDecimal;

import com.tcs.tipocambio.dto.ActualizarTipoCambioPostRequest;
import com.tcs.tipocambio.dto.RealizarTipoCambioGetResponse;

public interface TipoCambioService {

	RealizarTipoCambioGetResponse realizarTipoCambioGetResponse (BigDecimal monto, String monedaOrigen, String monedaDestino) throws Exception;

	void actualizarTipoCambio(ActualizarTipoCambioPostRequest actualizarTipoCambioPostRequest) throws Exception;
}
