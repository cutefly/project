package com.kpcard.jpa.account;

import java.math.BigDecimal;
import java.util.Date;

public class AccountTransactionHistory {
	private Date	timestamp;
	private String	merchantId;
	private String	storeId;
	private String	terminalId;
	private BigDecimal	transactionAmount;
	private String	transactionCurrency;
	private BigDecimal	resultingBalance;
	private String	transactionType;
	private String	description;
}
