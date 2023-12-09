package com.tec1.app.model;

/**
 * Class for the Satellite specifications
 */
public class SatelliteSpecs {
	
	/**
	 * The name of the satellite
	 */
	private String name;
	
	/**
	 * The coordinate x
	 */
	private double x;
	
	/**
	 * the coordinate y
	 */
	private double y;

	/**
	 * Constructor 
	 * @param name The name of the satellite
	 * @param x The coordinate x
	 * @param y The coordinate y
	 */
	public SatelliteSpecs(String name, double x, double y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	/**
	 * Get The name of the satellite
	 * @return The name of the satellite
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set The name of the satellite
	 * @param name The name of the satellite
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get The coordinate x
	 * @return The coordinate x
	 */
	public double getX() {
		return x;
	}

	/**
	 * Set The coordinate x
	 * @param x The coordinate x
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Get the coordinate y
	 * @return the coordinate y
	 */
	public double getY() {
		return y;
	}

	/**
	 * Set the coordinate y
	 * @param y the coordinate y
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	
	
}
