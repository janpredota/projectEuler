package package0020;

public class Task_0009_SpecialPythagoreanTriplet {

	public static void main(String...strings) {
		
		for (int c = 1; c <= 1000; c++) {
			for (int b = 1; b < c; b++) {
				for (int a = 1; a < b; a++) {
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a + b + c == 1000) {
						System.out.println("a: " + a + ", b: " + b + ", c: " + c);
						System.out.println("Product: " + (a * b * c));
					}
				}
			}
		}
	}
}
