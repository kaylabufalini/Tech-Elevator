package com.techelevator;

public class Elevator {
	
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	
	
	public Elevator(int totalNumberOfFloors) {
		this.numberOfFloors = totalNumberOfFloors;
	}
	
	
	public int getCurrentFloor() {
		
		return this.currentFloor;
	}
	
	
	public int getNumberOfFloors() {
		return this.numberOfFloors;
	}
	
	public boolean getDoorOpen() {
		return this.doorOpen;
	}
	
	public void openDoor() {
		
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	public boolean isDoorOpen() {
		if (doorOpen == true) {
			return true;
		}
		return false;
	}
	
	
	
	
	public void goUp(int desiredFloor) {
		
		if (doorOpen == false && (desiredFloor >= currentFloor) && desiredFloor <= numberOfFloors) {
			this.currentFloor = desiredFloor;
		}
	}
	
	public void goDown(int desiredFloor) {
		if (doorOpen == false && (desiredFloor < currentFloor) && (desiredFloor <= numberOfFloors) && desiredFloor > 0) {
			this.currentFloor = desiredFloor;
		}
	}

}
