package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		double newTemp = 0;
	

		System.out.println("Please enter the temperature: ");
		
		Scanner in = new Scanner(System.in);
		
		String userTemp = in.nextLine();
		Integer userTempInt = Integer.parseInt(userTemp);
		
		
		System.out.println("Is this temperature in Celsius (0) or Farenheit (1) ?");	
		String userInput = in.nextLine();
		
		Integer userUnits = Integer.parseInt(userInput);
		
		if (userUnits == 0) {
			newTemp = (userTempInt * 1.8) + 32;
			int intNewTemp = (int) newTemp;
			System.out.println(userTempInt + "C is " + intNewTemp + "F.");
		} else {
			newTemp = (userTempInt - 32) / 1.8;
			int intNewTemp = (int) newTemp;
			System.out.println(userTempInt + "F is " + intNewTemp + "C.");
		}
			
	}

}
