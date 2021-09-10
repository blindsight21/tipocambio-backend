package com.tcs.tipocambio.util;

import lombok.Getter;

public enum EnumTipoMoneda {

	SOL("PEN","Nuevo Sol"),
	DOLAR("USD","Dolar"),
	EURO("EUR","Euro");
	
	@Getter
	private String isoDivisa;
	@Getter
	private String descripcion;
	
	private EnumTipoMoneda(String isoDivisa, String descripcion) {
		this.isoDivisa = isoDivisa;
		this.descripcion = descripcion;
	}
	
	
	public static EnumTipoMoneda getTipoMoneda(String isoDivisa) {

        for (EnumTipoMoneda enumTipoMoneda : EnumTipoMoneda.values()) {
            if (enumTipoMoneda.isoDivisa.equals(isoDivisa)) {
            	return enumTipoMoneda;
            }
        }
        
        return null;
    }
}
