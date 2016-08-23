package com.kpcard.jpa.product;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * 상품카탈로그 요약정보
 * @author happymoney
 *
 */
@Data
@Entity(name = "product_catalog_summary")
public class ProductCatalogSummary {
	/**
	 * 상품카탈로그 요약정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 상품카탈로그 버전
	 */
	@Column(name = "version")
	private int version;

	/**
	 * 상품카탈로그 명칭
	 */
	@Column(name = "name")
	private String name;

	/**
	 * 상품카탈로그(상위정보)
	 */
	@OneToOne(mappedBy = "productCatalogSummary")
//	@JoinColumn(name = "product_catalog_id")
	private ProductCatalog	productCatalog;

}
