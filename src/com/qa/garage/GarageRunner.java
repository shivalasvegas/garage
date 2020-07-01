package com.qa.garage;

public class GarageRunner {

public static void main(String[] args) {
	
		Garage bostins = new Garage();
		
		bostins.addVehicle(new Car(00, "Blue", 4, "Micra", "Nissan", 2006, "Automatic"));
		bostins.readVehicles();

	}

}
