package lab1;

public class HarmonicSum {

	/**
	 * Compute the difference between left-to-right and right-to-left rounding
	 * of the harmonic sum
	 * @param args the number of terms to process (args[0])
	 */
	public static void main(String[] args) {
		int nTerms = Integer.parseInt(args[0]);
		double sumLR = 0.0, sumRL = 0.0;
		double diff;
		System.out.println(
			"Computing LR and RL difference for first " +
			args[0] + " terms of the harmonic sum..."
			);	
		
		// Loop to get the desired sums
		for(int i = 1; i <= nTerms; ++i) {
			sumLR += 1/(double)i;
			sumRL += 1/(double)(nTerms - i + 1);
		}
	diff = sumLR - sumRL;
	// (Absolute) value?
	//diff *= sumLR > sumRL ? 1 : -1;
	System.out.println("sumLR - sumRL = " + diff);
	}
}
