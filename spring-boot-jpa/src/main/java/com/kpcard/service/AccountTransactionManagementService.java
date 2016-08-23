package com.kpcard.service;

import java.util.List;

import com.kpcard.jpa.account.AccountTransaction;

/**
 * 트랜잭션 관리 서비스
 * @author happymoney
 *
 */
public interface AccountTransactionManagementService {
	
	/**
	 * 트랜잭션 저장
	 * @param accountTransaction 저장할 트랜잭션 정보
	 * @return 저장된 트랜잭션 정보
	 */
	public AccountTransaction	createAccountTransaction(AccountTransaction accountTransaction);
	
	/**
	 * 트랜잭션 가져오기
	 * @param accountTransactionId 트랜잭션 아이디
	 * @return 트랜잭션 정보
	 */
	public AccountTransaction	readAccountTransaction(String accountTransactionId);
	
	/**
	 * 트랜잭션을 그룹으로 묶기
	 * @param transactionIds 거래 아이디s)
	 * @return 트랜잭션 그룹 아이디
	 */
	public String	correlateAccountTransactions(String[] transactionIds);
	
	/**
	 * 트랜잭션 아이디로 트랜잭션 조회
	 * @param accountTransactionIds 트랜잭션 아이디(s)
	 * @return 트랜잭션 리스트
	 */
	public List<AccountTransaction>	queryAccountTransactionsById(String[] accountTransactionIds);
	
	/**
	 * Account 아이디로 트랜잭션 조회
	 * @param accountId Account 아이디
	 * @return 트랜잭션 리스트
	 */
	public List<AccountTransaction>	queryAccountTransactionsByAccountId(String accountId);
	
	/**
	 * 트랜잭션 그룹 아이디로 트랜잭션 조회
	 * @param correlationId
	 * @return 트랜잭션 리스트
	 */
	public List<AccountTransaction>	queryAccountTransactionsByCorrelationId(String correlationId);
	
	/**
	 * 트랜잭션 조건 검색
	 * @param first 시작번호
	 * @param maximum 최대갯수
	 * @param sortKey 정렬키
	 * @param ascending 순방량(true), 역방향(false)
	 * @param exactMatch 매칭옵션
	 * @param caseSensitive 대소문자구분
	 * @return 트랜잭션 리스트
	 */
	public List<AccountTransaction>	queryAccountTransactionsByCriteria(
			int first,
			int maximum,
			String sortKey,
			boolean ascending,
			boolean exactMatch,
			boolean caseSensitive);
}
