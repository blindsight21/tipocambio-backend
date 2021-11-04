package com.encora.tipocambio.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RealizarTipoCambioGetResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private BigDecimal monto;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private BigDecimal montoTipoCambio;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String monedaOrigen;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String monedaDestino;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String tipoCambio;
}
