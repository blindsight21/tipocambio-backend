package com.encora.tipocambio.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name="TIPO_CAMBIO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoCambio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "NID_TIPO_CAMBIO")
	private Long nidTipoCambio;
	
	@Column(name= "TXT_ISO_DIVISA_ORIGEN")
	private String txtIsoDivisaOrigen;
	
	@Column(name= "NUM_VALOR_MONETARIO")
	private BigDecimal numValorMonetario;
	
	@Column(name= "FLG_STATUS")
	private Integer flgStatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="NID_TIPO_MONEDA", referencedColumnName = "NID_TIPO_MONEDA")
	private TipoMoneda nidTipoMoneda;
	
}
