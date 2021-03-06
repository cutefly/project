package com.kpcard.jpa.type;

/**
 * 거래유형
 * @author happymoney
 *
 */
public enum AccountTransactionType {
	ACCOUNT_ACTIVATION,
	ACCOUNT_RELOAD,
	ACCOUNT_REDEMPTION,
	ACCOUNT_FUNDS_TRANSFER,
	PAYMENT_AUTHORIZATION,
	PAYMENT_AUTHORIZATION_CAPTURE,
	PAYMENT_CAPTURE,
	PAYMENT_REFUND,
	PAYMENT_CANCEL,
	DIGITAL_ACCOUNT_REQUEST,
	ACCOUNT_INQUIRY,
	SHIPMENT, RELOAD_IT
}
