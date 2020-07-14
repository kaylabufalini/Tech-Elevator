package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {

	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accountList = new ArrayList<Accountable>();
	

	
	public Accountable[] getAccounts() {
	
	 return accountList.toArray(new Accountable[accountList.size()]);
	}

	
	
	public void addAccount(Accountable newAccount) {
		accountList.add(newAccount);
		
	}
	
	
	
	public boolean isVip() {
		
	int totalBalance = 0;
	
		for (Accountable accounts : accountList) {
		
		totalBalance += accounts.getBalance();
		
		}
			if (totalBalance >= 25000) {
			return true;
	
		}
			return false;
	}
	
	
	
	
	
	public String setName(String name) {
		return this.name = name;
	}
	
	public String setAddress(String address) {
		return this.address = address;
	}
	
	public String setPhoneNumber(String phoneNumber) {
		return this.phoneNumber = phoneNumber;
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}



	@Override
	public int getBalance() {
		return getBalance();
	}
	

	
	
}
