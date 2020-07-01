package com.qa.garage;

import java.util.ArrayList;
import java.util.List;


public class Garage {
	
	List<Vehicle> vehicleArray = new ArrayList<>();
	
	int counter = 0;
	
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
	
//	public void fixVehicle(Vehicle vehicle) {

//		
//
//		
//		      
//		      if (newVehicle.getYear() < 2000) {
//		    	  charge = 100.00;
//		      }else {
//		    	  charge = 50.00;
//		      }
//		      System.out.println("Your bill for car made in the year " + newVehicle.getYear() + " is: " + charge);
//		      
//	}
//		


	
}


