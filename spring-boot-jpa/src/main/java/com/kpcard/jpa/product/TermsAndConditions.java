package com.kpcard.jpa.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.TermsAndConditionsType;

/**
 * 이용약관
 * @author happymoney
 *
 */
@Entity(name = "terms_and_conditions")
public class TermsAndConditions {
	
	/**
	 * 약관 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	id;
	
	/**
	 * 이용약관 문구
	 */
	@Column(name = "terms_and_conditions")
	private String	termsAndConditions;

	/**
	 * 이용약관 유형
	 */
	@Column(name = "terms_and_conditions_type")
	@Enumerated(EnumType.STRING)
	private TermsAndConditionsType	termsAndConditionsType;

	/**
	 * 상품상세정보(상위정보)
	 */
	@OneToOne
	@JoinColumn(name = "product_details_id")
	private ProductDetails		productDetails;
}
