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
 * 활성화 속성
 * @author happymoney
 *
 */
@Entity(name = "activation_characteristics")
public class ActivationCharacteristics {
	
	/**
	 * 속성 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;

	/**
	 * 기본 금액
	 */
	@Column(name = "base_value_amount")
	private BigDecimal	baseValueAmount;
	
	/**
	 * 최대 금액
	 */
	@Column(name = "max_value_amount")
	private BigDecimal	maxValueAmount;
	
	/**
	 * 가변금액 여부
	 */
	@Column(name = "is_variable_value")
	private Boolean		isVariableValue;
	
	/**
	 * 활성화 방법
	 */
	@Column(name = "activation_instructions")
	private String	acrivationInstructions;
	
	/**
	 * 상품상세정보(상위정보)
	 */
	@OneToOne
	@JoinColumn(name = "product_details_id")
	private ProductDetails		productDetails;

}
