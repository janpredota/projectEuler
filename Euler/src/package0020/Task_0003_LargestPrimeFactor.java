package package0020;
import java.util.ArrayList;
import java.util.List;

public class Task_0003_LargestPrimeFactor {

	public static void main(String args[]) {
		
		long number = 600851475143L;
		List<Long> listOfPrimeFactors = new ArrayList<>();
		
		for (long i = 2; i <= number / 2; i++) {

			while(number % i == 0)
			{
				listOfPrimeFactors.add(i);
				number /= i;
			}
		}
		listOfPrimeFactors.add(number);
		
		for (long prime : listOfPrimeFactors) {
			System.out.println("Prime: " + prime);
		}
	}
	
	
}
