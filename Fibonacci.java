package com.techelevator;

import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		int firstNumber = 0;
		int secondNumber = 1;
		
		System.out.println("Please enter the Fibonacci number: ");
		String userInput = in.nextLine();
		Integer fibonacciNum = Integer.parseInt(userInput);
		
		// get help on why first+second <= fibonacci does not run quite all the way to fibonacci number
		// has to check first number not first+second because that doesn't change until after the new "first" gets printed in the loop 
		
		while (firstNumber <= fibonacciNum) {
			
			System.out.println(firstNumber + " ");
			
			sum = firstNumber + secondNumber;
			
			firstNumber = secondNumber;
			
			secondNumber = sum;
			
		}
				
		

	}

}
