package com.kpcard.jpa.account;

import java.util.List;

import com.kpcard.jpa.type.TransactionStatus;

public class AccountTransactionHistory2 {
	String	accountId;
	String	failureReason;
	List<AccountTransactionHistory>	accountTransactionHistories;
	TransactionStatus	transactionStatus;
}
