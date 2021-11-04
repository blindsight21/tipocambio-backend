package com.encora.tipocambio.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.encora.tipocambio.entity.TipoCambio;
import com.encora.tipocambio.entity.TipoMoneda;

public interface TipoCambioRepository extends CrudRepository<TipoCambio, Long>{

	@Query("SELECT t FROM TipoCambio t WHERE t.txtIsoDivisaOrigen = ?1 AND t.nidTipoMoneda = ?2")
	TipoCambio findByMonedaOrigenAndDestino(String txtIsoDivisaOrigen, TipoMoneda nidTipoMoneda);
}
