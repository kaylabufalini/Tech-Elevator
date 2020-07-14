package com.techelevator;


public class TriangleWall extends Wall {
	
	private String name;
	private String color;
	private int base;
	private int height;
	
	

	public TriangleWall(String name, String color, int base, int height) {
		super(name, color);
		this.name = name;
		this.color = color;
		this.base = base;
		this.height = height;
	
	}
	
	
	public int getBase() {
		return this.base;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	
	@Override
	public int getArea() {
		return (base * height) / 2;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.base + "x" + height + ") " + "triangle";
	}
	
	
	
	

}
