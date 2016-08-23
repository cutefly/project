package com.kpcard.jpa.account;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

/**
 * 트랜잭션 요약정보
 * @author happymoney
 *
 */
public class AccountTransactionHistory {
	
	/**
	 * 거래시간
	 */
	private Date	timestamp;
	
	/**
	 * 판매처 아이디
	 */
	private String	merchantId;
	
	/**
	 * 점포코드
	 */
	private String	storeId;
	
	/**
	 * 터미널번호
	 */
	private String	terminalId;
	
	/**
	 * 거래금액
	 */
	private BigDecimal	transactionAmount;
	
	/**
	 * 통화코드
	 */
	private Currency	transactionCurrency;
	
	/**
	 * 거래후 잔액
	 */
	private BigDecimal	resultingBalance;
	
	/**
	 * 거래유형
	 */
	private String	transactionType;
	
	/**
	 * 설명
	 */
	private String	description;
	
	/** 
	 * 필요할 것 같은 속성
	 */
	private String transactionId;
	private String accountId;

}
