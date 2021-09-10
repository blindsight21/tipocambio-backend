package com.tcs.tipocambio.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tcs.tipocambio.entity.TipoCambio;
import com.tcs.tipocambio.entity.TipoMoneda;

public interface TipoCambioRepository extends CrudRepository<TipoCambio, Long>{

	@Query("SELECT t FROM TipoCambio t WHERE t.txtIsoDivisaBase = ?1 AND t.nidTipoMoneda = ?2")
	TipoCambio findByMonedaOrigenAndDestino(String txtIsoDivisaBase, TipoMoneda nidTipoMoneda);
}
