package lab5;

import java.util.StringTokenizer;

/**
 * Encapsulates the address of any particular person having attributes as :
 * <ol>
 * 	<li>line1	 : String</li>
 * 	<li>line2	 : String</li>
 * 	<li>line3	 : String</li>
 * 	<li>city	 : char[]</li>
 * 	<li>state	 : char[]</li>
 * 	<li>pin		 : String</li>
 * </ol>
 * @author Vaibhav
 *
 */
public class Address {
	private String line1, line2, line3, pin;
	private char[] city, state;
	private final String DELIM_ADDRESS = "$";
	/**
	 * Embeds the values of all the attributes in $ separated form as per following format:
	 * Ågline1$line2$line3$city$state$pinÅh
	 * @param address address as Ågline1$line2$line3$city$state$pinÅh
	 */
	public Address(String address) {
		StringTokenizer sTok = new StringTokenizer(address, DELIM_ADDRESS);

		// We need all 6 fields to avoid errors
		if(sTok.countTokens() == 6) {
			// Grab 6 tokens
			this.line1 = sTok.nextToken();
			this.line2 = sTok.nextToken();
			this.line3 = sTok.nextToken();
			this.city = (sTok.nextToken()).toCharArray();
			this.state = (sTok.nextToken()).toCharArray();
			this.pin = sTok.nextToken();
		}
		// Actually should throw a MalformedAddressException
		else {
			System.out.println("Malformed address follow this format: " +
					"\"line1$line2$line3$city$state$pin\"");
		}
	}
	
	/**
	 * Accessor method for line1:String
	 * @return line1 of the address
	 */
	public String getLine1() {
		return this.line1;
	}
	
	/**
	 * Accessor method for line2:String
	 * @return line2 of the address
	 */
	public String getLine2() {
		return this.line2;
	}
	
	/**
	 * Accessor method for line3:String
	 * @return line3 of the address
	 */
	public String getLine3() {
		return this.line3;
	}
	
	/**
	 * Accessor method for city:char[]
	 * @return city, as a String Object
	 */
	public String getCity() {
		return new String(this.city);
	}
	
	/**
	 * Accessor method for state:char[]
	 * @return state, as a String Object
	 */
	public String getState() {
		return new String(this.state);
	}
	
	/**
	 * Accessor method for pin:String
	 * @return Pincode given in the address
	 */
	public String getPin() {
		return this.pin;
	}
}
