package lab4;

/**
 * @author Vaibhav
 */
public abstract class Worker {
	private String name;
	private double salaryRate;
	
	public Worker(String name, double salaryRate) {
		this.name = name;
		this.salaryRate = salaryRate;
	}
	
	/**
	 * Accessor method for name:String
	 * @return name:String, Worker name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Accessor method for salary_rate:double
	 * @return salary_rate:double, hourly salary of the Employee
	 */
	public double getSalary() {
		return this.salaryRate;
	}
	
	public abstract double computePay();
}
