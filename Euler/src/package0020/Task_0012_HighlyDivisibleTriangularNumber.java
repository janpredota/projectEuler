package package0020;

/**
 * The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
 * 
 * @author janpr
 *
 */
public class Task_0012_HighlyDivisibleTriangularNumber {
	
	public static void main(String...strings) {
	
		int number = 1;
		long triangle = number;
	
		do {			
			number++;
			triangle += number;
			System.out.println("Pocitam trojuhelnik " + number + ". stupne: " + triangle);
			
		} while(getCountOfDivisors(triangle) <= 500);
		
		System.out.println("Vysledny trojuhlenik: " + triangle);
	}
	
	private static int getCountOfDivisors(long triangle) {
		
		int divisors = 2; //pocet nastavim na dve, protoze urcite bude delitelne 1 a samosebou
		int half = (int)triangle / 2;
		double sqrt = Math.sqrt(triangle);
		
		for (int i = 2; i < sqrt; i++) { //jednicku a samotne cislo uz jsem zapocital
			if (triangle % i == 0) {
				divisors+= 2;
			}
		}
		
		if (sqrt % 1 == 0) {
			divisors++;
		}
		
		System.out.println("	Pocet delitelu: " + divisors);
		
		return divisors;		
	}
}
