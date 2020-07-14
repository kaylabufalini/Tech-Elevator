package com.techelevator.dog;

public class Dog {

	private boolean isSleeping = false;
	
	public boolean isSleeping() {
		return isSleeping;
	}
	
	public void sleep() {
		
		this.isSleeping = true;
		
	}
	
	public void wakeUp() {
		
		this.isSleeping = false;
	}
	
	public String makeSound() {
		
		if (isSleeping) {
		
			return "Zzzzz...";
			
		} else {
			
		return "Woof!";
		
		}
	}

}