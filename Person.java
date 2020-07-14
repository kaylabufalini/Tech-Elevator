package com.techelevator.person;

public class Person {

private String firstName;
private String lastName;
private int age;


public String setFirstName(String firstName) {
	
	return this.firstName = firstName;
	
}
	
public String setLastName(String lastName) {
	
	return this.lastName = lastName;
}
	
public int setAge(int age) {
	
	return this.age = age;
}


public String getFirstName() {
	
	return firstName;
	
}

public String getLastName() {
	
	return lastName;
	
}


public int getAge() {
	
	return age;
}



public String getFullName() {
	
	
	return firstName + " " + lastName;
	
}

public boolean isAdult() {
	
	if (age >= 18) {
		
		return true;
	}
	
	else {
		
		return false;
	}
	

	
}





}
