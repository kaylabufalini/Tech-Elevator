package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;


public class Exercises {

	/*
	 * Map Exercises
	 */

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		
		Map<String, String> animalsGroup = new HashMap<String, String>();
		
		animalsGroup.put("RHINO", "Crash");
		animalsGroup.put("GIRAFFE", "Tower");
		animalsGroup.put("ELEPHANT", "Herd");
		animalsGroup.put("LION", "Pride");
		animalsGroup.put("CROW", "Murder");
		animalsGroup.put("PIGEON", "Kit");
		animalsGroup.put("FLAMINGO", "Pat");
		animalsGroup.put("DEER", "Herd");
		animalsGroup.put("DOG", "Pack");
		animalsGroup.put("CROCODILE", "Float");
		
		String animalNameUpper = animalName.toUpperCase();
		
		if (animalsGroup.containsKey(animalNameUpper)) {
	
			return animalsGroup.get(animalNameUpper);
			
		} else {
		
		return "unknown";
		}
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public Double isItOnSale(String itemNumber) {
		
	String itemNumberUpper = itemNumber.toUpperCase();
	
	Map<String, Double> isItOnSale = new HashMap<String, Double>();
	
	isItOnSale.put("KITCHEN4001", 0.20);
	isItOnSale.put("GARAGE1070", 0.15);
	isItOnSale.put("LIVINGROOM", 0.10);
	isItOnSale.put("KITCHEN6073", 0.40);
	isItOnSale.put("BEDROOM3434", 0.60);
	isItOnSale.put("BATH0073", 0.15);
	
	if (isItOnSale.containsKey(itemNumberUpper)) {
		
		return isItOnSale.get(itemNumberUpper);
		
	} else {
		
		return 0.00;
		
		}	
		
	}
		
		
		


	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		
		if (peterPaul.get("Peter") != 0) {
			
			if (peterPaul.get("Paul") < 1000) {
				
				int pay = peterPaul.get("Peter") / 2;
				peterPaul.put("Peter", peterPaul.get("Peter") - pay);
				peterPaul.put("Paul", peterPaul.get("Paul") + pay);
			}
			
		}
		
		
		return peterPaul;
	}

    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		
		if (peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000) {
			
			int quarterPeter = peterPaul.get("Peter") / 4;
			int quarterPaul = peterPaul.get("Paul") / 4;
			
			peterPaul.put("Peter", peterPaul.get("Peter") - quarterPeter);
			peterPaul.put("Paul", peterPaul.get("Paul") - quarterPaul);
			peterPaul.put("PeterPaulPartnership", quarterPeter + quarterPaul);
			
			
		}
		
		return peterPaul;
	}

	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		
		
		Map<String, String> firstLastList = new HashMap<String, String>();
		
			for(String firstLast : words) {
		
				firstLastList.put(firstLast.substring(0,1), firstLast.substring(firstLast.length()-1));
			
			}
		
		
		return firstLastList;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the
	 * number of times that string appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		
		
		Map<String, Integer> letterCount = new HashMap<String, Integer>();
		
		int timesLetterAppears = 0;
		
		
		for (String addLetter : words) {
			
			if (addLetter == null || addLetter == "") {
				return null;
			}
			
			else if (letterCount.containsKey(addLetter)) {
				
				timesLetterAppears = letterCount.get(addLetter) + 1;
				letterCount.put(addLetter, timesLetterAppears);
				
			} else {
			
			letterCount.put(addLetter, 1);

		}
		}
		return letterCount;

	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		
		Set<Integer> uniqueInts = new HashSet<Integer>();
		
		for (int i : ints) {
			uniqueInts.add(i);
		}
		
		for (int i : uniqueInts) {
			for (int num : ints) {
				if (i == num) {
					if (counts.containsKey(i)) {
					counts.put(i, counts.get(i)+1);
				} else {
					counts.put(i, 1);
				}
			}
		}	
	}
		return counts;
	}

	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		
		Map<String, Integer> wordMultiple = new HashMap<String, Integer>();
		
		Map<String, Boolean> wordMultipleTF = new HashMap<String, Boolean>();
		
		
		int timesLetterAppears = 0;
		
		
		for (String addLetter : words) {
			
			if (addLetter == null || addLetter == "") {
				
				return null;
			}
			
			else if (wordMultiple.containsKey(addLetter)) {
				
					timesLetterAppears = wordMultiple.get(addLetter) + 1;
					wordMultiple.put(addLetter, timesLetterAppears);
					
			 } else {
					
				wordMultiple.put(addLetter, 1);

				}
			}
		
		for (String addLetter : words) {
			
			if (wordMultiple.get(addLetter) >= 2) {
				
				wordMultipleTF.put(addLetter, true);
				
			} else {
				
				wordMultipleTF.put(addLetter, false);
			}
 			
		}
		
		return wordMultipleTF;
	}
				
			
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2,
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 *
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		
		Map<String, Integer> consolidateInventory = new HashMap<String, Integer>();
		
		for (String mainInv : mainWarehouse.keySet()) {
			
			if (remoteWarehouse.containsKey(mainInv)) {
				
				consolidateInventory.put(mainInv, mainWarehouse.get(mainInv) + remoteWarehouse.get(mainInv));
			} else {
				
				consolidateInventory.put(mainInv, mainWarehouse.get(mainInv));
				
			}
			
		}
		
		
		for (String remoteInv : remoteWarehouse.keySet()) {
			
			if (!mainWarehouse.containsKey(remoteInv)) {
				
				consolidateInventory.put(remoteInv, remoteWarehouse.get(remoteInv));
				
			}
			
		}
		
		
		return consolidateInventory;
		
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1.
	 *
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		
		Map<String, Integer> last2 = new LinkedHashMap<String, Integer>();
		
			
		for (String subString : words) {
			
			if (subString.length() < 2 ) {
				return null;
			}
			
			String lastTwo = subString.substring(subString.length() - 2);
			
		
		
		int count = 0;
		
		for (int i = 0; i < subString.length() - 2; i++) {
	
			if (subString.substring(i, i+2).contains(lastTwo)) {
				
				count += 1;
			}
			
			last2.put(subString, count);
		}
		
	}
		return last2;
	}
	
		

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		

		List<String> disctinctValueList = new ArrayList<String>();
		
		Set<String> disctinctValues = new LinkedHashSet<String>();
		
		
		for (String word : stringList) {
						
			disctinctValues.add(word);
			
		}
		
		for (String wordTwo : disctinctValues) {
		
			disctinctValueList.add(wordTwo);
			
		}
	
		return disctinctValueList;
	}
}
