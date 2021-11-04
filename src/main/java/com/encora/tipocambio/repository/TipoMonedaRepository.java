package com.encora.tipocambio.repository;

import org.springframework.data.repository.CrudRepository;

import com.encora.tipocambio.entity.TipoMoneda;

public interface TipoMonedaRepository extends CrudRepository<TipoMoneda, Long>{
	
	TipoMoneda findByTxtIsoDivisa(String txtIsoDivisa) throws Exception;
}
