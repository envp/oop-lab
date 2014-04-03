package lab5;
/**
 * 
 * @author Vaibhav
 *
 */
public class AddressList {
	/**
	 * This method returns the count of the addresses from addressList which
	 * have the city attribute equals to city parameter passed for this method.
	 * If the length of any passed argument is zero or value of any passed argument is null then it returns -1.
	 * @param addressList List of addresses 
	 * @param city city to search for
	 * @return citycount or -1
	 */
	public static int countAddressWithCity(Address[] addressList, String city) {
		int count = 0;
		
		if(addressList.length == 0 || city == null) {
			return -1;
		}
		else {
			for(int i = 0; i < addressList.length; ++i) {
				if(addressList[i].getCity() == city) {
					++count;
				}
			}
		}
		return count;
	}
	
	/**
	 * This method returns the count of the addresses from addressList 
	 * which have the pin attribute starting with strP parameter 
	 * passed for this method. 
	 * If the length of any passed argument is zero 
	 * or value of any passed argument is null then it returns -1.
	 * @param addressList List of addresses
	 * @param pin pincode to search for
	 * @return pincount or -1
	 */
	public static int countAddressWithPin(Address[] addressList, String strP) {
		int count = 0;
		
		if(addressList.length == 0 || strP == null) {
			return -1;
		}
		else {
			for(int i = 0; i < addressList.length; ++i) {
				if((addressList[i].getPin()).startsWith(strP)) {
					++count;
				}
			}
		}
		
		if(count > 0) {
			return count;
		}
		else {
			return -1;
		}
	}
	
	/**
	 * This method returns all the addresses from addressList by storing them 
	 * in String[] which have the city attribute equals to city parameter 
	 * passed for this method. 
	 * If the length of any passed argument is zero or value of any passed 
	 * argument is null then it returns null. 
	 * If addressList does not contain any address with city attribute value 
	 * equal to city parameter passed for this method even then it returns null.
	 * @param addressList List of addresses
	 * @param city city to search for
	 * @return Array of hits or null
	 */
	public static Address[] getAddressWithCity(Address[] addressList, String city) {
		int count = AddressList.countAddressWithCity(addressList, city);
		Address[] aList;
		if(count > 0) {
			aList = new Address[count];
			int j = 0;
			for(int i = 0; i < addressList.length; ++i) {
				if(addressList[i].getCity() == city) {
					aList[j] = addressList[i];
					++j;
				}
			}
		}
		else {
			return null;
		}
		return aList;
	}
	
	/**
	 * This method returns all the addresses from addressList by storing them 
	 * in String[] which have their pin attribute starting with strP parameter 
	 * passed for this method. 
	 * If the length of any passed argument is zero or value of any passed 
	 * argument is null then it returns null. 
	 * If addressList does not contain any address whose pins attribute value 
	 * starts with strP parameter passed for this method even then it returns null.
	 * @param addressList List of addresses
	 * @param strP Pin to search for
	 * @return Array of hits or {@code null}
	 */
	public static Address[] getAddressWithPin(Address[] addressList, String strP) {
		int count = AddressList.countAddressWithPin(addressList, strP);
		Address[] aList;
		
		if(count > 0) {
			aList = new Address[count];
			int j = 0;
			for(int i = 0; i < addressList.length; ++i) {
				if((addressList[i].getPin()).startsWith(strP)) {
					aList[j] = addressList[i];
					++j;
				}
			}
		}
		else {
			return null;
		}
		return aList;
	}
}
