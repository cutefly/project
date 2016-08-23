package com.kpcard.jpa.account;

import java.util.List;

import com.kpcard.jpa.type.TransactionStatus;

public class AccountTransactionHistoryResponse {
	private String	accountId;
	private String	failureReason;
	private List<AccountTransactionHistory>	accountTransactionHistories;
	private TransactionStatus	transactionStatus;
}
