package com.kpcard.jpa.account;

import java.math.BigDecimal;
import java.util.Currency;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 거래지원 상세정보
 * @author happymoney
 *
 */
@Entity(name = "account_transaction_offer_details")
public class AccountTransactionOfferDetails {
	
	/**
	 * 아이디
	 */
	@Id
	@Column(name = "offer_definition_id")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String	offerDefinitionID;
	
	/**
	 * 인스턴스 아이디
	 */
	@Column(name = "offer_instance_id")
	private String	offerInstanceID;
	
	/**
	 * 금액
	 */
	@Column(name = "offer_amount")
	private BigDecimal	offerAmount;
	
	/**
	 * 통화코드
	 */
	@Column(name = "offer_currency")
	private Currency	offerCurrency;

	/**
	 * 상품상세정보(상위정보)
	 */
	@OneToOne
	@JoinColumn(name = "account_transaction_id")
	private AccountTransaction		accountTransaction;
}
