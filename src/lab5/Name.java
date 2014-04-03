package lab5;

import java.util.StringTokenizer;
/**
 * Exercise 2.1
 * Tokenize the name delimited by ',' or ';' 
 * @author Vaibhav
 */
public class Name {
	// Constant reperesenting comma for delimiting the name
	private final static String DELIMITER_COMMA = ",";
	
	// Constant reperesenting semi-colon for delimiting the name
	private final static String DELIMITER_SEMI_COLON = ";";
	// First name
	private String fname;
	
	// Middle name
	private String mname;
	
	// Last name
	private String lname;
	
	/**
	 * Accessor method for first name
	 * @return The first name contained in the instance
	 */
	public String getFname() {
		return this.fname;
	}
	
	/**
	 * Accessor method for middle name
	 * @return The middle name contained in the instance
	 */
	public String getMname() {
		return this.mname;
	}
	
	/**
	 * Accessor method for last name
	 * @return The last name contained in the instance
	 */
	public String getLname() {
		return this.lname;
	}
	
	/**
	 * Accessor method for name
	 * @return The full name contained in the instance 
	 */
	public String getName() {
		// Assume that all three are set, other wise this may cause problems
		return getFname() + " " + getMname() + " " + getLname();
	}
	
	public String toString() {
		return getFname() + getMname() + getLname();
	}
	
	/**
	 * Constructor for the Name class
	 * Accepts &lt;First Name&gt;,&lt;MiddleName&gt;,&lt;LastName&gt; or &lt;LastName&gt;;&lt;MiddleName&gt;;&lt;FirstName&gt;
	 * and tokenizes them to the appropriate fields 
	 * @param name String name delimited by , or ; check header for details
	 */
	Name(String name) {
		// Create two tokenizers, one each for , and ; delimited names
		StringTokenizer sTokComma = new StringTokenizer(name, Name.DELIMITER_COMMA);
		StringTokenizer sTokSemiColon = new StringTokenizer(name, Name.DELIMITER_SEMI_COLON);
		
		// Assume that incomplete names are never supplied
		// Implying: We must get 3 tokens
		if(sTokComma.countTokens() == 3) {
			// Set things right the brute way, since we know 3 tokens exist
			this.fname = sTokComma.nextToken();
			this.mname = sTokComma.nextToken();
			this.lname = sTokComma.nextToken();
		}
		else if(sTokSemiColon.countTokens() == 3) {
			// Set things right the brute way, since we know 3 tokens exist
			// Caution, Reversed order!
			this.lname = sTokSemiColon.nextToken();
			this.mname = sTokSemiColon.nextToken();
			this.fname = sTokSemiColon.nextToken();
		}
		else {
			// Actually try throw a MalformedNameException but later
			System.err.println("MalformedNameException: Name must only be" +
					"<FirstName>,<MiddleName>,<LastName> or" +
					"<LastName>;<MiddleName>;<FirstName>");
		}
	}
}
