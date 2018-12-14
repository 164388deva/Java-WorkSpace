package com.SpringAssignments.SpringAssignment3.pojo;

public class BankAccount {
	
	private String  accountHolderName, accountType;
	private long accountId;
	private double accountBalance;
	public BankAccount(){}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName
				+ ", accountType=" + accountType + ", accountId=" + accountId
				+ ", accountBalance=" + accountBalance + "]";
	}
}
