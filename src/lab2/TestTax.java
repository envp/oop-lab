package lab2;

import lab2.TaxOnSalary;

/**
 * Testing class for TaxOnSalary <br>
 * TODO Fix crash when trying to input tax2 (Scanner)
 * @author Vaibhav
 * 
 */
public class TestTax {
	
	/**
	 * Driver method for TaxOnSalary:class
	 * @param args
	 */
	public static void main(String[] args) {
		TaxOnSalary tax1 = new TaxOnSalary();
		
		System.out.println("Tax for tax1 = " + tax1.calculateTax());
		
		TaxOnSalary tax2 = new TaxOnSalary(true);
		
		System.out.println("Tax for tax2 = " + tax2.calculateTax());
	}
}