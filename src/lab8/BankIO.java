/**
 * 
 */
package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Vaibhav
 */
public class BankIO {
	/**
	 * Read a file containing bank account (Space seperated values)
	 * @param filename Name of the file containing relavant data 
	 * @param bank
	 */
	static String TK_DELIM = " ";
	public static void readFile(String filename, Bank bank) {
		Scanner in;
		try {
			in = new Scanner(new File(filename));
			// Add relevant catch clause for the parse statements
			while(in.hasNextLine()) {
				bank.add(BankIO.readAccount(in));
			}
			in.close();
		}
		catch(FileNotFoundException exception) {
			System.out.println( " *** ERROR *** \n" + 
					"The file '" + filename + "' was not found!\n");
			return ;
		}
	}
	
	/**
	 * Read bank account data from a space formatted file
	 * @param in Scanner object pointing to formatted data
	 * @return BankAccount instance created from data pointed to by 'in:Scanner'
	 */
	public static BankAccount readAccount(Scanner in) {
		String[] lineData = (in.next()).split(TK_DELIM);
		int acctNum = Integer.parseInt(lineData[0]);
		double initialBalance = Double.parseDouble(lineData[1]);
		return new BankAccount(initialBalance, acctNum);
	}
	
}
