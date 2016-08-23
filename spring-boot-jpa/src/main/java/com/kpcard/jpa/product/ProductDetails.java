package com.kpcard.jpa.product;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

/**
 * 상품 상세정보
 * @author happymoney
 *
 */
@Entity(name = "product_details")
public class ProductDetails {
	
	/**
	 * 상품 상세정보 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String	id;

	/**
	 * 생성자
	 */
	@Column(name = "creator_id")
	private String	creatorId;
	
	/**
	 * 수정자
	 */
	@Column(name = "updater_id")
	private String	updaterId;

	
	/**
	 * 상품 소개
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
	 * 상품 설명
	 */
	@Column(name = "product_description")
	private String	productDescription;
	
	/**
	 * 기본 상품설정 아이디
	 */
	@Column(name = "default_product_configuration_id")
	private String	defaultProductConfigurationId;
	
	/**
	 * 부가세 여부
	 */
	@Column(name = "is_taxable")
	private Boolean	isTaxable;

	/**
	 * 검색어
	 */
	@Column(name = "search_keywords")
	private String[]	searchKeywords;
	
	/**
	 * 활성화 속성
	 */
	@OneToOne(mappedBy = "productDetails")
	private ActivationCharacteristics	ActivationCharacteristics;
	
	/**
	 * 재충전 속성
	 */
	@OneToOne(mappedBy = "productDetails")
	private ReloadCharacteristics	reloadCharacteristics;
	
	/**
	 * 주문처리 속성
	 */
	@OneToMany(mappedBy = "productDetails")
	private Set<FulfillmentCharacteristics>	fulfillmentCharacteristics;
	
	/**
	 * 수수료설정 리스트
	 */
	@OneToMany(mappedBy = "productDetails")
	private List<ProductFee>	productFees;
	
	/**
	 * 사용 속성
	 */
	@OneToOne(mappedBy = "productDetails")
	private RedemptionCharacteristics	redemptionCharacteristics;
	
	/**
	 * 이용약관 리스트
	 */
	@OneToMany(mappedBy = "productDetails")
	private Set<TermsAndConditions>	termsAndConditions;
	
	/**
	 * 상품 설정정보 리스트
	 */
	@OneToMany(mappedBy = "productDetails")
	private Set<ProductConfiguration>	productConfigurations;

	/**
	 * 상품정보(상위정보)
	 */
	@OneToOne(mappedBy = "productDetails")
	private Product	product;
}
