package com.training.spring.racecar;

public class Engine {

	private String type;
	private String fuel;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	@Override
	public String toString() {
		return "Engine [type=" + type + ", fuel=" + fuel + "]";
	}
}
