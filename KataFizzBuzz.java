package com.techelevator;


public class KataFizzBuzz {
	
	private String result;
	
	public String fizzBuzz(int num) {
			
		 
		if ((num % 5 == 0 &&
			num % 3 == 0) || (Integer.toString(num).contains("3") && Integer.toString(num).contains("5")) ) {
				result = "FizzBuzz";
			}
		
		else if (num % 3 == 0 || Integer.toString(num).contains("3")) {
			result = "Fizz";
		}

	
		else if (num % 5 == 0 || Integer.toString(num).contains("5")) {
			result = "Buzz";
		}
	
		
		else if ((num >= 1 && num <= 100) && (num % 3 != 0 && num % 5 != 0)) {
			result = Integer.toString(num);
		}
		
		else {
			
			result = "";
			
		}
	
	return result;

	}
	
	
//	private String isDivisiblebyorContains3(int num) {
//		
//		if ((num % 3 == 0 && 
//			num % 5 != 0) || 
//			(Integer.toString(num).contains("3"))) {
//			result = "Fizz";
//		}
//			
//	}
	

}