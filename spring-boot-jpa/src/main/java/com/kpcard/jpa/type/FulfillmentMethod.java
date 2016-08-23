package com.kpcard.jpa.type;

/**
 * 주문처리 방법
 * @author happymoney
 *
 */
public enum FulfillmentMethod {
	SHIPMENT,	// 배송
	EMAIL,		// 이메일
	URL,		// URL
	IMAGEDATA,	// 이미지
	SMS			// SMS
}
