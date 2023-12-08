package com.tec1.app.model;

public class Satellite {
	
	private String name;
	
	private double distance;

	public Satellite(String name, double distance) {
		super();
		this.name = name;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Satellite() {
		
	}
	
	
	
	

}
