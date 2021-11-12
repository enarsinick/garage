package com.qa.vehicles;

public class Boat extends Vehicle {

	private boolean hasEngine;
	private int knots;

	public Boat(String make, String model, int numOfSeats, String colour, int cost, boolean hasEngine, int knots,
			int id) {
		super(make, model, numOfSeats, colour, cost, id);
		this.hasEngine = hasEngine;
		this.knots = knots;
	}

	public boolean isHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

	public int getKnots() {
		return knots;
	}

	public void setKnots(int knots) {
		this.knots = knots;
	}

	@Override
	public String toString() {
		return "Boat [hasEngine=" + hasEngine + ", knots=" + knots + ", isHasEngine()=" + isHasEngine()
				+ ", getKnots()=" + getKnots() + ", getMake()=" + getMake() + ", getModel()=" + getModel()
				+ ", getNumOfSeats()=" + getNumOfSeats() + ", getColour()=" + getColour() + ", getCost()=" + getCost()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
