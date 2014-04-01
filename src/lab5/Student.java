package lab5;

public class Student {
	private Name name;
	private int age;
	
	/**
	 * Accessor method for name:Name
	 * @return name of the associated instance
	 */
	public Name getName() {
		return this.name;
	}
	
	/**
	 * Accessor method for age:int
	 * @return age of the associated instance
	 */
	public int getAge() {
		return this.age;
	}
	
	@Override
	/**
	 * @return Returns name and age seperated by a space
	 */
	public String toString() {
		return this.name.getName() + " " + this.age;
	}
	
	/**
	 * Public constructor for Student:class
	 * @param name Name of the student as a , or ; delimited String
	 * @param age Age of the student as an int
	 */
	public Student(Name name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
