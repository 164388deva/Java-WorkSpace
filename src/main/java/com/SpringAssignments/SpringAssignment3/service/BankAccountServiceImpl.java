package com.SpringAssignments.SpringAssignment3.service;

import com.SpringAssignments.SpringAssignment3.pojo.BankAccount;

public class BankAccountServiceImpl implements BankAccountService {
	private BankAccountepositoryImpl bankRepository;

	@Override
	public double withdraw(long accountId, double balance) {
		double newBal = 0;
		for (BankAccount bank : bankRepository.getAccounts()) {
			if (bank.getAccountId() == accountId) {
				if (balance < bank.getAccountBalance()) {

					newBal = bank.getAccountBalance() - balance;

				} else {
					System.out.println("insufficient amount");
				}
			}
		}
		return bankRepository.updateBalance(accountId, newBal);
	}

	public BankAccountepositoryImpl getBankRepository() {
		return bankRepository;
	}

	public void setBankRepository(BankAccountepositoryImpl bankRepository) {
		this.bankRepository = bankRepository;
	}

	@Override
	public double deposit(long accountId, double balance) {

		double newBal = 0;
		for (BankAccount bank : bankRepository.getAccounts()) {
			if (bank.getAccountId() == accountId) {
				newBal = bank.getAccountBalance() + balance;
			} else {
				System.out.println("insufficient amount");
			}

		}
		return bankRepository.updateBalance(accountId, newBal);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		BankAccount fromBankAcc = null, toBankAcc = null;
		
		for (BankAccount bank : bankRepository.getAccounts()) {
			if (bank.getAccountId() == fromAccount) {
				fromBankAcc = bank;
			} 
			if (bank.getAccountId() == toAccount) {
				toBankAcc = bank;
			} 
		}
		

		if (fromBankAcc.getAccountBalance() > amont) {
			bankRepository.updateBalance(fromBankAcc.getAccountId(),
					fromBankAcc.getAccountBalance() - amont);
			bankRepository.updateBalance(toBankAcc.getAccountId(),
					toBankAcc.getAccountBalance() + amont);
			return true;
		}

		return false;
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return bankRepository.getBalance(accountId);
	}

}
