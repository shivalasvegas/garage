package com.qa.garage;

public class Driver extends Vehicle {
	
    // functionality
    public void drive(int milesDriven){
        this.setMileage(this.getMileage() + milesDriven);
    }
}
