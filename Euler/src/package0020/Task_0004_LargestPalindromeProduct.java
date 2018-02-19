package package0020;

import java.util.ArrayList;
import java.util.List;

public class Task_0004_LargestPalindromeProduct {

	public static void main(String args[]) {

		List<Integer> palindroms = new ArrayList<>();

		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				if (isPlaindrom(String.valueOf(i * j))) {
					palindroms.add(i * j);
				}
			}
		}
		
		System.out.println("Palindromy: ");
		for (int palindrom : palindroms) {
			System.out.println("Palindrom: " + palindrom);
		}

		int maximum = palindroms.get(0);
		for (int palindrom : palindroms) {
			if (maximum < palindrom) {
				maximum = palindrom;
			}
		}
		System.out.println("Maximum: " + maximum);
	}

	private static boolean isPlaindrom(String input) {
		
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				return false;
			}
		}
		
		return true;
	}

}
