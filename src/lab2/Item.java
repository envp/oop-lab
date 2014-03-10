package lab2;

/**
 * Encapsulates the details of items to be purchased by the customer of the XYZ shop
 * @author Vaibhav
 *
 */
public class Item {
	private String itemName;
	private String itemidNo;
	private int itemQuantity = 1;
	private double itemPrice = 500.0;
	
	/**
	 * Mutator method for itemName:String
	 * @param itemName name of the item in store
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	/**
	 * Accessor method for itemName:String
	 * @return itemName:String, name of the item in store
	 */
	public String getItemName() {
		return this.itemName;
	}
	
	/**
	 * Mutator method for itemidNo:String
	 * @param itemidNo idNo of the item in store
	 */
	public void setItemidNo(String itemidNo) {
		this.itemidNo = itemidNo;
	}
	
	/**
	 * Accessor method for itemidNo:String
	 * @return itemidNo:String, idNo of the item in store
	 */
	public String getItemidNo() {
		return this.itemidNo;
	}
	
	/**
	 * Mutator method for itemQuantity
	 * @param itemQuantity amount of items in storage
	 */
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	/**
	 * Accessor method for itemQuantity:int
	 * @return itemQuantity:int, amount of items in storage
	 */
	public int getItemQuantity() {
		return this.itemQuantity;
	}
	
	/**
	 * Mutator method for itemPrice
	 * @param itemPrice price of item in store
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	/**
	 * Accessor method for 
	 * @return itemPrice price of item in store
	 */
	public double getItemPrice() {
		return this.itemPrice;
	}
	
	/**
	 * Parametrized constructor for Item:class (reccomended)
	 * @param itemName 		itemName name of the item in store
	 * @param itemidNo 		itemidNo idNo of the item in store
	 * @param itemQuantity 	itemQuantity amount of items in storage (default 1)
	 * @param itemPrice 	price of item in store (default 500.0)
	 */
	public Item(String itemName,String itemidNo, int itemQuantity, double itemPrice) {
		this.setItemName(itemName);
		this.setItemidNo(itemidNo);
		this.setItemQuantity(itemQuantity);
		this.setItemPrice(itemPrice);
	}
	
	/**
	 * Parametrized constructor for Item:class (at default itemPrice(500.0))
	 * @param itemName 		itemName name of the item in store
	 * @param itemidNo 		itemidNo idNo of the item in store
	 * @param itemQuantity 	itemQuantity amount of items in storage (default 1)
	 */
	public Item(String itemName,String itemidNo, int itemQuantity) {
		this.setItemName(itemName);
		this.setItemidNo(itemidNo);
		this.setItemQuantity(itemQuantity);
	}
	
	/**
	 * Parametrized constructor for Item:class (at default itemPrice(500.0), itemQuantity(1))
	 * @param itemName 		itemName name of the item in store
	 * @param itemidNo 		itemidNo idNo of the item in store
	 */
	public Item(String itemName,String itemidNo) {
		this.setItemName(itemName);
		this.setItemidNo(itemidNo);
	}
	
}