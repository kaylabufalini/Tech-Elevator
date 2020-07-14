package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter in a series of decimal values (seperated by spaces): ");
		String userInput = in.nextLine();
		String[] userInputArray = userInput.split(" ");
		int[] intUserArray = new int[userInputArray.length];
		
		for (int i=0; i < userInputArray.length; i++) {
		
			intUserArray[i] = Integer.parseInt(userInputArray[i]); 
		}
		
	
		
		for (int i = 0; i < userInputArray.length; i++) {
			
			System.out.println(userInputArray[i] + " in Binary is " + Integer.toBinaryString(intUserArray[i]));
			
		}
	
		
	}

}
