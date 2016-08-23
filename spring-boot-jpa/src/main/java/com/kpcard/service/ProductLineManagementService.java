package com.kpcard.service;

import java.util.List;

import com.kpcard.jpa.product.ProductLine;
import com.kpcard.jpa.product.ProductLineSummary;

/**
 * 상품라인 관리 서비스
 * @author happymoney
 *
 */
public interface ProductLineManagementService {
	
	/**
	 * @param bins BIN
	 * @param exactMatch 매칭옵션
	 * @param caseSensitive 대소문자구분
	 * @param first 시작번호
	 * @param maximum 최대갯수
	 * @param sortKey 정렬키
	 * @param ascending 순방량(true), 역방향(false)
	 * @return 상품라인 요약정보 리스트
	 */
	public List<ProductLineSummary> queryProductLinesByBankIdentificationNumbers(
			String bins,
			boolean exactMatch,
			boolean caseSensitive,
			int first,
			int maximum,
			String sortKey,
			boolean ascending);
	
	/**
	 * 브랜드로 상품 검색
	 * @param brandId 브랜드 아이디
	 * @return 상품라인 요약정보 리스트
	 */
	public List<ProductLineSummary> queryProductLinesByBrand(String brandId);
	
	/**
	 * @param first 시작번호
	 * @param maximum 최대갯수
	 * @param sortKey 정렬키
	 * @param ascending 순방량(true), 역방향(false)
	 * @param exactMatch 매칭옵션
	 * @param caseSensitive 대소문자구분
	 * @return 상품라인 요약정보 리스트
	 */
	public List<ProductLineSummary> queryProductLinesByCriteria(
			int first,
			int maximum,
			String sortKey,
			boolean ascending,
			boolean exactMatch,
			boolean caseSensitive);
	
	/**
	 * @param productLineIds
	 * @return 상품라인 요약정보 리스트
	 */
	public List<ProductLineSummary> queryProductLinesByIds(String[] productLineIds);
	
	/**
	 * 지원 기능으로 상품라인 검색
	 * @param supportedFeatures 지원기능
	 * @param exactMatch 매칭옵션
	 * @param caseSensitive 대소문자구분
	 * @param first 시작번호
	 * @param maximum 최대갯수
	 * @param sortKey 정렬키
	 * @param ascending 순방량(true), 역방향(false)
	 * @return 상품라인 요약정보 리스트
	 */
	public List<ProductLineSummary> queryProductLinesBySupportedFeatures(
			String supportedFeatures,
			boolean exactMatch,
			boolean caseSensitive,
			int first,
			int maximum,
			String sortKey,
			boolean ascending);
	
	/**
	 * 상품라인 가져오기
	 * @param productLineId 상품라인 아이디
	 * @return 상품라인 정보
	 */
	public ProductLine readProductLine(String productLineId);
	
	/**
	 * @param first 시작번호
	 * @param maximum 최대갯수
	 * @param sortKey 정렬키
	 * @param ascending 순방량(true), 역방향(false)
	 * @param exactMatch 매칭옵션
	 * @param caseSensitive 대소문자구분
	 * @return 상품라인 요약정보 리스트
	 */
	public List<ProductLineSummary> readProductLinesByCriteria(
			int first,
			int maximum,
			String sortKey,
			boolean ascending,
			boolean exactMatch,
			boolean caseSensitive);

}
