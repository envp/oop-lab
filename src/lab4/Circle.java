package lab4;

public class Circle {
	private double radius;
	private String color;
	
	/**
	 * Unparameterized constructor for Circle:class
	 */
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	
	/**
	 * Parameterized constructor for Circle:class
	 * @param radius radius:double of the Circle instance
	 */
	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}
	
	/**
	 * Fully parameterized constructor for Circle:class
	 * @param radius radius:double of the Circle instance
	 * @param color color:String of the Circle instance
	 */
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	/**
	 * Accessor method for radius of calling instance
	 * @return radius:double of the calling instance being created
	 */
	public double getRadius() {
		return this.radius;
	}
	
	/**
	 * Accessor method for color of the calling instance
	 * @return color:String of the calling instance
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * Calculate area property of calling instance
	 * @return area of caller circle instance 
	 */
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}
