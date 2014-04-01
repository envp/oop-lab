package lab5;

public class StudentList {
	public static Student[] list = new Student[10];
	public static int count = 0;
	
	// Won't this overflow for count = 10?
	// ArrayIndexOutOfBoundsException should have been thrown
	
	/**
	 * Adds a student to the StudentList
	 * @param std List of students
	 */
	public static void addStudent(Student std) {
		if(count >= 20) {
			return; // if count is already 20 or more then return
		}
		list[count] = std;
		count++;
	}
	
	/**
	 * Search for students with a certain age
	 * @param age age passed as the query
	 * @return Array of students with age matching that of the query
	 */
	public static Student[] getStudentsWithAge(int age) {
		Student[] results;
		int hits = 0;
		
		// Count how many results exist
		for(int i = 0; i < list.length; ++i) {
			if(list[i].getAge() == age) {
				++hits;
			}
		}
		results = new Student[hits];
		hits = 0;
		// Capture said results with a well sized container
		for(int i = 0; i < list.length; ++i) {
			if(list[i].getAge() == age) {
				results[hits] = list[i];
				++hits;
			}
		}
		
		return results;
	}
	
	/**
	 * Search for students with a certain last name
	 * @param lastName last name passed in the query
	 * @return Array of students with lastname matching that given in the query
	 */
	public static Student[] getStudentsWithLastName(String lastName) {
		Student[] results;
		int hits = 0;
		
		// Count how many results exist
		for(int i = 0; i < list.length; ++i) {
			if(list[i].getName().getLname() == lastName) {
				++hits;
			}
		}
		results = new Student[hits];
		hits = 0;
		// Capture said results with a well sized container
		for(int i = 0; i < list.length; ++i) {
			if(list[i].getName().getLname() == lastName) {
				results[hits] = list[i];
				++hits;
			}
		}
		
		return results;	
	}
}
