package com.techelevator;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	
	
	@Override
	public int withdraw(int amountToWithdraw) {
		
		if (amountToWithdraw > 0) {
			
			if (getBalance() < 150 && getBalance() > amountToWithdraw) {
				
				super.withdraw(amountToWithdraw + 2);
				
			} else if (getBalance() < amountToWithdraw) {
				
				super.withdraw(0);
			} else {
				
				super.withdraw(amountToWithdraw);
			}
			
		}
		return super.getBalance();
	}

	
}