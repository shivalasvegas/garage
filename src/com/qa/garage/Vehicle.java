package com.qa.garage;

abstract class Vehicle {
		
		private int id;
		private String colour;
		private int numberWheels;
		private String model;
		private String make;
		private int year;
		private String transmission;
		
		// Constructors
		public Vehicle() {
		
		}
				
		public Vehicle(int id, String colour, int numberWheels, String model, String make, int year,
				String transmission) {
			
			this.id  = id;
			this.colour = colour;
			this.numberWheels = numberWheels;
			this.model = model;
			this.make = make;
			this.year = year;
			this.transmission = transmission;
		}
		
		
		public void noise() {
			// default noise
			System.out.println("PUT PUT");
		}
		
		
		// getters and setters
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
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


