package com.techelevator;

import java.util.Scanner;


public class LinearConvert {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the length: ");
		String userInput = in.nextLine();
		Integer userLength = Integer.parseInt(userInput);
		
		System.out.println("Is the measurement in meter(0) or feet(1) ?");
		String userUnit = in.nextLine();
		Integer inputUnits = Integer.parseInt(userUnit);
		
		
		if (inputUnits == 0) {
			double convToFeet = userLength * 3.2808399;
			System.out.println(userLength + "m is " + convToFeet + "f.");
		} else {
			double convToMeter = userLength * 0.3048;
			System.out.println(userLength + "f is " + convToMeter + "m.");
		}
	

		
	}

}
