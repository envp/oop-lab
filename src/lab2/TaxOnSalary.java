package lab2;

import java.util.Scanner;

public class TaxOnSalary {
	// Default value
	private double salary = 1000.0;
	private boolean isPANsubmitted = false;
	
	/**
	 * Mutator method for salary:double
	 * @param salary, annual taxable salary
	 * @throws AssertionError
	 */
	private void setSalary(double salary) throws AssertionError {
		// Assert for 
		assert(salary >= 0.0);
		this.salary = salary;
	}
	
	/**
	 * Accessor method for salary:double
	 * @return salary:double, annual taxable salary
	 */
	public double getSalary() {
		return this.salary;
	}

	/**
	 * Mutator method for isPANsubmitted:boolean
	 * @param isPANsubmitted PAN submission status
	 */
	private void setIsPANSubmitted(boolean isPANsubmitted) {
		this.isPANsubmitted = isPANsubmitted;
	}
	
	/**
	 * Accessor method for isPANsubmitted:boolean
	 * @return isPANsubmitted:boolean, PAN submission status
	 */
	public boolean getIsPANSubmitted() {
		return this.isPANsubmitted;
	}
	
	/**
	 * Parameterized constructor (default salary @ 1000.0), asks for command-line
	 * input for salary 
	 * @param isPANsubmitted
	 */
	public TaxOnSalary(boolean isPANsubmitted) {
		this.setIsPANSubmitted(isPANsubmitted);
		this.inputSalary();
	}
	
	/**
	 * Unparameterized constructor for TaxOnSalry:class
	 * Defaults: salary = 1000.0 and isPANsubmitted = false
	 */
	public TaxOnSalary() {
		this.setIsPANSubmitted(false);
		this.inputSalary();
	}
	
	/**
	 * Method for computing the tax based on salary [caculateTax() : double] is supplied. The tax is calculated as per the rules shown below:
	 * <ol>
	 * <li>if salary < 180000 and isPANsubmitted = true, then tax payable is zero</li>
	 * <li>if salary < 180000 and isPANsubmitted = false, then tax payable is 5% of the salary</li>
	 * <li>if 180000 < salary < 500000, then tax payable is 10% of the salary</li>
	 * <li>if 500000 < salary < 1000000, then tax payable is 20% of the salary</li>
	 * <li>if 1000000 < salary, then tax payable is 30% of the salary</li>
	 * </ol>
	 * @return tax:double, the tax payable
	 */
	public double calculateTax() {
		double tax = 0;
		if(this.salary <= 180000.0) {
			if(this.isPANsubmitted) {
				tax = 0.0;
			}
			else {
				tax = 0.05 * this.salary;
			}
		}
		else if(180000.0 < this.salary && this.salary <= 500000.0) {
			tax = 0.1 * this.salary;
		}
		else if(500000.0 < this.salary && this.salary <= 1000000.0) {
			tax = 0.2 * this.salary;
		}
		else {
			tax = 0.3 * this.salary;
		}
		return tax;
	}
	
	/**
	 * Sets salary field based on user input negative values 
	 */
	public void inputSalary() {
		double salary;
		System.out.println("Enter salary when prompted to");
		System.out.println("Enter any negative value to set it tothe default salary of Rs. 1000.0/pa");
		System.out.print("Enter salary: ");
		Scanner s = new Scanner(System.in);
		salary = s.nextDouble();
		
		if(salary >= 0.0) {
			this.setSalary(salary);
		}
		s.close();
	}
}
