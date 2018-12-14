package com.SpringAssignments.SpringAssignment3.service;

public interface BankAccountRepository {
	public double getBalance(long accountId);

	double updateBalance(long accountId, double newBalance);
}
