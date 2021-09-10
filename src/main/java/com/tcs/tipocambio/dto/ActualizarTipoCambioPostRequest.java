package com.tcs.tipocambio.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActualizarTipoCambioPostRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String txtIsoDivisaOrigen;
	private BigDecimal numValorMonetario;
	private String txtIsoDivisaDestino;
	
}
