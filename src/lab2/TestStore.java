package lab2;

import java.io.IOException;

public class TestStore {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Customer c = new Customer("A", "2010AFG", 10000.0);
		Item i1 = new Item("Shampoo", "SHP21", 5);
		Item i2 = new Item("Shampoo", "SHP231", 5, 400);
		c.buyItem(i1);
		c.buyItem(i2);
	}

}
