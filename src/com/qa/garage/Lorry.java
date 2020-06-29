package com.qa.garage;

public class Lorry extends Vehicle {
	private int year;
	
	public Lorry(int year) {
		this.year = year;
	}
	public void lorryNoise() {
		System.out.println("Vroooooooooom");
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
