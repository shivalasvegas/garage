package com.qa.garage;

 class Car extends Vehicle {
	 
	// Constructors
	public Car() {
		super();	
	}
	
	public Car(int id, String colour, int numberWheels, String model, String make, int year, String transmission) {
		super(id, colour, numberWheels, model, make, year, transmission);
	}
	
	@Override
	public void noise() {
		System.out.println("Bang Bang clang clang");		
	}
	
	
	
	@Override
	public String toString() {
		return "Car [getId()=" + getId() + ", getColour()=" + getColour() + ", getNumberWheels()=" + getNumberWheels()
				+ ", getModel()=" + getModel() + ", getMake()=" + getMake() + ", getYear()=" + getYear()
				+ ", getTransmission()=" + getTransmission() + "]";
	}

//	public void transmission(String transmission) {
//		
//		if (transmission == "automatic") {
//			System.out.println("This car is automatic.");		
//		}else {
//			System.out.println("This car is manual.");
//		}
//	}
	
	
}
