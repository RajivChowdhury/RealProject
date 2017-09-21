package com.git.test;

public class Vehicle {
	
	private String steering;
	private String vin;
	private String engine;
	
	public Vehicle(){
		System.out.println("Hello");
		System.out.println("Hi");
	}

	public String getSteering() {
		return steering;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

}
