package lab2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import lab2.Item;

/**
 * encapsulates the details of registered customers of the XYZ shop who buy Items
 * @author Vaibhav
 */
public class Customer {
	private String name;
	private String idNo;
	private double balance = 5000;
	private Item item = new Item(null, null);
	
	/**
	 * Mutator method for name:String
	 * @param name customer name
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Accessor method for name:String
	 * @return name:String, customer name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Mutator method for idNo:String
	 * @param idNo customer id number
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	/**
	 * Accessor method for idNo:String
	 * @return idNo:String, customer id number
	 */
	public String getIdNo() {
		return this.idNo;
	}
	
	
	/**
	 * Accessor method for balance:double
	 * @return balance:double, customer account current balance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * Accessor method for item:Item
	 * @return item:Item, item chosen by the customer
	 */
	public Item getItem() {
		return this.item;
	}
	
	/**
	 * Parameterized constructor for Customer:class (reccomended)
	 * @param name 		customer name
	 * @param idNo 		customer id number
	 * @param balance	customer account current balance (default 5000)
	 * @param item 		item chosen by the customer (default Item(null, null))
	 */
	public Customer(String name, String idNo, double balance, Item item) {
		setName(name);
		setIdNo(idNo);
		this.balance = balance;
		this.item = item;
	}
	
	/**
	 * Parameterized constructor for Customer:class (default item:Item)
	 * @param name 		customer name
	 * @param idNo 		customer id number
	 * @param balance	customer account current balance (default 5000)
	 */
	public Customer(String name, String idNo, double balance) {
		setName(name);
		setIdNo(idNo);
		this.balance = balance;
	}
	
	/**
	 * Parameterized constructor for Customer:class (default item:Item and balance:double)
	 * @param name 		customer name
	 * @param idNo 		customer id number
	 */
	public Customer(String name, String idNo) {
		setName(name);
		setIdNo(idNo);
	}

	/**
	 * Displays details of the item bought and the current balance, 
	 * if the customer has sufficient balance and the quantity specified 
	 * by the user is greater than or equal to one. If the customer donft 
	 * have the sufficient balance, this method displays the 
	 * message gInsufficient balanceh .If the quantity specified by the user 
	 * is less than one, this method displays the message gOrder is not validh.
	 * @param item item:Item chosen by customer
	 * 
	 * @throws IOException
	 */
	public void buyItem(Item item) throws IOException {
		try {
			System.out.printf("|\tItem name\t|\tPrice\t|\tYour Balance\t|\n");
			System.out.printf("-------------------------------------------------\n");
			System.out.printf("|\t%s\t\t|\t%.1f\t|\t%f\t|\n", 
					item.getItemName(), item.getItemPrice(), this.getBalance());
			System.out.printf("-------------------------------------------------\n");
			
			BufferedReader reader = new BufferedReader(	new InputStreamReader(System.in));
			System.out.print("Enter number of items to buy: ");
			int itemCount = Integer.parseInt(reader.readLine());
			
			if(itemCount > 1) {
				if(this.getBalance() >= itemCount * item.getItemPrice()) {
					this.balance = this.getBalance() - itemCount * item.getItemPrice();
					this.item.setItemQuantity(itemCount);
					
					System.out.printf("|\tItem name\t|\tPrice\t|\tYour Balance\t|\n");
					System.out.printf("-------------------------------------------------\n");
					System.out.printf("|\t%s\t\t|\t%.1f\t|\t%f\t|\n", 
							item.getItemName(), item.getItemPrice(), this.getBalance());
					System.out.printf("-------------------------------------------------\n");
				}
				else {
					System.out.println("Insufficient funds!");
				}
			}
			else {
				System.out.println("Order is not valid!");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}
}
