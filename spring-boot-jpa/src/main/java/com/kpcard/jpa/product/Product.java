package com.kpcard.jpa.product;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 상품정보
 * @author happymoney
 *
 */
@Entity(name = "product")
public class Product {
	/**
	 * 상품아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	id;
	
	/**
	 * 상품요약정보
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "product_summary_id")
	private ProductSummary	productSummary;

	/**
	 * 상품상세정보
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "product_details_id")
	private ProductDetails	productDetails;
}
