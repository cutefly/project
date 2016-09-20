package com.kpcard.jpa.product;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.User;
import com.kpcard.jpa.type.*;

@Data
@Entity(name = "product_line_details")
public class ProductLineDetails {

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
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
	 * 노트
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
	 * 상품라인 설명
	 */
	@Column(name = "product_line_description")
	private String	productLineDescription;
	
	/**
	 * 고객센터 전화번호
	 */
	@Column(name = "customer_service_phone_number")
	private String	customerServicePhoneNumber;
	
	/**
	 * 고객센터 웹사이트
	 */
	@Column(name = "customer_service_website")
	private String	customerServiceWebsite;

	/**
	 * 카드번호 라벨
	 */
	@Column(name = "card_number_label")
	private String	cardNumberLabel;
	
	/**
	 * 대표 상품아이디
	 */
	@Column(name = "default_product_id")
	private String	defaultProductId;
	
	/**
	 * 통화코드
	 */
	@Column(name = "default_currency")
	private String	defaultCurrency;

	/**
	 * 핀 사용여부
	 */
	@Column(name = "pin_required")
	private Boolean	pinRequired;
	
	/**
	 * 활성화방식
	 */
	@Column(name = "activation_type")
	@Enumerated(EnumType.STRING)
	private ActivationType	activationType;

	@OneToOne(mappedBy = "productLineDetails", cascade = CascadeType.ALL, orphanRemoval = true)
	private PinCharacteristics	pinCharacteristics;
	
/*
	@OneToMany(mappedBy = "productLineDetails")
	private List<ProductAffiliation>	productAffiliation;
	
	@OneToOne(mappedBy = "productLineDetails")
	private LostStolenCharacteristics	lostStolenCharacteristics;
	
	@OneToOne(mappedBy = "productLineDetails")
	private ExchangeCharacteristics	exchangeCharacteristics;
	
	@OneToOne(mappedBy = "productLineDetails")
	private BalanceCharacteristics	balanceCharacteristics;
	
	private String[]	bankIdentificationNumbers;
	
	@Transient
	private Set<TermsAndConditions>	termsAndConditions;
	
	@Transient
	private Set<SupportedFeatures>	supportedFeatures;
		
	@OneToOne
    @JoinColumn(name = "redemption_characteristics_id")
	private RedemptionCharacteristics	defaultRedemptionCharacteristics;
	
	@OneToOne
    @JoinColumn(name = "reload_characteristics_id")
	private ReloadCharacteristics	defaultReloadCharacteristics;
	
	@Transient
	@OneToMany(mappedBy = "productLineDetails")
	private List<ProductFee>	defaultProductFees;
	
	@Transient
	@OneToMany(mappedBy = "productLineDetails")
	private Set<ProductImage>	defaultProductImages;
	
	@Transient
	@OneToMany(mappedBy = "productLineDetails")
	private List<FulfillmentCharacteristics>	defaultFulfillmentCharacterstics;
	
*/
}
