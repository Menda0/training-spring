package com.training.spring.racecar;

public class FormulaOneRaceCar extends RaceCar{
	private boolean hasWing;

	public boolean isHasWing() {
		return hasWing;
	}

	public void setHasWing(boolean hasWing) {
		this.hasWing = hasWing;
	}

	@Override
	public String toString() {
		return "FormulaOneRaceCar [hasWing=" + hasWing + "] "+super.toString();
	}
	
	
}
