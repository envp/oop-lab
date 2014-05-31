/**
 * 
 */
package lab7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Vaibhav
 */
public class Bank {
	private ArrayList<Account> accts;
	int maxActive;
	
	/**
	 * Add a new account to the list of accounts
	 * @param acct Account instance to be added
	 * @return true if account is added successfully and false if it fails 
	 */
	public boolean addAccount(Account acct) {
		boolean acctAdded = false;
		
		if(accts.size() == maxActive) {
			return false;
		}
		else {
			Iterator<Account> itr = accts.iterator();
			while(itr.hasNext()) {
				Account current = (Account) itr.next();
				if(current.getAcctNumber() == acct.getAcctNumber()) {
					acctAdded = true;
				}
			}
			if(!acctAdded) {
				accts.add(acct);
				return true;
			}
			 return false;
		}
	}
	
	/**
	 * Remove a customer account for whatever reason
	 * @param acctnum Account number associated with the instance that must go away
	 * @return true if success false otherwise
	 */
	public boolean removeAccount(long acctnum) {
		
		if(accts.isEmpty()) {
			return false;
		}
		
		Iterator<Account> itr = accts.iterator();
		while(itr.hasNext()) {
			Account current = (Account) itr.next();
			if(current.getAcctNumber() == acctnum) {
				accts.remove(current);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * SPREAD DAT GREEN JOY
	 * @param acctnum Account number recieving the deposit
	 * @param amount Amount to be deposited
	 * @return JOY THAT WILL BE SPREAD, QUANTIFIED
	 */
	public double deposit(long acctnum, double amount) {
		double balance = -1;
		if(accts.isEmpty()) {
			return -1;
		}
		
		Iterator<Account> itr = accts.iterator();
		
		while(itr.hasNext()) {
			Account current = (Account) itr.next();
			if(current.getAcctNumber() == acctnum) {
				balance = current.getBalance();
				balance += amount;
				current.setBalance(balance);
			}
			
		}
		return balance;
	}
	
	/**
	 * THE FIRST STEP TO SPREADING JOY
	 * @param acctnum Account number from which to withdraw
	 * @param amount Amount that will be withdrawn (legally)
	 * @return JOY, QUANTIFIED
	 */
	public double withdraw(long acctnum, double amount) {
		double balance = -1;
		if(accts.isEmpty()) {
			return -1;
		}
		
		Iterator<Account> itr = accts.iterator();
		
		while(itr.hasNext()) {
			Account current = (Account) itr.next();
			if(current.getAcctNumber() == acctnum) {
				balance = current.getBalance();
				if(balance < amount) {
					return -1;
				}
				balance -= amount;
				current.setBalance(balance);
			}
			
		}
		return balance;
	}
}