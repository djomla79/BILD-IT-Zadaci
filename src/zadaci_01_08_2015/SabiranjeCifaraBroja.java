package zadaci_01_08_2015;

import java.util.Scanner;

public class SabiranjeCifaraBroja {

	public static void main(String[] args) {
		/*
		 Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju.
		 Koristite sljedeæi header: public static int sumDigits(long n).
		 Na primjer, ako pozovemo metodu i proslijedimo joj broj 234
		 (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
		 */
		
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite broj: ");

		long broj = input.nextLong();         // unos broja
		
		input.close();

		System.out.println(sumDigits(broj));  // pozivanje metode
		
	}
	/** Metoda koja vraca ukupan zbir cifara unesenog broja */
	public static long sumDigits(long n) {
       
		// konvertujemo long u int te koristimo Math.abs()
		// metodu da bi program radio i sa negativnim brojevima
		int temp = (int)Math.abs(n);
		int result = 0;
		
		while (temp != 0) {            // petlja se 'vrti' dok uneseni broj ne dodje do 0
			int ostatak = temp % 10;   // dobijamo zadnju cifru broja
			result += ostatak;         // povecavamo sumu za zadnju cifru broja 
			temp = temp / 10;          // dobijamo novi broj, manji za jednu cifru
	}
		return result;                 // vraca ukupan rezultat svih okretanja petlje
    }

}
