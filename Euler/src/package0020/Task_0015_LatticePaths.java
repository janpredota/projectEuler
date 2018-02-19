package package0020;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 * 
 * @author janpr
 *
 */

public class Task_0015_LatticePaths {

	public static void main(String[] args) {

		byte[][] pole;
		byte i = 20;
		//for (byte i = 1; i <= 20; i++) {

			pole = new byte[i][i];
			long pocetCest = PosunSe(pole, 0, 0);
			System.out.println("Pocet cest v mrizce " + i + "x" + i + ": " + pocetCest * 2);
		//}

	}

	public static long PosunSe(byte[][] pole, int indexX, int indexY) {

		if (indexX == pole[0].length - 1 || indexY == pole.length) {
			return 1;
		}

		long pocet = 0;
		pocet += PosunSe(pole, indexX + 1, indexY);
		pocet += PosunSe(pole, indexX, indexY + 1);
		return pocet;
	}

}
