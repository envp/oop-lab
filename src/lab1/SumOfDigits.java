package lab1;

public class SumOfDigits {

	/**
	 * Takes a number as a command line arg and prints out
	 * the sum of its digits
	 * @param args number to process (args[0])
	 */
	public static void main(String[] args) {
		String num = args[0], sumString;
		int sum, n;
		sum = Integer.parseInt(num.substring(0, 1));
		sumString = num.substring(0, 1);
		for(int i = 1; i <= num.length(); ++i){
			n = Integer.parseInt(num.substring(i - 1, i));
			if(i > 1) {
				sumString += " + " + n;
				sum += n;
			}
		}

		System.out.println("The sum of digits = " + sumString + " = " + sum);	
	}

}
