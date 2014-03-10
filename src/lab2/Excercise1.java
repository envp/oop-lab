package lab2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Excercise1 {

	/**
	 * Take 10 integers from System.in and print their sum (BUfferedReader bsaed)
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		int sum = 0;
		BufferedReader reader = new BufferedReader(	new InputStreamReader(System.in));
		for(int i = 0; i < 10; ++i) {
			System.out.print("Enter a number: ");
			sum += Integer.parseInt(reader.readLine());
		}
		System.out.println("Sum = " + sum);
	}

}
