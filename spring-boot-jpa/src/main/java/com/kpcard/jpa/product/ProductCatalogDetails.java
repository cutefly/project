package com.kpcard.jpa.product;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

import com.kpcard.jpa.User;

/**
 * 상품카탈로그 상세정보
 * @author happymoney
 *
 */
/**
 * @author happymoney
 *
 */
@Data
@Entity(name = "product_catalog_details")
public class ProductCatalogDetails {
	/**
	 * 상품카탈로그 상세정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	id;
	
//	private User	creator;
//	private User	updator;

	/**
	 * 상품카탈로그 소개
	 */
	@Column(name = "notes")
	private String	notes;

	/**
	 * 생성시간
	 */
	@Column(name = "created_timestamp")
	private Date	createdTimestamp;

	/**
	 * 수정시간
	 */
	@Column(name = "updated_timestamp")
	private Date	updatedTimestamp;

	/**
	 * 상품리스트
	 */
	@Transient
	private String[]	productIds;

	/**
	 * 상품카탈로그 설명
	 */
	@Column(name = "description")
	private String	description;

	/**
	 * 상품카탈로그 정보(상위정보)
	 */
	@OneToOne(mappedBy = "productCatalogDetails")
//	@JoinColumn(name = "product_catalog_id")
	private ProductCatalog	productCatalog;

}
