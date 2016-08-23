package com.kpcard.jpa.product;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.*;

/**
 * 리뎀션 속성
 * @author happymoney
 *
 */
@Entity(name = "redemption_characteristics")
public class RedemptionCharacteristics {
	
	/**
	 * 속성 아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * 리뎀션 웹사이트
	 */
	@Column(name = "redemption_website")
	private String	redemptionWebsite;
	
	/**
	 * 리뎀션 방식
	 */
	@Column(name = "redemption_mode")
	private RedemptionMode	redemptionMode;
	
	/**
	 * 수동입력형식
	 */
	@Column(name = "manual_entry_format")
	private String	manualEntryFormat;

	/**
	 * 버코드 속성
	 */
	@OneToMany(mappedBy = "redemptionCharacteristics")
	Set<BarcodeCharacteristics>	barcodeCharacteristics;
	
	/**
	 * 마그네틱 속성
	 */
	@OneToOne(mappedBy = "redemptionCharacteristics")
	private MagenticStripeCharacteristics	magenticStripeCharacteristics;
	
	/**
	 * 리뎀션 기본문구
	 */
	@OneToOne
    @JoinColumn(name = "redemption_text_id")
	private RedemptionText	redemptionText;

	/**
	 * 리뎀션 문구들
	 */
	@OneToMany(mappedBy = "redemptionCharacteristics")
	private Set<RedemptionText>	redemptionTexts;
	
	/**
	 * 리뎀션 옵션
	 */
	@Transient
	private Set<RedemptionOption>	redemptionOptions;
	
	/**
	 * 상품만료일자
	 */
	@Column(name = "product_expiration_date")
	private Date	productExpirationDate;
	
	/**
	 * 유효일수
	 */
	@Column(name = "rolling_expiration_days")
	private Integer	rollingExpirationDays;

	/**
	 * 상품상세정보(샹위정보)
	 */
	@OneToOne
	@JoinColumn(name = "product_details_id")
	private ProductDetails		productDetails;
}
