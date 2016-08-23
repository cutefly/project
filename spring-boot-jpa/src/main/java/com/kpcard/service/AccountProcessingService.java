package com.kpcard.service;

import java.util.List;

import com.kpcard.jpa.account.AccountInformation;
import com.kpcard.jpa.account.AccountTransaction;
import com.kpcard.jpa.account.AccountTransaction2;
import com.kpcard.jpa.account.AccountTransactionHistory;
import com.kpcard.jpa.account.AccountTransactionHistoryResponse;
import com.kpcard.jpa.type.AccountType;
import com.kpcard.jpa.type.MessageReasonCode;
import com.kpcard.jpa.type.RedemptionOrder;

/**
 * Account 처리 서비스
 * @author happymoney
 *
 */
public interface AccountProcessingService {
	
	/**
	 * 카드 생성
	 * @param productId 상품아이디
	 * @param amount 금액
	 * @param currency 통화코드
	 * @param transactionTime 거래시간(클라이언트)
	 * @param retrievalReferenceNumber 주문번호
	 * @param storeNumber 점포코드
	 * @param terminalNumber 터미널번호
	 * @param baseTransactionId 원거래아이디
	 * @param messageReasonCode 메세지코드
	 * @return Account 정보
	 */
	public AccountInformation createAccount(String productId, 
			int amount, 
			String currency, 
			String transactionTime, 
			String retrievalReferenceNumber, 
			String storeNumber, 
			String terminalNumber, 
			String baseTransactionId, 
			MessageReasonCode messageReasonCode);

	/**
	 * 카드 정보 가져오기
	 * @param accountId 카드 아이디
	 * @return 카드 정보
	 */
	public AccountInformation getAccountInformation(String accountId);
	
	/**
	 * 카드 찾기
	 * @param accountNumber 카드 번호
	 * @param productLineId 상품라인 아이디
	 * @param pin 핀번호
	 * @param accountType 카드유형
	 * @return 카드 아이디
	 */
	public String lookupAccount(String accountNumber, String productLineId, String pin, AccountType accountType);
	
	/**
	 * 카드 정보 가져오기(잔액조회가 필요하지 않은 경우)
	 * @param accountId 카드 아이디
	 * @return Account 정보
	 */
	public AccountInformation readAccount(String accountId);	// 잔액조회가 필요하지 않은 경우
	
	/**
	 * 결제 트랜잭션
	 * @param accountId 카드 아이디
	 * @param amount 금액
	 * @param currency 통화코드
	 * @param transactionTime 거래시간
	 * @param retrievalReferenceNumber 주문번호
	 * @param storeNumber 점포코드
	 * @param terminalNumber 터미널번호
	 * @param baseTransactionId 원거래 아이디
	 * @param taxAmount 세금
	 * @param transactionFee 수수료
	 * @param messageReasonCode 메세지코드
	 * @param transactionDescription 거래메모
	 * @return 거래정보
	 */
	public AccountTransactionHistory redeemValue(String accountId, 
			int amount, 
			String currency, 
			String transactionTime, 
			String retrievalReferenceNumber, 
			String storeNumber,
			String terminalNumber,
			String baseTransactionId,
			int taxAmount,
			int transactionFee,
			MessageReasonCode messageReasonCode,
			String transactionDescription);
	
	/**
	 * 결제 트랜잭션(복수카드)
	 * @param accounts 카드 아이디(s)
	 * @param amount 금액 
	 * @param currency 통화코드
	 * @param redemptionOrder 리뎀순서
	 * @param transactionTime 거래시간
	 * @param retrievalReferenceNumber 주문번호
	 * @param storeNumber 점포코드
	 * @param terminalNumber 터미널번호
	 * @param baseTransactionId 원거래번호
	 * @param transactionDescription 거래메모
	 * @return 상세거래정보
	 */
	public AccountTransactionHistoryResponse redeemValues(String[] accounts, 
			int amount, 
			String currency, 
			RedemptionOrder redemptionOrder,
			String transactionTime,
			String retrievalReferenceNumber,
			String storeNumber,
			String terminalNumber,
			String baseTransactionId,
			String transactionDescription);
	
	/**
	 * 재충전 거래
	 * @param accountId 카드 아이디
	 * @param amount 금액
	 * @param currency 통화코드
	 * @param productId 상품 아이디
	 * @param transactionTime 거래시간
	 * @param retrievalReferenceNumber 주문번호
	 * @param storeNumber 점포코드
	 * @param terminalNumber 터미널번호
	 * @param baseTransactionId 원거래번호
	 * @param transactionDescription 거래메모
	 * @param messageReasonCode 메세지코드
	 * @return 거래정보
	 */
	public AccountTransaction reloadValue(String accountId,
			int amount,
			String currency,
			String productId,
			String transactionTime,
			String retrievalReferenceNumber,
			String storeNumber,
			String terminalNumber,
			String baseTransactionId,
			String transactionDescription,
			MessageReasonCode messageReasonCode);
	
	/**
	 * 거래이력 가져오기
	 * @param accountId 카드 아이디
	 * @param startDate 시작일
	 * @param endDate 끝일
	 * @param requestCount 조회 갯
	 * @return 상세거래이력
	 */
	public AccountTransactionHistoryResponse retrieveAccountTransactionHistory(String accountId, String startDate, String endDate, int requestCount);
	
	/**
	 * 망취소 거래
	 * @param reversalTxnRequestId 트랜잭션 아이디
	 * @return 거래정보
	 */
	public AccountTransaction reverseAccountTransaction(String reversalTxnRequestId);
	
	/**
	 * 다중 망취소
	 * @param reversalTxnRequestId 트랜잭션 아이디
	 * @return 거래정보목록
	 */
	public List<AccountTransaction> reverseMultipleTransactions(String reversalTxnRequestId);
	
	/**
	 * 잔액이체
	 * @param sourceAccountId 이체대상 아이디
	 * @param destinationAccountId 받을 아이디
	 * @param amount 금액
	 * @param currency 통화코드
	 * @param transactionTime 거래시간
	 * @param retrievalReferenceNumber 주문번호
	 * @param storeNumber 점포코
	 * @param terminalNumber 터미널번호
	 * @param baseTransactionId 원거래 아이디
	 * @return 거래정보
	 */
	public AccountTransaction transferFunds(String sourceAccountId,
			String destinationAccountId,
			int amount,
			String currency,
			String transactionTime,
			String retrievalReferenceNumber,
			String storeNumber,
			String terminalNumber,
			String baseTransactionId);
	
	/**
	 * Account 확인
	 * @param accountNumber 카드 번호
	 * @param productLineId 상품라인 아이디
	 * @param pin 핀번호
	 * @param accountType Account 유형
	 * @return 카드 정보
	 */
	public AccountInformation verifyAccount(String accountNumber, String productLineId, String pin, AccountType accountType);
	
	/**
	 * 환불
	 * @param accountTxnId 트랜잭션 아이디
	 * @param transactionTime 거래 시간
	 * @param retrievalReferenceNumber 주문번호
	 * @param storeNumber 점포코
	 * @param terminalNumber 터미널번호
	 * @param baseTransactionId 원거래번호
	 * @return 거래정보
	 */
	public AccountTransaction voidAccountTransaction(String accountTxnId,
			String transactionTime,
			String retrievalReferenceNumber,
			String storeNumber,
			String terminalNumber,
			String baseTransactionId);
}
