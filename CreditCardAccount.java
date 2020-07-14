package com.techelevator;

public class CreditCardAccount implements Accountable {
	
	private String accountHolder;
	private String accountNumber;
	private int debt = 0;
	
	public CreditCardAccount(String accountHolder, String accountNumber) {
		
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		
	}
	
	public String getAccountHolder() {
		return this.accountHolder;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public int getDebt() {
		return this.debt;
	}

	@Override
	public int getBalance() {

		return -debt;
	}
	
	
	public int pay(int amountToPay) {
		
		return debt -= amountToPay;
		
	}
	
	public int charge(int amountToCharge) {
		
		return debt += amountToCharge;
		
	}

	
	
	
	
	
	
	
}
