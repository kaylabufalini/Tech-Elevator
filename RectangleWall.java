package com.techelevator;



public class RectangleWall extends Wall {
	
	private String name;
	private String color;
	private int length;
	private int height;
	
	 public RectangleWall(String name, String color, int length, int height) {
			super(name, color);
			this.length = length; 
			this.height = height;
			this.name = name;
			this.color = color;
	
	 }
	 
		
	@Override
	public int getArea() {
		return length * height;
	}
	
	
	@Override
	public String toString() {
		return name + " (" + length + "x" + height + ") " + "rectangle"; 
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	
	
}
