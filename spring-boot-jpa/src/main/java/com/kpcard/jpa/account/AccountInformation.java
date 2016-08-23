package com.kpcard.jpa.account;

import java.math.BigDecimal;
import java.util.Date;

import com.kpcard.jpa.type.AccountStatus;
import com.kpcard.jpa.type.AccountType;

public class AccountInformation {
	private String	id;
	private Date	updatedTimestamp;
	private AccountType	type;
	private String	accountNumber;
	private String	securityCode;
	private String	productLineId;
	private String	productId;
	private BigDecimal	balance;
	private Date	balanceAsOf;
	private Boolean	isBalanceStale;
	private String	currency;
	private String	activationAccountNumber;
	private BigDecimal	activationAmount;
	private Date	activationTimestamp;
	private String	activationLocation;
	private Integer	expirationDay;
	private Integer	expirationMonth;
	private Integer	expirationYear;
	private String	additionalRedemptionData;
	private AccountStatus	status;
	private String	barCodeValue;
	private String	balanceResponse;
}
