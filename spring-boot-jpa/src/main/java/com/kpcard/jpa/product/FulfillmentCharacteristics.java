package com.kpcard.jpa.product;

import java.math.BigDecimal;

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

import com.kpcard.jpa.type.FulfillmentMethod;
import com.kpcard.jpa.type.PrintingType;
import com.kpcard.jpa.type.ProvisioningType;

/**
 * 주문처리 속성
 * @author happymoney
 *
 */
@Entity(name = "fulfillment_characteristics")
public class FulfillmentCharacteristics {
	
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
	 * 주문처리 정보
	 */
	@Column(name = "fulfillment_information")
	private String	fulfillmentInformation;
	
	/**
	 * 대기 시간
	 */
	@Column(name = "hold_time_seconds")
	private BigDecimal	holdTimeSeconds;
	
	/**
	 * 인쇄유형
	 */
	@Column(name = "printing_type")
	@Enumerated(EnumType.STRING)
	private PrintingType	printingType;
	
	/**
	 * 제작유형
	 */
	@Column(name = "provisioning_type")
	@Enumerated(EnumType.STRING)
	private ProvisioningType	provisioningType;
	
	/**
	 * 주문처리 방법
	 */
	@Column(name = "fulfillment_method")
	@Enumerated(EnumType.STRING)
	private FulfillmentMethod	fulfillmentMethod;
	
	/**
	 * 상품상세정보(상위정보)
	 */
	@ManyToOne
	@JoinColumn(name = "product_details_id")
	private ProductDetails		productDetails;

}
