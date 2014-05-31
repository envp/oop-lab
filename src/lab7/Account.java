/**
 * 
 */
package lab7;

/**
 * @author Vaibhav
 */
public class Account {
	private long acctNumber;
	private double balance;
	private String name;
	
	/**
	 * Constructor for class Account
	 * @param acctNumber account number associated
	 * @param balance balance in the account
	 * @param name name of the account holder
	 */
	public Account(long acctNumber, double balance, String name) {
		this.acctNumber = acctNumber;
		this.balance = balance;
		this.name = name;
	}
	
	/**
	 * Accessor method for accountNumber:long
	 * @return Account number associated with the account instance
	 */
	public long getAcctNumber() {
		return this.acctNumber;
	}
	
	/**
	 * Accessor method for balance:double
	 * @return Balance assocaited with the account instance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * Accessor method for name:String
	 * @return Name associated with the account instance
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Mutator method for balance:double
	 * @param balance Balance assocaited with the account instance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Mutator method for name:String
	 * @param name Name of the gentleman or thug associated with the account
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.acctNumber + "," + this.balance + "," + this.name;
	}
}
