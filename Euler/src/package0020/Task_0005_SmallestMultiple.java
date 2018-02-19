package package0020;

/* 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Task_0005_SmallestMultiple {

	public static void main(String args[]) {

		boolean numberNotFound = true;
		long number = 0;
		
		while (numberNotFound) { 
			
			numberNotFound = false;
			number += 20;
			//System.out.println("Cislo: " + number);
			
			for (int i = 1; i <= 20; i++) {
				if (number % i != 0) {
					numberNotFound = true;
					break;
				}
			}
		}
		
		System.out.println(number);
	}
}
