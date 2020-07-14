package com.techelevator;

public class SquareWall extends RectangleWall {

	private String name;
	private String color;
	private int sideLength;
	
	
	
	
	public SquareWall(String name, String color, int sideLength) {
		super(name, color, sideLength, sideLength);
		this.name = name;
		this.color = color;
		this.sideLength = sideLength;
		
	}

	
	@Override
	public String toString() {
		return name + " (" + sideLength + "x" + sideLength + ") " + "square";
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getSideLength() {
		return this.sideLength;
	}
	
	
	
	
	
}
