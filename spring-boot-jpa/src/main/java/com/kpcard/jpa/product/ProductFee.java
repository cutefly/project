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

import com.kpcard.jpa.type.FeeType;

/**
 * 수수료
 * @author happymoney
 *
 */
@Entity(name = "product_fee")
public class ProductFee {
	
	/**
	 * 수수료 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 부과 금액
	 */
	@Column(name = "charge_amount")
	private BigDecimal	chargeAmount;

	/**
	 * 수수료 유형
	 */
	@Column(name = "fee_type")
	@Enumerated(EnumType.STRING)
	private FeeType	feeType;

	/**
	 * 상품상세정보(상위정보)
	 */
	@ManyToOne
	@JoinColumn(name = "product_details_id")
	private ProductDetails		productDetails;

}
