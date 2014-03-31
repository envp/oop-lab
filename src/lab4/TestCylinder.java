package lab4;

public class TestCylinder {

	/**
	 * Helper method
	 * @param c
	 */
	public static void printStats(Cylinder c) {
		System.out.println("===");
		System.out.println("Radius: " + c.getRadius());
		System.out.println("Color: " + c.getColor());
		System.out.println("Height: " + c.getHeight());
		System.out.println("Base Area: " + c.getArea());
		System.out.println("Volume: " + c.getVolume());
		System.out.println("===");
	}
	
	/**
	 * Driver method
	 * @param args
	 */
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		TestCylinder.printStats(c1);
		Cylinder c2 = new Cylinder(5.0, 10.0);
		TestCylinder.printStats(c2);
	}

}
