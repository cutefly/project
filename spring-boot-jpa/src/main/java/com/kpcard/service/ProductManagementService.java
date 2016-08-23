package com.kpcard.service;

import java.util.List;

import com.kpcard.jpa.product.Product;
import com.kpcard.jpa.product.ProductSummary;

/**
 * 상품 관리 서비스
 * @author happymoney
 *
 */
public interface ProductManagementService {
	
	/**
	 * 상품목록 검색
	 * @param first 시작인덱스
	 * @param maximum 최대갯수
	 * @param sortKey 정렬 키
	 * @param ascending 정렬여부
	 * @param exactMatch 조건 일치여부
	 * @param caseSensitive 대소문자 구분
	 * @return 상품요약정보 리스트
	 */
	public List<ProductSummary> queryProductsByCriteria(
			int first,
			int maximum,
			String sortKey,
			boolean ascending,
			boolean exactMatch,
			boolean caseSensitive);
	
	/**
	 * 상품아이디(s)로 상품조회
	 * @param productIds 상품아이디(s)
	 * @return 상품요약정보 리스트
	 */
	public List<ProductSummary> queryProductsByIds(String[] productIds);
	
	/**
	 * 검색어로 상품조회
	 * @param keyword 검색어
	 * @param exactMatch 조건 일치여부
	 * @param caseSensitive 대소문자 구분
	 * @param first 시작인덱스
	 * @param maximum 최대갯수
	 * @param sortKey 정렬 키
	 * @param ascending 정렬여부
	 * @return 상품요약정보 리스트
	 */
	public List<ProductSummary> queryProductsbyKeyword(
			String keyword,
			boolean exactMatch,
			boolean caseSensitive,
			int first,
			int maximum,
			String sortKey,
			boolean ascending);
	
	/**
	 * 상품라인으르 상품조회
	 * @param productLineId 상품라인 아이디
	 * @return 상품요약정보 리스트
	 */
	public List<ProductSummary> queryProductsByProductLine(String productLineId);
	
	/**
	 * 유형에 따른 상품조회
	 * @param provisioningType 유형(실물, 비실물)
	 * @return 상품요약정보 리스트
	 */
	public List<ProductSummary> queryProductsByProvisioningType(String provisioningType);
	
	/**
	 * 설정 아이디로 상품 조회
	 * @param configurationId 설정 아이디
	 * @return 상품요약정보 리스트
	 */
	public List<ProductSummary> queryProductsByConfigurationId(String configurationId);
	
	/**
	 * 아이템 아이디로 상품 조회
	 * @param itemId 아이템 아이디
	 * @return 상품요약정보 리스트
	 */
	public List<ProductSummary> queryProductsByItemId(String itemId);
	
	/**
	 * @param productId 상품아이디
	 * @return 상품정
	 */
	public Product readProduct(String productId);
}
