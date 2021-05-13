package com.training.spring.racecar;

public class RaceCar {
	
	private Engine engine;
	private String brand;
	private String model;
	
	public RaceCar(String brand, String model, Engine engine) {
		this.brand = brand;
		this.model = model;
		this.engine = engine;
	}
	
	public void initCar() {
		System.out.println("The car with brand:"+this.brand+" and model:"+this.model);
	}

	@Override
	public String toString() {
		return "RaceCar [engine=" + engine + ", brand=" + brand + ", model=" + model + "]";
	}

	

	
}
