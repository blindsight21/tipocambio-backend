package com.tcs.tipocambio.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.tipocambio.dto.ActualizarTipoCambioPostRequest;
import com.tcs.tipocambio.dto.RealizarTipoCambioGetResponse;
import com.tcs.tipocambio.service.TipoCambioService;

@RestController
@RequestMapping(value = "/")
public class TipoCambioController {

	@Autowired
	private TipoCambioService tipoCambioService;
	
	@GetMapping(value = "/realizarTipoCambio/{monto}/{monedaOrigen}/{monedaDestino}")
	public ResponseEntity<?> realizarTipoCambio(@PathVariable("monto") BigDecimal monto,
			@PathVariable("monedaOrigen") String monedaOrigen,
			@PathVariable("monedaDestino") String monedaDestino) {
		
		RealizarTipoCambioGetResponse realizarTipoCambioGetResponse = null;
		
		try {
			realizarTipoCambioGetResponse = tipoCambioService.realizarTipoCambioGetResponse(monto, monedaOrigen, monedaDestino);
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return ResponseEntity.ok(realizarTipoCambioGetResponse);
	}
	
	@PostMapping(value = "/actualizarTipoCambio")
	public ResponseEntity<?> actualizarTipoCambio(@RequestBody ActualizarTipoCambioPostRequest actualizarTipoCambioPostRequest){
		
		try {
			tipoCambioService.actualizarTipoCambio(actualizarTipoCambioPostRequest);
		} catch (Exception e) {
			return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return ResponseEntity.ok(HttpStatus.CREATED);
	}
	
}
