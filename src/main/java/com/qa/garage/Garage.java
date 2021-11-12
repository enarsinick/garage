package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.vehicles.Boat;
import com.qa.vehicles.Car;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Vehicle;

public class Garage {

	List<Vehicle> vehicleStock = new ArrayList<Vehicle>();
	Vehicle batcar = new Car("Wayne Cars", "Batmobile", 2, "Black", 300000000, 10000, "AWD", 4, 1);
	Vehicle batbike = new Motorbike("Wayne Bikes", "Bat Scooter", 1, 2, "black", 155000000, 32000, "RWD", 2);
	Vehicle batboat = new Boat("Wayne Boats", "Aqua Bat", 6, "Black", 66000, true, 67, 3);

	public Garage() {
		vehicleStock.add(batbike);
		vehicleStock.add(batboat);
		vehicleStock.add(batcar);
	}

	// Work out the price of bills
	public int calculateBill(Vehicle vehicle) {
		int bill = 0;
		if (vehicle instanceof Car) {
			bill = 250;
		} else if (vehicle instanceof Boat) {
			bill = 4500;
		} else {
			bill = 150;
		}
		return bill;
	}

	// Check if vehicle is in stock
	public boolean checkVehicleInStock(int id) {
		boolean inStock = false;
		for (Vehicle vehicle : this.vehicleStock) {
			if (id == vehicle.getId())
				inStock = true;
		}
		return inStock;
	}

	// Add a new vehicle to garage
	public void addVehicle(Vehicle vehicle) {
		vehicleStock.add(vehicle);
	}

	// Remove vehicle from garage
	public void removeVehicle(int id) {
		// Check vehicle exists in stock
		if (checkVehicleInStock(id)) {
			for (int i = 0; i < vehicleStock.size(); i++) {
				Vehicle v = vehicleStock.get(i);
				if (id == v.getId()) {
					vehicleStock.remove(i);
					System.out.println("The " + v.getModel() + " has been removed");
				}
			}
		} else {
			System.out.println("That vehicle doesn't exist");
		}
	}

	// Remove vehicle by type
	public void removeVehicleByType(String type) {
		for (int i = 0; i < vehicleStock.size(); i++) {
			if (vehicleStock.get(i).getClass().getSimpleName().equals(type)) {
				String removed = vehicleStock.get(i).getModel();
				vehicleStock.remove(i);
				System.out.println("Removed " + removed);
			}
		}
	}

	// Fix a vehicle then remove from garage and find out bill
	public void fixVehicle(int id) {
		Vehicle vehicleToFix = null;
		int cost = 0;

		// Check vehicle exists in stock
		if (checkVehicleInStock(id)) {
			vehicleToFix = vehicleStock.get(id);
			cost = calculateBill(vehicleToFix);
			System.out.println("The " + vehicleToFix.getModel() + " has been fixed, this will cost £" + cost);
			removeVehicle(vehicleToFix.getId());
		}
	}

	// Empty entire garage
	public void emptyGarage() {
		vehicleStock.clear();
		System.out.println("The entire garage is now empty");
	}

}
