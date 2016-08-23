package com.kpcard.jpa.account;

import java.util.List;

import com.kpcard.jpa.type.TransactionStatus;

public class AccountTransaction2 {
	int transactionAmount;
	int	approvedAmount;
	TransactionStatus transactionStatus;
	List<AccountTransaction> accountTransactionList;
	
}
