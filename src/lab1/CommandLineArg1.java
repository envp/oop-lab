package lab1;

public class CommandLineArg1 {

	/**
	 * Print out the command line args given
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		for(int i = 0; i < args.length; ++i) {
			System.out.printf("args[%d] = %s\n", i, args[i]);
		}
	}
}