package package0020;

public class Task_0020_FactorialDigitSum {
	
	public static void main(String args[]) {
		StringBuilder factorial = new StringBuilder("1");
		
		for (int i = 2; i <= 100; i++) {
			
			System.out.print(i + "! = ");
			factorial = multiplyString(factorial, i);
			System.out.println(" = " + factorial);
		}
		
		System.out.println("100! = " + factorial);
		
		int sum = 0;
		for (int i = 0; i < factorial.length(); i++) {
			sum += Integer.valueOf(factorial.charAt(i)) - '0';
		}

		System.out.println();
		System.out.println("Sum of digits 100! = " + sum);
	}
	
	private static StringBuilder multiplyString(StringBuilder number, int multiplier) {

		System.out.print(number + " * " + multiplier);
		String multiplication = "0";
		for (int i = 0; i < number.length(); i++) {
			multiplication = addToString(multiplication.toString(), powerString(String.valueOf((number.charAt(i) - '0') * multiplier), number.length() - 1 - i));
		}
		number = new StringBuilder(String.valueOf(multiplication));
		
		return number;
	}
	
	private static String addToString(String number, String addition) {
		
		String bigger = number.length() > addition.length() ? number : addition;
		String smaller = number.length() > addition.length() ? addition : number;
		StringBuilder result = new StringBuilder(bigger.length());
		
		//System.out.print("	"+ number + " + " + addition);
		
		int previous = 0, diff = bigger.length() - smaller.length();
		for (int i = smaller.length() - 1; i >= 0 ; i--) {
				
				 int sum = bigger.charAt(i + diff) - '0' + smaller.charAt(i) - '0' + previous;
				 if (sum > 9) {
					 result.append((char)('0' + sum % 10));
					 previous = sum / 10;
				 } else {
					 result.append((char)('0' + sum));
					 previous = 0;
				 }
		}

		for (int i = diff - 1; i >= 0; i--) {
			
			 int sum = bigger.charAt(i) - '0' + previous;
			 if (sum > 9) {
				 result.append((char)('0' + sum % 10));
				 previous = sum / 10;
			 } else {
				 result.append((char)('0' + sum));
				 previous = 0;
			 }
		}
		
		if (previous > 0) {
			result.append(previous);
		}
		
		return result.reverse().toString();
	}
	
	private static String powerString(String number, int power) {
		
		StringBuilder builder = new StringBuilder(number.length() + power);
		builder.append(number);
		for (int i = 0; i < power; i++) {
			builder.append('0');
		}
		
		return builder.toString();
	}

}
