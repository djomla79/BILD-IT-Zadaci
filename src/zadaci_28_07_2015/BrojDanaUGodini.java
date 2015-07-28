package zadaci_28_07_2015;

import java.util.Scanner;

public class BrojDanaUGodini {

	public static void main(String[] args) {
		/*
		 Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi header:
		 public static int numberOfDayInAYear(int year).
		 Napisati program koji pita korisnika da unese poèetnu godinu,
		 krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite pocetnu godinu: ");
		
		int pocetna = input.nextInt();         // unos pocetne godine
		
		System.out.print("Unesite krajnju godinu: ");
		
		int krajnja = input.nextInt();        // unos krajnje godine
		
		numberOfDayInAYear(pocetna, krajnja); // pozivanje metode
		
		input.close();
	}
	/** Metoda za ispis koliko dana ima u godini */
	public static void numberOfDayInAYear(int pocetna, int krajnja) {
		
		for(int godina=pocetna; godina<=krajnja; godina++) { // petlja koja prolazi kroz unesene godine
			if(prestupna(godina)) {                          // ako je godina prestupna
				System.out.println("Godina " + godina + " ima 366 dana."); // ispis u konzolu
			} else {                                         // ako godina nije prestupna
				System.out.println("Godina " + godina + " ima 365 dana");  // ispis u konzolu
			}
		}
	}
	/** Metod koji provjerava da li je godina prestupna ili nije */
	public static boolean prestupna(int godina) {
		
		if (godina%400==0 || (godina%4==0 && godina%100!=0)) { // po formuli ako je godina prestupna
			return true;                                       // vraca true, istinito
		} else {                                               // ako nije prestupna
			return false;                                      // vraca false, neistinito
		}
	}
}
