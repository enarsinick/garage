package com.qa.main;

import com.qa.garage.Garage;
import com.qa.vehicles.Motorbike;

public class Runner {

	public static void main(String[] args) {

		// Setup new garage
		Garage batGarage = new Garage();

		// Add a new vehicle
		batGarage.addVehicle(new Motorbike("Wayne Super Bikes", "Bat Vroooom3", 1, 4, "White", 456000, 3342, "AWD", 3));
		batGarage.addVehicle(new Motorbike("Wayne Super Bikes", "Bat Vroooom1", 1, 10, "White", 456000, 3342, "AWD", 3));
		batGarage.addVehicle(new Motorbike("Wayne Super Bikes", "Bat Vroooom2", 1, 6, "White", 456000, 3342, "AWD", 3));

//		batGarage.removeVehicle(7);
		batGarage.removeVehicleByType("Motorbike");
	}

}
