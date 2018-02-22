package package0040;

import java.util.ArrayList;
import java.util.List;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n). If d(a) = b and d(b) = a, where a ≠ b, then a
 * and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
 * 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * @author jpredota
 *
 */

public class Task_0021_AmicableNumbers {

	public static void main(String... args) {

		int sumAmicable = 0;
		int[] sumOfDivisors = new int[10_000 + 1];

		for (int i = 2; i < sumOfDivisors.length; i++) {
			System.out.print(i + ": ");
			sumOfDivisors[i] = sumOfDivisors(i);
			System.out.println("-> " + sumOfDivisors[i]);
		}

		for (int i = 2; i < sumOfDivisors.length; i++) {
			if ((sumOfDivisors[i] < sumOfDivisors.length // precomputed
					&& i != sumOfDivisors[i] // 6 != 6
					&& i == sumOfDivisors[sumOfDivisors[i]])
					|| (sumOfDivisors[i] >= sumOfDivisors.length // not precomputed
							&& i != sumOfDivisors[i]) // 6 != 6
							&& i == sumOfDivisors(sumOfDivisors[i])) {

				sumAmicable += i;
				System.out.println("Amicable pair found: " + i + " and " + sumOfDivisors[i]);
			}

		}

		System.out.println("Total sum of amicale pairs under " + (sumOfDivisors.length - 1) + ": " + sumAmicable);

	}

	public static int sumOfDivisors(final int number) {

		// one is not necessary to be tested
		int sum = 1;
		double sqrt = Math.sqrt(number);

		// System.out.print("1 ");

		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) {
				sum += i + number / i; // 2 * 5 = 10 and 5 * 2 = 10
				// System.out.print(i + " " + number / i + " ");
			}
		}

		if (sqrt % 1 == 0) {
			sum += (int) sqrt; // if square root has no decimal point it is then divisor but has to be counted
								// only once
			// System.out.print((int)sqrt + " ");
		}

		// System.out.print(number + " ");

		return sum;
	}

}
