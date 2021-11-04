package com.encora.tipocambio.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name="TIPO_MONEDA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoMoneda implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "NID_TIPO_MONEDA")
	private Long nidTipoMoneda;
	
	@Column(name= "TXT_DESCRIPCION")
	private String txtTipoMoneda;
	
	@Column(name= "TXT_ISO_DIVISA")
	private String txtIsoDivisa;
	
	@Column(name="FLG_STATUS")
	private Integer flgStatus;
	
	@OneToMany(mappedBy = "nidTipoMoneda", fetch = FetchType.LAZY)
	private List<TipoCambio> conversionMonedaList;
	
}
