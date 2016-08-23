package com.kpcard.jpa.account;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * 거래지원 상세
 * @author happymoney
 *
 */
public class AccountTransactionOfferDetails {
	
	/**
	 * 아이디
	 */
	private String	offerDefinitionID;
	
	/**
	 * 인스턴스 아이디
	 */
	private String	offerInstanceID;
	
	/**
	 * 금액
	 */
	private BigDecimal	offerAmount;
	
	/**
	 * 통화코드
	 */
	private Currency	offerCurrency;
}
