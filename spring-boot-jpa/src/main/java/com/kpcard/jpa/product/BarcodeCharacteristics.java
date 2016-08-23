package com.kpcard.jpa.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.BarcodeSubtype;
import com.kpcard.jpa.type.BarcodeType;

/**
 * 바코드 속성
 * @author happymoney
 *
 */
@Entity(name = "barcode_characteristics")
public class BarcodeCharacteristics {

	/**
	 * 속성 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	id;
	
	/**
	 * 바코드 포맷
	 */
	@Column(name = "barcode_foramt")
	private String	barcodeForamt;
	
	/**
	 * 바코드 유형
	 */
	@Column(name = "barcode_type")
	@Enumerated(EnumType.STRING)
	private BarcodeType	barcodeType;

	/**
	 * 바코드 서브 유형
	 */
	@Column(name = "barcode_sub_type")
	@Enumerated(EnumType.STRING)
	private BarcodeSubtype	barcodeSubType;

	/**
	 * 리뎀션 속성(상위정보)
	 */
	@ManyToOne
	@JoinColumn(name = "redemption_characteristics_id")
	private RedemptionCharacteristics		redemptionCharacteristics;
}
