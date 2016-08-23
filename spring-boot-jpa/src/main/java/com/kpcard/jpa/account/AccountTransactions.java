package com.kpcard.jpa.account;

import java.util.List;

import com.kpcard.jpa.type.TransactionStatus;

/**
 * 다중 트랜잭션 정보
 * @author happymoney
 *
 */
public class AccountTransactions {
	
	/**
	 * 거래금액
	 */
	int transactionAmount;
	
	/**
	 * 승인금액
	 */
	int	approvedAmount;
	
	/**
	 * 거래 상태
	 */
	private TransactionStatus transactionStatus;
	
	/**
	 * 트랜잭션 리스트
	 */
	private List<AccountTransaction> accountTransactionList;
}
