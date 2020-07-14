package com.techelevator.company;


public class Company {

	private String name;
	
	private int numberOfEmployees;
	
	private double revenue;
	
	private double expenses;
	

		public String setName(String name) {
		
		return this.name = name;
		
		}
	
		public String getName() {
		
		return name;
		}
	
	
		public int setNumberOfEmployees(int numEmployees) {
		
		return this.numberOfEmployees = numEmployees;
		
		}
	
		public int getNumberOfEmployees() {
			
			return numberOfEmployees;
		}
	
		
		public double setRevenue(double revenue) {
			
			 return this.revenue = revenue;
			
		}
	
		public double getRevenue() {
			
			return this.revenue;
			
		}
	
		public double setExpenses(double expenses) {
			
			return this.expenses = expenses;
			
		}
		
		public double getExpenses() {
			
			return expenses;
			
		}
		
		
	public String getCompanySize() {
		
		if (this.numberOfEmployees <= 50) {
			
			return "small";
			
		}
		
		if (this.numberOfEmployees > 50 && this.numberOfEmployees <= 250) {
			
			return "medium";
			
		}  
		
		if (this.numberOfEmployees > 250) {
			
			return "large";
			
		} else {
	
			return null;
		}
		
		}
		
	
		public double getProfit() {
			
			return (this.revenue - this.expenses);
			
		}
	
	
}

