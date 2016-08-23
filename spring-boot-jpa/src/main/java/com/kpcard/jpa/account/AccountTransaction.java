package com.kpcard.jpa.account;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.kpcard.jpa.type.AccountTransactionStatus;
import com.kpcard.jpa.type.AccountTransactionType;
import com.kpcard.jpa.type.AccountType;
import com.kpcard.jpa.type.MessageReasonCode;
import com.kpcard.jpa.type.PaymentNetworkType;
import com.kpcard.jpa.type.PaymentProcessor;

/**
 * 트랜잭션 정보
 * @author happymoney
 *
 */
@Entity(name = "account_transaction")
public class AccountTransaction {

	/**
	 * 아이디
	 */
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
	 * 베이트 트랜잭션 아이디
	 */
	@Column(name = "base_transaction_id")
	private String	baseTransactionId;

	/**
	 * 연관 아이디
	 */
	@Column(name = "correlation_id")
	private String	correlationId;

	/**
	 * Account 아이디
	 */
	@Column(name = "account_id")
	private String	accountId;

	/**
	 * 판매처 아이디
	 */
	@Column(name = "merchant_id")
	private String	merchantId;

	/**
	 * Account 번호 마지막 숫자
	 */
	@Column(name = "account_number_last_digits")
	private String	accountNumberLastDigits;

	/**
	 * 부 Account 아이디
	 */
	@Column(name = "secondary_account_id")
	private String	secondaryAccountId;

	/**
	 * 부 Account 번호
	 */
	@Column(name = "secondary_account_number")
	private String	secondaryAccountNumber;

	/**
	 * 부 Account 번호 마지막 숫자
	 */
	@Column(name = "secondary_account_number_last_digits")
	private String	secondaryAccountNumberLastDigits;

	/**
	 * 통화코드
	 */
	@Column(name = "currency")
	private Currency	currency;

	/**
	 * 교환비율
	 */
	@Column(name = "exchange_rate")
	private BigDecimal	exchangeRate;

	/**
	 * 요청 금액
	 */
	@Column(name = "requested_amount")
	private BigDecimal	requestedAmount;

	/**
	 * 승인금액
	 */
	@Column(name = "approved_amount")
	private BigDecimal	approvedAmount;

	/**
	 * 안증코드
	 */
	@Column(name = "authorization_code")
	private String	authorizationCode;

	/**
	 * 트랜잭션 응답
	 */
	@Column(name = "transaction_response")
	private String	transactionResponse;

	/**
	 * 최종잔액
	 */
	@Column(name = "resulting_balance")
	private BigDecimal	resultingBalance;

	/**
	 * 부 Account 최종잔액
	 */
	@Column(name = "secondary_resulting_balance")
	private BigDecimal	secondaryResultingBalance;

	/**
	 * 거래시간
	 */
	@Column(name = "transaction_timeStamp")
	private Date	transactionTimeStamp;

	/**
	 * 설명
	 */
	@Column(name = "description")
	private String	description;

	/**
	 * 환불여부
	 */
	@Column(name = "is_void")
	private Boolean	isVoid;

	/**
	 * 취소여부
	 */
	@Column(name = "is_reversal")
	private Boolean	isReversal;

	/**
	 * 영수증번호
	 */
	@Column(name = "receipt_number")
	private String	receiptNumber;

	/**
	 *avs 응답코드
	 */
	@Column(name = "avs_response_code")
	private String	avsResponseCode;

	/**
	 * cvv2 응답코드
	 */
	@Column(name = "cvv2_response_code")
	private String	cvv2ResponseCode;

	/**
	 * 주문번호(RRN)
	 */
	@Column(name = "retrieval_reference_number")
	private String	retrievalReferenceNumber;

	/**
	 * 대상자 이름
	 */
	@Column(name = "first_name")
	private String	firstName;

	/**
	 * 대상자 이름(성)
	 */
	@Column(name = "last_name")
	private String	lastName;

	/**
	 * 대상자 전자우편주소
	 */
	@Column(name = "amail_address")
	private String	emailAddress;

	/**
	 * 대상자 전화번호
	 */
	@Column(name = "phone_number")
	private String	phoneNumber;

	/**
	 * 대상자 거주 거리명
	 */
	@Column(name = "street")
	private String	street;

	/**
	 * 대상자 주소 unit
	 */
	@Column(name = "unit")
	private String	unit;

	/**
	 * 대상자 거주 도시명
	 */
	@Column(name = "city")
	private String	city;

	/**
	 * 대상자 거주 구역명
	 */
	@Column(name = "country_or_distict")
	private String	countyOrDistrict;

	/**
	 * 대상자 거주 시도명
	 */
	@Column(name = "state_or_province")
	private String	stateOrProvince;

	/**
	 * 대상자 거주 국가
	 */
	@Column(name = "country")
	private String	country;

	/**
	 * 대상자 거주 우편번호
	 */
	@Column(name = "postal_code")
	private String	postalCode;

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
	 * 기기 추적정보
	 */
	@Column(name = "device_finger_print_id")
	private String	deviceFingerPrintId;

	/**
	 * 아이피주소
	 */
	@Column(name = "ip_address")
	private String	ipAddress;

	/**
	 * 점포코드
	 */
	@Column(name = "store_number")
	private String	storeNumber;

	/**
	 * 터미널번호
	 */
	@Column(name = "terminal_number")
	private String	terminalNumber;

	/**
	 * 거래 상세
	 */
	@OneToOne(mappedBy = "accountTransaction")
	private AccountTransactionOfferDetails offerDetails;

	/**
	 * 영수증 표시
	 */
	@Column(name = "receipt_lines")
	private String	receiptLines;

	/**
	 * 이용약관
	 */
	@Column(name = "terms_and_conditions")
	private String	termsAndConditions;

	/**
	 * 거래 유형
	 */
	@Column(name = "transaction_type")
	@Enumerated(EnumType.STRING)
	private AccountTransactionType transactionType;

	/**
	 * 결제대행사
	 */
	@Column(name = "payment_processor")
	@Enumerated(EnumType.STRING)
	private PaymentProcessor paymentProcessor;

	/**
	 * 거래 상태
	 */
	@Column(name = "transaction_status")
	@Enumerated(EnumType.STRING)
	private AccountTransactionStatus transactionStatus;

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
	 * 세금
	 */
	@Column(name = "tax_amount")
	private BigDecimal	taxAmount;

	/**
	 * 거래 수수료
	 */
	@Column(name = "transaction_fee")
	private BigDecimal	transactionFee;

	/**
	 * 응답코드
	 */
	@Column(name = "message_reason_code")
	@Enumerated(EnumType.STRING)
	private MessageReasonCode	messageReasonCode;

	/**
	 * Account 번호
	 */
	@Column(name = "account_number")
	private String	accountNumber;

	/**
	 * 활성화 Account 번호
	 */
	@Column(name = "activation_account_number")
	private String	activationAccountNumber;

	/**
	 * 인증코드
	 */
	@Column(name = "security_code")
	private String	securityCode;

	/**
	 * 추가 리뎀션 정보
	 */
	@Column(name = "additional_redemption_data")
	private String	additionalRedemptionData;

	/**
	 * 상품 아이읻
	 */
	@Column(name = "product_d")
	private String	productId;
}
