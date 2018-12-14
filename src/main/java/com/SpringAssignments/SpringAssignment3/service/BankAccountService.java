package com.SpringAssignments.SpringAssignment3.service;

public interface BankAccountService {
	public double withdraw(long accountId, double balance);
	public double deposit(long accountId, double balance);
	public boolean fundTransfer(long fromAccount, long toAccount, double amont);
	public double getBalance(long accountId);
}
