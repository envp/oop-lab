package lab1;

public class Fibonacci {

	/**
	 * Computes and prints the Fibonacci numbers and their average
	 * @param args number of Fibonacci numbers to process (args[0])
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, n = Integer.parseInt(args[0]);
		int[] fn = new int[n];
		float avg;

		// Non-standard fibonacci series
		fn[0] = 1;
		fn[1] = 1;
		for(int i = 0; i < n - 2; ++i) {
			fn[i + 2] = fn[i + 1] + fn[i];
			
		}
		for(int i = 0; i < n; ++i) {
			sum += fn[i];
			System.out.print(fn[i] + " ");
		}
		avg = sum / n;
		System.out.println("\nThe average is " + avg);
	}

}
