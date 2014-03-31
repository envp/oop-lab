package lab1;

public class Bicycle {
	int speed = 100;
	int noOfGears = 5;
	int cadence = 40;
	
	/**
	 * Prints the current state of the local Bicycle object
	 */
	public void printState() {
		System.out.printf("<Bicycle speed=%d noOFGears=%d cadence=%d />\n", speed, noOfGears, cadence);
	}
	/**
	 * main() method, driver method for Bicycle class
	 * @param args
	 */
	public static void main(String[] args) {
		Bicycle bike = new Bicycle();
		bike.printState();
	}
}