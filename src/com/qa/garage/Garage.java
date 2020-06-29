package com.qa.garage;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	private double charge = 0.00;

	public Garage(ArrayList vehicle) {
		//this.vehicle = vehicle;
	}
	
	public double fixVehicle() {
		
		for (int i = 0; i < vehicle.size(); i++) {
		      //System.out.println(vehicle.get(i).getYear());
		      if (vehicle.get(i).getYear() < 2000) {
		    	  charge = 100.00;
		      }else {
		    	  charge = 50.00;
		      }
		      charge += charge;
		    }
		
		return charge;
	}

	
}


