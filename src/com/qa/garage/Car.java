package com.qa.garage;

public class Car extends Vehicle {
	private int year;
	
	
	public Car(int year) {
		this.year = year;
	}
	
	public void carNoise() {
		System.out.println("Bang Bang clang clang");		
	}
	
	
	public void transmission(String transmission) {
		
		if (transmission == "automatic") {
			System.out.println("This car is automatic.");		
		}else {
			System.out.println("This car is manual.");
		}
	}
	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	

}
