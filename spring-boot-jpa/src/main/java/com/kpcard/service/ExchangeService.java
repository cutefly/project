package com.kpcard.service;

import java.util.List;

import com.kpcard.jpa.exchange.Card;
import com.kpcard.jpa.exchange.CardHolder;
import com.kpcard.jpa.exchange.CardQuote;
import com.kpcard.jpa.exchange.ProductLine;

/**
 * 교환서비스
 * @author happymoney
 *
 */
public interface ExchangeService {
	
	/**
	 * 교환가능 상품조회
	 * @param fitst 시작번호
	 * @param maximum 최대갯수
	 * @param ascending 정렬순서
	 * @param sortKey 정렬키
	 * @return
	 */
	public List<ProductLine> supportedProductLines(
			int fitst,
			int maximum,
			boolean ascending,
			String sortKey);
	
	/**
	 * 교환카드의 상태 확인
	 * @param card 대상카드
	 * @return 카드 상태정보
	 */
	public CardQuote getQuote(Card card);
	
	/**
	 * 카드교환 유효성(부정사용방지)
	 * @param card 카드정보
	 * @param cardHolder 카드보유자
	 * @param storeId 교환처 아이디
	 * @return
	 */
	public boolean fraudCheck(Card card, CardHolder cardHolder, String storeId);
	
	/**
	 * 카드교환
	 * @param card 카드정보
	 * @param cardHolder 카드보유자
	 * @param corelationId 관련거래 아이디
	 * @param storeId 교환처 아이디
	 * @return
	 */
	public CardQuote acquireCard(Card card, CardHolder cardHolder, String corelationId, String storeId);

	/**
	 * 카드교환 망취소
	 * @param originalRequestId 원거래 아이디
	 * @return 취소 거래아이디
	 */
	public String acquireCardReversal(String originalRequestId);
	
}
