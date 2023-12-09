package com.tec1.app.model;

/**
 * Class for the Satellite that has the distance to the vehicle
 */
public class Satellite {
	
	/**
	 * Name of the satellite
	 */
	private String name;
	
	/**
	 * Distance given from the vehicle
	 */
	private double distance;

	/**
	 * Constructor to the satellite
	 * @param name the name of the satellite
	 * @param distance the distance given from the vehicle
	 */
	public Satellite(String name, double distance) {
		super();
		this.name = name;
		this.distance = distance;
	}

	/**
	 * Get the name of the satellite
	 * @return name of the satellite
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the satellite
	 * @param name the name of the satellite
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the distance from the vehicle to the satellite
	 * @return the distance from the vehicle to the satellite
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * Set the distance from the vehicle to the satellite
	 * @param distance the distance from the vehicle to the satellite
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * Constructor by default
	 */
	public Satellite() {
		
	}
	
	
	
	

}
