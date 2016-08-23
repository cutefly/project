package com.kpcard.jpa.bag;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.AccountType;
import com.kpcard.jpa.type.PaymentNetworkType;

/**
 * 카드정보
 * @author happymoney
 *
 */
@Entity(name = "card")
public class Card {
	/**
	 * 사용자아이디
	 */
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	id;
	
	/**
	 * Account 아이디
	 */
	@Column(name = "account_id")
	private String	accountId;
	
	/**
	 * 카드번호
	 */
	@Column(name = "card_number")
	private String	cardNumber;
	
	/**
	 * 보안코드
	 */
	@Column(name = "security_code")
	private String	securityCode;
	
	/**
	 * 상품라인 아이디
	 */
	@Column(name = "product_line_id")
	private String	productLineId;
	
	/**
	 * 브랜드명
	 */
	@Column(name = "brand_name")
	private String	brandName;
	
	/**
	 * 설명
	 */
	@Column(name = "description")
	private String	description;

	/**
	 * Account 유형
	 */
	@Column(name = "account_type")
	@Enumerated(EnumType.STRING)
	private AccountType	accountType;
	
	/**
	 * 지불카드유형
	 */
	@Column(name = "payment_network_type")
	@Enumerated(EnumType.STRING)
	private PaymentNetworkType	paymentNetworkType;
	
	/**
	 * 마지막 숫자
	 */
	@Column(name = "last_digits")
	private String	lastDigits;
	
	/**
	 * 만료일
	 */
	@Column(name = "expiration_day")
	private Integer	expirationDay;
	
	/**
	 * 만료월
	 */
	@Column(name = "expiration_month")
	private Integer	expirationMonth;
	
	/**
	 * 만료년
	 */
	@Column(name = "expiration_year")
	private Integer	expirationYear;
	
	/**
	 * 카드 앞면 이미지
	 */
	@Column(name = "card_front_image")
	private String	cardFrontImage;
	
	/**
	 * 카드 뒷면 이미지
	 */
	@Column(name = "card_back_image")
	private String	cardBackImage;
	
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
	 * 프록시 카드여부
	 */
	@Column(name = "is_proxy_card")
	private Boolean	isProxyCard;
	
	/**
	 * 추가 리뎀션 정보
	 */
	@Column(name = "additional_redemption_data")
	private String	additionalRedemptionData;
	
	/**
	 * 지갑상세정보(상위정보)
	 */
	@ManyToOne
	@JoinColumn(name = "bag_details_id")
	private BagDetails		bagDetails;
}
