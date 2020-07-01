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
//	
//	public void fixVehicle(String newVehicle) {
//		this.newVehicle = newVehicle;
//		
//		//System.out.println("Vehicle year: " + vehicle.get(0).getYear() + " array size: " + vehicle.size());  // test statement
//		
//		      //System.out.println(vehicle.getYear()); // test statement
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
//	public void fixVehicle() {
//		
//		//System.out.println("Vehicle year: " + vehicle.get(0).getYear() + " array size: " + vehicle.size());  // test statement
//		for (int i = 0; i < vehicle.size(); i++) {
//		      //System.out.println(vehicle.get(i).getYear()); // test statement
//		      
//		      if (vehicle.get(i).getYear() < 2000) {
//		    	  charge = 100.00;
//		      }else {
//		    	  charge = 50.00;
//		      }
//		      System.out.println("Your bill for car made in the year " + vehicle.get(i).getYear() + " is: " + charge);
//		      
//		    }
//		
//		
//		
//	}

	
}


