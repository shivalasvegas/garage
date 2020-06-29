package com.qa.garage;
import java.util.ArrayList;

public class GarageRunner {

public static void main(String[] args) {
		
		Car car1 = new Car(1987);
		Car car2 = new Car(1922);
		Car car3 = new Car(1999);
		
		car1.carNoise();
		
		ArrayList<Vehicle> vehicleArray = new ArrayList<Vehicle>();
		vehicleArray.add(car1);
		vehicleArray.add(car2);
		vehicleArray.add(car3);
		
		Garage bostins = new Garage(vehicleArray);
		
		System.out.println(bostins.fixVehicle());
		
	}

}
