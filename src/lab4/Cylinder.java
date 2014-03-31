package lab4;

import lab4.Circle;

public class Cylinder extends Circle {
	private double height;
	
	
	/**
	 * Unparameterized constructor (invokes Circle.Circle())
	 */
	public Cylinder() {
		super();
		this.height = 1.0;
	}
	
	/**
	 * Parameterized constructor (invokes Circle.Circle(double))
	 * @param radius radius of cylinder
	 * @param height height of cylinder
	 */
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	/**
	 * Fully parameterized constructor (invoke Circle.Circle(double, String))
	 * @param radius radius of cylinder
	 * @param height height of cylinder
	 * @param color color of cylinder
	 */
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}
	
	/**
	 * Accessor method for height
	 * @return height of cylinder
	 */
	public double getHeight() {
		return this.height;
	}
	
	public double getVolume() {
		return this.getArea() * this.height;
	}
}
