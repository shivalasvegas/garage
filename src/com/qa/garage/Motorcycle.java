package com.qa.garage;

class Motorcycle extends Vehicle {
	
	// Constructors
		public Motorcycle() {
			super();	
		}
		
		public Motorcycle(int id, String colour, int numberWheels, String model, String make, int year, String transmission) {
			super(id, colour, numberWheels, model, make, year, transmission);
		}
	
		
	
	@Override
		public String toString() {
			return "Motorcycle [getId()=" + getId() + ", getColour()=" + getColour() + ", getNumberWheels()="
					+ getNumberWheels() + ", getModel()=" + getModel() + ", getMake()=" + getMake() + ", getYear()="
					+ getYear() + ", getTransmission()=" + getTransmission() + "]";
		}

	@Override
	public void noise() {
		System.out.println("Brrrrrr Grrrrr Brrrrr");
	}
	
	
}
