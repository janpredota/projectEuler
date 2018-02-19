package package0020;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n → n/2 (n is even) n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1 It can be seen that this sequence
 * (starting at 13 and finishing at 1) contains 10 terms. Although it has not
 * been proved yet (Collatz Problem), it is thought that all starting numbers
 * finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * @author janpr
 *
 */

public class Task_0014_LongestCollatzSequence {

	public static void main(String args[]) {

		boolean[] field = new boolean[1_000_000];
		int maxLength = 0, maxValue = 0, length, preskoceno = 0;;
		long next;
		
		for (int i = 999_999; i >= 1; i--) {
			
			if (!field[i]) { // pokud cislo jeste nebylo soucasti jineho retezce
				length = 0;
				next = i;
				//System.out.print(next);
				
				do {
					length++;
					next = nextTerm(next);
					if (next < field.length) {
						field[(int)next] = true;
					}
					//System.out.print(" > " + next);
				} while(next > 1);
				
				if (length > maxLength) {
					maxValue = i;
					maxLength = length;
				}
			} else {
				preskoceno++;
				//System.out.println("Preskakuju: " + i);
			}
			//System.out.println("");
		}
		
		System.out.println("Max value: " + maxValue + ", max length: " + maxLength + ", preskoceno prvku: " + preskoceno);
	}

	public static long nextTerm(long previousTerm) {
		if (previousTerm % 2 == 0) {
			return previousTerm / 2;
		}

		return 3 * previousTerm + 1;
	}
}
