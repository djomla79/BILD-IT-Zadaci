package zadaci_29_07_2015;

import java.util.Scanner;

public class GodineDaniBrojMinuta {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese broj minuta
		 (npr. 1 milijardu) te ispiše korisniku koliko je to u godinama i danima.
		 Zbog jednostavnosti, pretpostavimo da godina ima 365 dana. 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj minuta: ");
		
		int minuta = input.nextInt();            // unos minuta
		
		int godina = minuta / (60 * 24 * 365) % 60; // dobijanje ukupno godina
		
		int dan = minuta / (60 * 24) % 365;   // dobijanje ukupno dana
		                                         // ispis u konzolu
		System.out.println(minuta + " minuta ima " + godina + " godina/u/e, i " + dan + " dana.");
		
		input.close();
	}

}
