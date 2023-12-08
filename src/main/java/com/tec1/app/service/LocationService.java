package com.tec1.app.service;

public interface LocationService {

	/**
	 * Get the location of the vehicle 
	 * @param distances from the vehicle to each satellite
	 * @return the position of the vehicle
	 */
	public double[] getLocation(double distances[]);
}
