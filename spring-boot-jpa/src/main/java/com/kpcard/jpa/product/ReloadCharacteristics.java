package com.kpcard.jpa.product;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 재충전 속성
 * @author happymoney
 *
 */
@Entity(name = "reload_characteristics")
public class ReloadCharacteristics {

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
	 * 최소 재충전 금액
	 */
	@Column(name = "min_reload_amount")
	private BigDecimal	minReloadAmount;
	
	/**
	 * 최대재충전 금액
	 */
	@Column(name = "max_reload_amount")
	private BigDecimal	maxReloadAmount;
	
	/**
	 * 재충전 가능여부
	 */
	@Column(name = "is_reloadable")
	private Boolean	isReloadable;

	/**
	 * 상품상세정보(상위정보)
	 */
	@OneToOne
	@JoinColumn(name = "product_details_id")
	private ProductDetails		productDetails;
}
