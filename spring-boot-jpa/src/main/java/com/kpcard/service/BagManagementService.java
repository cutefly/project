package com.kpcard.service;

import java.util.List;

import com.kpcard.jpa.bag.Bag;
import com.kpcard.jpa.bag.BagSummary;

/**
 * 지갑 관리 서비스
 * @author happymoney
 *
 */
public interface BagManagementService {
	
	/**
	 * 지갑 생성하기
	 * @param bag 생성할 정보
	 * @return 생성된 지갑
	 */
	public Bag CreateBag(Bag bag);
	
	/**
	 * 지갑정보 가져오기
	 * @param bagId 지갑 아이디
	 * @return 지갑 정보
	 */
	public Bag ReadBag(String bagId);
	
	/**
	 * 지갑정보 수정하기
	 * @param bagId 지갑 아이디
	 * @param bag 수정할 지갑 정보
	 * @return 수정된 지갑정보
	 */
	public Bag UpdateBag(String bagId, Bag bag);
	
	/**
	 * 지갑정보 삭제하기
	 * @param bagId 지갑아이디
	 * @return 삭제 성공여부
	 */
	public boolean DeleteBag(String bagId);
	
	public List<BagSummary> QueryBagsByIds(String bagIds);
	
	/**
	 * 지갑 조건 검색
	 * @param first 시작번호
	 * @param maximum 최대갯수
	 * @param sortKey 정렬키
	 * @param ascending 순방량(true), 역방향(false)
	 * @param exactMatch 매칭옵션
	 * @param caseSensitive 대소문자구분
	 * @return 지갑 요약정보 리스트
	 */
	public List<BagSummary> QueryBagsByCriteria(
			int first,
			int maximum,
			String sortKey,
			boolean ascending,
			boolean exactMatch,
			boolean caseSensitive);
	
	/**
	 * 소유자 아이디로 지갑 검색
	 * @param ownerId 소유자 아이디
	 * @param first 시작번호
	 * @param maximum 최대개수
	 * @param sortKey 정렬키
	 * @param ascending 순방량(true), 역방향(false)
	 * @return
	 */
	public List<BagSummary> QueryBagsByOwner(
			String ownerId,
			int first,
			int maximum,
			String sortKey,
			boolean ascending);
	
	/**
	 * 상품라인에 포함된 카드개수
	 * @param productLineId 상품라인 아이디
	 * @param companyId 회사 아이디
	 * @return
	 */
	public int QueryCountOfCardsByProductLine(String productLineId, String companyId);
	
	/**
	 * 선물 전달
	 * @param bagIdOrigin 보낼 지갑 아이디
	 * @param bagIdDestination 받을 지갑아이디
	 * @param cardIds 카드번호
	 * @return 전달 성공여부
	 */
	public boolean RegiftCardsForBag(String bagIdOrigin, String bagIdDestination, String[] cardIds);
}
