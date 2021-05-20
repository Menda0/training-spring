package com.training.spring.racecar;

public class RaceCar {
	
	private Engine engine;
	private Tyres tyres;
	private String brand;
	private String model;
	private Radio radio;
	
	public RaceCar() {
		System.out.println("Create car");
	}
	
	public RaceCar(String brand, String model, Engine engine, Radio radio) {
		this.brand = brand;
		this.model = model;
		this.engine = engine;
		this.radio = radio;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tyres getTyres() {
		return tyres;
	}

	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	public void initCar() {
		System.out.println("The car with brand:"+this.brand+" and model:"+this.model);
	}

	@Override
	public String toString() {
		return "RaceCar [engine=" + engine + ", tyres=" + tyres + ", brand=" + brand + ", model=" + model + "]";
	}
}
