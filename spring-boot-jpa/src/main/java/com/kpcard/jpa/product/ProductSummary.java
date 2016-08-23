package com.kpcard.jpa.product;

import java.util.Currency;
import java.util.Date;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 상품 요약정보
 * @author happymoney
 *
 */
@Entity(name = "product_summary")
public class ProductSummary {

	/**
	 * 상품 요약정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	id;
	
	/**
	 * 상품명
	 */
	@Column(name = "product_name")
	private String	productName;
	
	/**
	 * 통화코드
	 */
	@Column(name = "currency")
	private Currency	currency;
	
	/**
	 * 상품코드
	 */
	@Column(name = "universal_product_code")
	private String	universalProductCode;
	
	/**
	 * 상품라인 아이디
	 */
	@Column(name = "product_line_id")
	private String	productLineId;
	
	/**
	 * 시작일
	 */
	@Column(name = "start_date")
	private Date	startDate;
	
	/**
	 * 상품 요약정보 아이디
	 */
	@Column(name = "end_date")
	private Date	endDate;
	
	/**
	 * 종료일
	 */
	@Column(name = "locale")
	private Locale	locale;

	/**
	 * 상품 정보(상위정보)
	 */
	@OneToOne(mappedBy = "productSummary")
	private Product	product;
}
