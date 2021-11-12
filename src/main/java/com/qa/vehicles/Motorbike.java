package com.qa.vehicles;

public class Motorbike extends Vehicle {

	private int mileage;
	private String drivetrain;
	private int numOfWheels;

	public Motorbike(String make, String model, int numOfSeats, int id, String colour, int cost, int mileage,
			String drivetrain, int numOfWheels) {
		super(make, model, numOfSeats, colour, cost, id);
		this.mileage = mileage;
		this.drivetrain = drivetrain;
		this.numOfWheels = numOfWheels;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getDrivetrain() {
		return drivetrain;
	}

	public void setDrivetrain(String drivetrain) {
		this.drivetrain = drivetrain;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	@Override
	public String toString() {
		return "Motorbike [mileage=" + mileage + ", drivetrain=" + drivetrain + ", numOfWheels=" + numOfWheels
				+ ", getMileage()=" + getMileage() + ", getDrivetrain()=" + getDrivetrain() + ", getNumOfWheels()="
				+ getNumOfWheels() + ", getMake()=" + getMake() + ", getModel()=" + getModel() + ", getNumOfSeats()="
				+ getNumOfSeats() + ", getColour()=" + getColour() + ", getCost()=" + getCost() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
