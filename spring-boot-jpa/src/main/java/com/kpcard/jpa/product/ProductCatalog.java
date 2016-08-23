package com.kpcard.jpa.product;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * 상품카탈로그 정보
 * @author happymoney
 *
 */
@Data
@Entity(name = "product_catalog")
public class ProductCatalog {
	/**
	 * 상품카탈로그 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 상품카탈로그 요약정보
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "product_catalog_summary_id")
	private ProductCatalogSummary	productCatalogSummary;
	
	/**
	 * 상품카탈로그 상세정보
	 */
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "product_catalog_details_id")
	private ProductCatalogDetails	productCatalogDetails;
}
