package zadaci_27_07_2015;

import java.util.Scanner;

public class ConvertMillis {

	public static void main(String[] args) {
		/*
		 Napisati metodu koja pretavara milisekunde u sate, minute i sekunde.
		 Metoda treba da koristi sljedeæi header:
		 public static String convertMillis(long millis).
		 Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.
		 Na primjer convertMillis(100000) treba da vrati 0:1:40.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite milisekunde: ");
		
		long milisekunde = input.nextLong();            // unos milisekundi
		
		System.out.println(convertMillis(milisekunde)); // pozivanje metode
		
		input.close();
	}
	/** Metoda pretvaranja milisekundi u sate, minute i sekunde */
	public static String convertMillis(long millis) {
		
		int ukupno = (int)millis / 1000;
		
		int sekunde = ukupno % 60;         // dobijanje sekundi
		
		int minuti = ukupno / 60 % 60;     // dobijanje minuta
		
		int sati = ukupno / 120 % 60;      // dobijanje sekundi
		
		String sms = sati + ":" + minuti + ":" + sekunde; // unos sati, minuta i sekundi u string
		
		return sms;                        // vracanje stringa sa satima, minutama i sekundama
		
	}
}
