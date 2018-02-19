package package0020;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used?
 * 
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20
 * letters. The use of "and" when writing out numbers is in compliance with
 * British usage.
 * 
 * @author janpr
 *
 */
public class Task_0017_NumberLetterCounts {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for (short i = 1; i <= 1_000; i++) {
			System.out.println(i + ": " + numberToWord(i));
			sum += numberToWord(i).length();
		}
		
		System.out.println("Delka: " + sum);
	}
	
	private static String numberToWord(short number) {
		
		if (number < 10) {
			return numberUnderTenToWord(number);
		}
		
		if (number < 100) {
			return numberUnderHundredToWord(number);
		}
		
		if (number < 1000) {
			return numberUnderThousandToWord(number);
		}
		
		return "onethousand";
	}
	
	private static String numberUnderTenToWord(short number) {

		switch (number) {
			case 1: return "one";
			case 2: return "two";
			case 3: return "three";
			case 4: return "four";
			case 5: return "five";
			case 6: return "six";
			case 7: return "seven";
			case 8: return "eight";
			case 9: return "nine";
		}
		
		return "";
	}
	
	private static String numberUnderHundredToWord(short number) {
		
		if (number < 10) {
			return numberUnderTenToWord(number);
		}

		switch (number) {
			case 10: return "ten";
			case 11: return "eleven";
			case 12: return "twelve";
			case 13: return "thirteen";
			case 15: return "fifteen";
			
			case 14: return "fourteen";
			case 16: return "sixteen";
			case 17: return "seventeen";
			case 18: return "eighteen";
			case 19: return "nineteen";
		}
		
		switch (number / 10) {
			case 2: return "twenty" + numberUnderTenToWord((short)(number % 10));
			case 3: return "thirty" + numberUnderTenToWord((short)(number % 10));
			case 4: return "forty" + numberUnderTenToWord((short)(number % 10));
			case 5: return "fifty" + numberUnderTenToWord((short)(number % 10));
			
			case 6: return "sixty" + numberUnderTenToWord((short)(number % 10));
			case 7: return "seventy" + numberUnderTenToWord((short)(number % 10));
			case 8: return "eighty" + numberUnderTenToWord((short)(number % 10));
			case 9: return "ninety" + numberUnderTenToWord((short)(number % 10));
		}
		
		return "";
	}
	
	private static String numberUnderThousandToWord(short number) {
		
		if (number % 100 == 0) {
			return numberUnderTenToWord((short)(number / 100)) + "hundred";
		}
		
		return numberUnderTenToWord((short)(number / 100)) + "hundredand" + numberUnderHundredToWord((short)(number % 100));
	}

}
