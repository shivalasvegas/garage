package com.qa.garage;

public class GarageRunner {

public static void main(String[] args) {
	
		Garage bostins = new Garage();
		
		bostins.addVehicle(new Car(00, "Blue", 4, "Micra", "Nissan", 2006, "Automatic"));
		bostins.addVehicle(new Car(00, "Red", 4, "Micra", "Nissan", 2010, "Automatic"));
		bostins.addVehicle(new Car(00, "Green", 4, "Micra", "Nissan", 1984, "Manual"));
		bostins.addVehicle(new Lorry(00, "Yellow", 10, "Actros", "Mercedes-Benz", 1997, "Automatic"));
		bostins.addVehicle(new Motorcycle(00, "Red", 2, "Fireblade", "Honda", 2004, "Manual"));
		bostins.addVehicle(new Motorcycle(00, "Black", 2, "Bonneville", "Triumph", 2004, "Manual"));
		bostins.addVehicle(new Car(00, "Yellow", 4, "Rapide", "Aston Martin", 2020, "Automatic"));
		
		
		bostins.readVehicles();
		bostins.fixVehicle(5);
		bostins.removeVehicle(2);
		bostins.clearGarage();
		bostins.readVehicles();
		bostins.fixVehicle(5);

	}

}
