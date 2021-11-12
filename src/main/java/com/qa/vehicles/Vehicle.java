package com.qa.vehicles;

public class Vehicle {

	private String make;
	private String model;
	private int numOfSeats;
	private String colour;
	private int cost;
	private int id;

	public Vehicle(String make, String model, int numOfSeats, String colour, int cost, int id) {
		super();
		this.make = make;
		this.model = model;
		this.numOfSeats = numOfSeats;
		this.colour = colour;
		this.cost = cost;
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", numOfSeats=" + numOfSeats + ", colour=" + colour
				+ ", cost=" + cost + ", id=" + id + ", getMake()=" + getMake() + ", getModel()=" + getModel()
				+ ", getNumOfSeats()=" + getNumOfSeats() + ", getColour()=" + getColour() + ", getCost()=" + getCost()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
