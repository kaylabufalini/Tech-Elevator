package com.techelevator;


public class HomeworkAssignment {

	private int totalMarks = 0;
	private int possibleMarks;
	private String submitterName;
	

	public HomeworkAssignment(int possibleMarks) {
		
		this.possibleMarks = possibleMarks;
	}
	
	public int getPossibleMarks() {
		
		return possibleMarks;
		
	}
	
	public void setTotalMarks(int totalMarks) {
		
		 this.totalMarks = totalMarks;
		
	}
	
	
	public void setSubmitterName(String submitterName) {
		
		this.submitterName = submitterName;
	}
	
	
	public int getTotalMarks() {
		return totalMarks;
	}

	
	public String getSubmitterName() {
		return submitterName;
	}
	
	
	public String getLetterGrade() {
		
		double result = ((double) totalMarks / (double) possibleMarks) * 100;
		
		if (result >= 90) {
			return "A";
		} else if (result >= 80) {
			return "B";
		} else if (result >= 70) {
			return "C";			
		} else if (result >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	
	
	
	
	
	
	
	
	
}
