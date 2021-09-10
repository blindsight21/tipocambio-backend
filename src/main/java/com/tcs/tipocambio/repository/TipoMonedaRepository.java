package com.tcs.tipocambio.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.tipocambio.entity.TipoMoneda;

public interface TipoMonedaRepository extends CrudRepository<TipoMoneda, Long>{
	
	TipoMoneda findByTxtIsoDivisa(String txtIsoDivisa) throws Exception;
}
