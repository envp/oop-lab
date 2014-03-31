package lab4;
/**
 * @author Vaibhav
 */
public class Manager extends Employee {
	private String dept;
	public Manager(String name, double salary, String dept) {
		super(name, salary);
		setDept(dept);
	}
	
	/**
	 * Mutator method for Manager department
	 * @param dept
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	/**
	 * Accessor method for Manager department
	 * @return dept:String, Manager department
	 */
	public String getDept() {
		return this.dept;
	}
	
	/**
	 * Adds relevant details to result from the super.toString() call
	 * 
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Dept	:" + this.dept;
	}
}
