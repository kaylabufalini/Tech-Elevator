package com.techelevator;


public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
		
	}
	
	public int getEmployeeId() {
		
		return employeeId;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	
	public String getLastName() {
		
		return this.lastName;
	}
	
	public String getDepartment() {
		
		return this.department;
	}
	
	
	public double getAnnualSalary() {
		
		return this.annualSalary;
		
	}
	
	public void setDepartment(String department) {
		 this.department = department;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getFullName() {
		return this.lastName + ", " + this.firstName;
		
	}
	
	
	
	public void raiseSalary(double percent) {
		
		this.annualSalary = (annualSalary * (percent/100)) + annualSalary;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
