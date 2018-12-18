package com.anigy.spring.beans;

public class Car {
	private String branch;
	private String corp;
	private double price;
	private int maxSpeed;
	
	@Override
	public String toString() {
		return "Car [branch=" + branch + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}

	public Car(String branch, String corp, double price) {
		super();
		this.branch = branch;
		this.corp = corp;
		this.price = price;
	}

	public Car(String branch, String corp, int maxSpeed) {
		super();
		this.branch = branch;
		this.corp = corp;
		this.maxSpeed = maxSpeed;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
