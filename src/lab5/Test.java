package lab5;

import java.util.Scanner;
import java.io.IOException;


/**
 * @author Vaibhav
 *
 */
public class Test {

	/**
	 * This method reads the student details and returns the Student instance.
	 * Values to be read from System.in are:
	 * <ol>
	 * 	<li>First name of Student</li>
	 * 	<li>Middle name of student</li>
	 * 	<li>Last name of Student</li>
	 * 	<li>Name format (1 for comma(,) separated and 2 for semicolon separated)</li>
	 * 	<li>Age of student</li>
	 * </ol>
	 * @return Student Object created
	 * @throws IOException Thank System.in
	 */
	public static Student readStudent() throws IOException {
		// defaults to detect failure
		String name = null;
		int age = -1, delim;
		Student std;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name, delimited by comma or semicolon");
		System.out.println("1. <FirstName>,<MiddleName>,<LastName>");
		System.out.println("2. <LastName>;<MiddleName>;<FirstName>");
		if(sc.hasNext()) {
			name = sc.nextLine();
		}
		
		// Useless much?
		System.out.println("Enter delimiter, 1 for ',' and 2 for ';'");
		if(sc.hasNext()) {
			delim = sc.nextInt();
		}
		
		System.out.println("Enter age");
		if(sc.hasNext()) {
			age = sc.nextInt();
		}
		std = new Student(new Name(name), age);

		// Blank line for formatting
		System.out.println();
		sc.close();
		return std;
	}
		
	/**
	 * Drives everything via simple tests
	 * TODO Fails to construct Name object, why?
	 * TODO Write drivers for AddressList.java
	 * @param args commanline arguments
	 * @throws IOException Thank System.in
	 */
	public static void main(String[] args) throws IOException {
		// Read details for 10 students
		for(int i = 0; i < 10; ++i) {
			StudentList.addStudent(readStudent());
		}
		
		// All students with age 20
		Student[] s1 = StudentList.getStudentsWithAge(20);
		
		// Display the students matching 
		System.out.println("All student with age 20:");		
		for(int i = 0; i < s1.length; ++i) {
			System.out.println(s1);
		}
		
		// All students with 16 < age < 20
		// Could have been much better with a 2D array
		Student[] s2 = StudentList.getStudentsWithAge(16);
		Student[] s3 = StudentList.getStudentsWithAge(17);
		Student[] s4 = StudentList.getStudentsWithAge(18);
		Student[] s5 = StudentList.getStudentsWithAge(19);
		
		// Display age = 16
		System.out.println("All students with age 16:");		
		for(int i = 0; i < s1.length; ++i) {
			System.out.println(s2);
		}
		
		// Display age = 17
		System.out.println("All students with age 17:");		
		for(int i = 0; i < s1.length; ++i) {
			System.out.println(s3);
		}
		
		// Display age = 18
		System.out.println("All students with age 18:");		
		for(int i = 0; i < s1.length; ++i) {
			System.out.println(s4);
		}
		
		// Display age = 19
		System.out.println("All students with age 19:");		
		for(int i = 0; i < s1.length; ++i) {
			System.out.println(s5);
		}
		
		// Display age = 20
		System.out.println("All students with age 20:");		
		for(int i = 0; i < s1.length; ++i) {
			System.out.println(s2);
		}
	}

}
