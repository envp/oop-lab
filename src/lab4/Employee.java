
package lab4;
/**
 * @author Vaibhav
 */
public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		setName(name);
		setSalary(salary);
	}
	
	/**
	 * Mutator method for name:String
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Accessor method for Employee name
	 * @return name:String, Employee name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Mutator method for salary:double
	 * @param salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * Accessor method for Employee salary:double
	 * @return salary:double, Employee salary
	 */
	public double getSalary() {
		return this.salary;
	}
	
	/**
	 * toString() to serialize the Employee object
	 */
	public String toString() {
		return  "Name	:" + this.name + "\n" +
				"Salary	:" + this.salary;
	}
}
