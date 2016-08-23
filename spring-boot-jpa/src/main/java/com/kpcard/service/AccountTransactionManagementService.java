package com.kpcard.service;

public interface AccountTransactionManagementService {
	public void	createAccountTransaction();
	public void	readAccountTransaction();
	public void	correlateAccountTransactions();
	public void	queryAccountTransactionsById();
	public void	queryAccountTransactionsByAccountId();
	public void	queryAccountTransactionsByCorrelationId();
	public void	queryAccountTransactionsByCriteria();
}
