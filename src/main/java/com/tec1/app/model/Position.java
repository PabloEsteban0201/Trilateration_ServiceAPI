package com.tec1.app.model;

/**
 * Class for a position of two coordinates
 */
public class Position {
	
	/**
	 * Coordinate x of the position
	 */
	private double x;
	
	/**
	 * Coordinate y of the position
	 */
	private double y;

	/**
	 * Get the x coordinate 
	 * @return x coordinate
	 */
	public double getX() {
		return x;
	}

	/**
	 * Set the x coordinate 
	 * @param x the coordinate x
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Get the y coordinate
	 * @return y coordinate
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

	/**
	 * Constructor for the position
	 * @param x is the coordinate x 
	 * @param y is the coordinate y
	 */
	public Position(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	

}
