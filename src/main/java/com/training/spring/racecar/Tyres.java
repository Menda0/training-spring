package com.training.spring.racecar;

public class Tyres {
	private String type;
	private String brand;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Tyres [type=" + type + ", brand=" + brand + "]";
	}
}
