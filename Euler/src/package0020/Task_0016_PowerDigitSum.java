package package0020;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * 
 * @author janpr
 *
 */

public class Task_0016_PowerDigitSum {

	public static void main(String str[]) {

		String cislo = "1";

		for (int mocnina = 1; mocnina <= 1_000; mocnina++) {
			cislo = NasobekDvema(cislo);
			System.out.println("2^" + mocnina + " = " + cislo);
		}

		System.out.println("Suma cislic: " + SumaStringu(cislo));
	}

	private static String NasobekDvema(String cislo) {

		int cislice, minule = 0;
		StringBuilder noveCislo = new StringBuilder(cislo.length() + 1);
		for (int i = cislo.length() - 1; i >= 0; i--) { // zacinam od konce
			cislice = cislo.charAt(i) - '0';
			cislice = cislice * 2 + minule;
			if (noveCislo.length() == 0) {
				noveCislo.append(cislice % 10);
			} else {
				noveCislo.insert(0, cislice % 10);
			}
			minule = cislice / 10;
		}

		if (minule > 0) {
			noveCislo.insert(0, minule);
		}

		return noveCislo.toString();
	}
	
	private static long SumaStringu(String string) {
		
		long suma = 0;
		for (int i = 0; i < string.length(); i++) {
			suma += string.charAt(i) - '0';
		}
		
		return suma;
	}

}
