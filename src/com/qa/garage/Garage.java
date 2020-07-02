package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
		
	List<Vehicle> vehicleArray = new ArrayList<>();
	
	int counter = 0;
	private double charge = 0.0;
	private int vehId = 0;
	
	public void addVehicle(Vehicle vehicle) {
		vehicleArray.add(vehicle);
		counter ++;
		vehicle.setId(counter);
	}

	public void readVehicles() {
		for(Vehicle vehicle : vehicleArray) {
			System.out.println(vehicle);
		}
	}
	
public void fixVehicle(int vehicleId) {
		
		for(Vehicle vehicle : vehicleArray) {
			if (vehicleId == vehicle.getId()) {
				if (vehicle.getYear() < 2000) {
			    	  charge = 100.00;
			      }else {
			    	  charge = 50.00;
			      }
			  System.out.println("Your bill for car made in the year " + vehicle.getYear() + " is: £" + charge);
			}
		}      
	}

	public void removeVehicle(int vehicleId) {
		
		for(Vehicle vehicle : vehicleArray) {

			if (vehicleId == vehicle.getId()) {
				vehId  = vehicle.getId();
				vehicleArray.remove(vehId);
				System.out.println("Removing your " + vehicle.getMake() + " Thank you, come again!");
				break;
			}
	
		}	
	}
	
	
	
	public void clearGarage() {
				vehicleArray.removeAll(vehicleArray);
				System.out.println("Clearing the garage!");
		}
		


	
}


