package com.qa.garage;

public class Vehicle {
		
		private String colour;
		private int numberWheels;
		private String model;
		private String make;
		private int year;
		private String transmission;
		
		// Constructors
		public Vehicle() {
			super();
		}
				
		public Vehicle(String colour, int numberWheels, String model, String make, int year,
				String transmission) {
			super();
			this.colour = colour;
			this.numberWheels = numberWheels;
			this.model = model;
			this.make = make;
			this.year = year;
			this.transmission = transmission;
		}
		
		public void carNoise() {
			// default noise
			System.out.println("PUT PUT");
		}
		
		public String getColour() {
			return colour;
		}
		
		public boolean drive() {
			return false;
		}
		
		public void setColour(String colour) {
			
			this.colour = colour;
		}

		public int getNumberWheels() {
			return numberWheels;
		}

		public void setNumberWheels(int numberWheels) {
			this.numberWheels = numberWheels;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}


		public String getMake() {
			return make;
		}


		public void setMake(String make) {
			this.make = make;
		}


		public int getYear() {
			return year;
		}


		public void setYear(int year) {
			this.year = year;
		}


		public String getTransmission() {
			return transmission;
		}


		public void setTransmission(String transmission) {
			this.transmission = transmission;
		}



		
		
		
		
	}


