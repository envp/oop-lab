package lab5;
/**
 * Example class of a RetailStore and associated runtime exceptions
 * @author Vaibhav
 *
 */
public class RetailStore {
	private int[] itemId = {1001, 1002, 1003, 1004, 1005};
	private double[] price = {13.50, 18.00, 19.50, 25.50, 46.32};
	
	/**
	 * Computes the price of an item given the itemID and 
	 * @param value the ItemID of the item or the index of the item
	 * @return the price of the item selected 
	 */
	public double computePrice(int value) {
		// look through the array till we find the desired item
		for(int i = 0; i < price.length; ++i) {
			if(itemId[i] == value) {
				return price[i];
			}
		}
		
		// Alternatively, supply the index
		return price[value];
	}
	public static void main(String[] args) {
		RetailStore r1 = new RetailStore();
		System.out.println("Price of itemId 1004 = " + r1.computePrice(1004));
		System.out.println("Price of itemId 1005 = " + r1.computePrice(1005));
		
		// Raises an ArrayIndexOutOfBoundsException
		// System.out.println("Price of itemId 1007 = " + r1.computePrice(1007));
	}
}
