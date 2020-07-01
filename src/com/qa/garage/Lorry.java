package com.qa.garage;

class Lorry extends Vehicle {
		// Constructors
		public Lorry() {
			super();	
		}
		
		public Lorry(int id, String colour, int numberWheels, String model, String make, int year, String transmission) {
			super(id, colour, numberWheels, model, make, year, transmission);
		}
		
		
		
		@Override
		public String toString() {
			return "Lorry [getId()=" + getId() + ", getColour()=" + getColour() + ", getNumberWheels()="
					+ getNumberWheels() + ", getModel()=" + getModel() + ", getMake()=" + getMake() + ", getYear()="
					+ getYear() + ", getTransmission()=" + getTransmission() + "]";
		}

		@Override
		public void noise() {
			System.out.println("Vroooooooom! Vrooooom!");		
		}
	
}
