package com.SpringAssignments.SpringAssignment3.service;

import java.util.List;

import com.SpringAssignments.SpringAssignment3.pojo.BankAccount;



public class BankAccountepositoryImpl implements BankAccountRepository{
	private List<BankAccount> accounts;
 public BankAccountepositoryImpl(){}
	
 
 public BankAccountepositoryImpl(List<BankAccount> accounts) {
		super();
		this.accounts = accounts;
	}
	
	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
	public double getBalance(long accountId) {
		double bal=0;
		for(BankAccount bank:accounts)
			{
			if(accountId==bank.getAccountId()){
			 bal=bank.getAccountBalance();
			}
			}
			
		return bal;
	}

	@Override
	public double updateBalance(long accountId, double newBalance ) {
		double bal=0;
		for(BankAccount bank:accounts)
			{
			if(accountId==bank.getAccountId()){
				bank.setAccountBalance(newBalance);
				bal=bank.getAccountBalance();
			}
			}
		return bal;
	}

}
