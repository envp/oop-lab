package lab2;

import java.util.Scanner;

public class Excercise2 {

	/**
	 * Take 10 integers from System.in and print their sum (Scanner based)
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 10; ++i) {
			System.out.print("Enter a number: ");
			sum += input.nextInt();
		}
		input.close();
		System.out.println("Sum = " + sum);
	}

}
