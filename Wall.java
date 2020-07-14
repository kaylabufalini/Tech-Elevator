package com.techelevator;


abstract class Wall extends PaintCalculator {
	
	private String name;
	private String color;


	public Wall(String name, String color) {
		
	}
	
	
	public abstract int getArea();
	
	public String getName() {
		return this.name;
	}
	
	
	public String getColor() {
		return this.color;
	}

	public String setName(String name) {
		return this.name = name;
	}
	
	public String setColor(String color) {
		return this.color = color;
	}
}


