package com.training.spring.racecar;

import java.util.Map;

public class GarageMap {

	private Map<String, RaceCar> vehicles;
	
	public GarageMap() {}

	public Map<String, RaceCar> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Map<String, RaceCar> vehicles) {
		this.vehicles = vehicles;
	}
	
}
