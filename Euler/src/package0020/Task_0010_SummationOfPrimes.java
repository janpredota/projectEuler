package package0020;

public class Task_0010_SummationOfPrimes {

	static public void main(String argumenty[]) {
		
		/*long sum = 0;
		for (int i = 2; i < 2_000_000; i++) {
			if (isPrime(i)) {
				sum += i;
				System.out.println("Prvocislo: " + i);
			}
		}*/
		
		boolean notPrime[] = new boolean[2_000_000];
		for (int i = 2; i < notPrime.length; i++) {
			for (int j = i*2; j < notPrime.length; j+= i) {
				notPrime[j] = true;
			}
		}
		
		long sum = 0;
		for (int i = 2; i < notPrime.length; i++) {
			if (notPrime[i] == false) {
				sum += i;
			}
		}
		
		System.out.println("Suma: " + sum);
	}
	
	static boolean isPrime(int number) {
		int half = number / 2;
		for (int i = 2; i < half; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
