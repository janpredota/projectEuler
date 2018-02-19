package euler;

import java.sql.Date;
import java.time.LocalDate;

/**
 * You are given the following information, but you may prefer to do some
 * research for yourself.
 * 
 * 1 Jan 1900 was a Monday. Thirty days has September, April, June and November.
 * All the rest have thirty-one, Saving February alone, Which has twenty-eight,
 * rain or shine. And on leap years, twenty-nine. A leap year occurs on any year
 * evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century
 * (1 Jan 1901 to 31 Dec 2000)?
 * 
 * @author jpredota
 *
 */

public class Task_0019_CountingSundays {

	public static void main(String args[]) {

		int numberOfSundays = 0, offsetPrvniNedele = 5, pocetNedelRok, pocetDnu;
		boolean leapYear;
		int[] prvnihoVMesici = new int[12];
		for (int i = 1901; i <= 2000; i++) {

			leapYear = isLeapYear(i);
			pocetDnu = leapYear ? 366 : 365;
			
			prvnihoVMesici[0] = 1; //leden
			prvnihoVMesici[1] = prvnihoVMesici[0] + 31; //unor
			prvnihoVMesici[2] = prvnihoVMesici[1] + (leapYear ? 29 : 28); //brezen
			prvnihoVMesici[3] = prvnihoVMesici[2] + 31; //duben
			prvnihoVMesici[4] = prvnihoVMesici[3] + 30; //kveten
			prvnihoVMesici[5] = prvnihoVMesici[4] + 31; //cerven
			prvnihoVMesici[6] = prvnihoVMesici[5] + 30; //cervenec
			prvnihoVMesici[7] = prvnihoVMesici[6] + 31; //srpen
			prvnihoVMesici[8] = prvnihoVMesici[7] + 31; //zari
			prvnihoVMesici[9] = prvnihoVMesici[8] + 30; //rijen
			prvnihoVMesici[10] = prvnihoVMesici[9] + 31; //listopad
			prvnihoVMesici[11] = prvnihoVMesici[10] + 30; //prosinec
			

			System.out.println("Rok " + i + ", prestupny rok " + leapYear + ", pocet dni " + pocetDnu + ", " + numberOfSundays + " nedel, offset byl " + offsetPrvniNedele + " dni");
			for (int j = 0; j < prvnihoVMesici.length; j++)
			{
				if ((prvnihoVMesici[j] - offsetPrvniNedele - 1) % 7 == 0) {
					numberOfSundays++;
					System.out.println("	" + (j + 1));
				}
			}

			//vypocet offsetu v dalsim roce od nedele
			pocetNedelRok = (pocetDnu - 1 - offsetPrvniNedele) / 7 + 1;
			offsetPrvniNedele -= pocetDnu - pocetNedelRok * 7;
			offsetPrvniNedele %= 7;
		}
		
		System.out.println("Celkovy pocet nedel zacatkem mesice: " + numberOfSundays);

	}

	private static short getNumberOfDays(int year) {

		short days = 365;

		if (isLeapYear(year)) {
			days++;
		}

		return days;
	}
	
	private static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
