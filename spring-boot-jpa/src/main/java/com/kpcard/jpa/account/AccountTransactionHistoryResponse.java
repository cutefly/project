package com.kpcard.jpa.account;

import java.util.List;

import com.kpcard.jpa.type.TransactionStatus;

/**
 * 거래내역 응답
 * @author happymoney
 *
 */
public class AccountTransactionHistoryResponse {
	
	/**
	 * Account 아이디
	 */
	private String	accountId;
	
	/**
	 * 실패 사유
	 */
	private String	failureReason;
	
	/**
	 * 거래내역
	 */
	private List<AccountTransactionHistory>	accountTransactionHistories;
	
	/**
	 * 거래상태
	 */
	private TransactionStatus	transactionStatus;
}
