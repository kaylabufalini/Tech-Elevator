package com.techelevator.calculator;

public class Calculator {

private int result = 0;

public int getResult() {
	
	return result;
	
}
	
public int add(int addend) {
	
	return result += addend;
	
}

	
public int multiply(int multiplier) {
	
	return result *= multiplier;
	
}
	

public int power(int exponent) {
	
	 result = (int) Math.pow(result, Math.abs(exponent));
	 return result;
	
}
	
public void reset() {
	
	result = 0;
	
}
	
public int subtract(int subtrahend) {
	
	result -= subtrahend;
	return result;
	
}
	
	
	
	
}
