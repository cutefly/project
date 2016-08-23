package com.kpcard.service;

import java.util.List;

import com.kpcard.jpa.product.ProductCatalog;
import com.kpcard.jpa.product.ProductCatalogSummary;

/**
 * 상품카탈로그 관리 서비스
 * @author happymoney
 *
 */
public interface ProductCatalogManagementService {
	/**
	 * 카탈로그 아이디와 상품아이디로 상품 목록 필터링
	 * @param catalogId 카탈로그 아이디
	 * @param productIds 상품아이디(s)
	 * @return 상품아이디 리스트
	 */
	public List<String> filterProductsByCatalog(String catalogId, String[] productIds);
	
	/**
	 * 카탈로그 버전 조회
	 * @param catalogId 카탈로그 아이디
	 * @return 카탈로그 버전
	 */
	public int getProductCatalogVersion(String catalogId);
	
	/**
	 * 카탈로그 정보 조회
	 * @param catalogId 카탈로그 아이디
	 * @return 카탈로그 상세정보
	 */
	public ProductCatalog readProductCatalog(String catalogId);
	
	/**
	 * 전체 상품 카탈로그 조회
	 * @return 상품카탈로그 요약정보 리스트
	 */
	public List<ProductCatalogSummary> QueryAllProductCatalogs();
	
	/**
	 * 상품정보 리스트 조회
	 * @param first 시작인덱스
	 * @param maximum 최대갯수
	 * @param sortKey 정렬 키
	 * @param ascending 정렬여부
	 * @param exactMatch 조건 일치여부
	 * @param caseSensitive 대소문자 구분
	 * @return 상품카탈로그 요약정보 리스트
	 */
	public List<ProductCatalogSummary> queryProductCatalogsByCriteria(
			int first, 
			int maximum,
			String sortKey,
			boolean ascending,
			boolean exactMatch,
			boolean caseSensitive);

	/**
	 * 상품아이디(s)로 상품카탈로그 조회
	 * @param productIds 상품아이디(s)
	 * @return 상품카탈로그 요약정보 리스트
	 */
	public List<ProductCatalogSummary> queryProductCatalogsByIds(String[] productIds);
	
	/**
	 * 상품명으로 상품카탈로그 조회
	 * @param productName 상품명
	 * @return 상품카탈로그 요약정보 리스트
	 */
	public List<ProductCatalogSummary> queryProductCatalogsByName(String productName);
	
	/**
	 * 상품아이디로 상품카탈로그 조회
	 * @param productId 상품 아이디
	 * @return 상품카탈로그 요약정보 리스트
	 */
	public List<ProductCatalogSummary> queryProductCatalogsProduct(String productId);
}
