package zadaci_22_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class NizoviEquals {

	public static void main(String[] args) {
		
		/*
		Napisati metodu koja vraca true ukoliko su nizovi niz1 i niz2 striktno identicni.
		Koristiti sledeci header:
		  public static boolean equals(int[] niz1, int[] niz2)
		Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva
		te provjerava da li su striktno identicni. 
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata dva niza: ");
		// unos broja kojim odredjujemo broj elemenata 2 niza
		int broj = input.nextInt();
		
		int [] nizo = new int[broj];
				
		int [] nizi = new int[broj];
		
		System.out.print("Unesite " + broj + " elemen(a)ta prvog niza:  ");
		// unos elemenata u prvi niz
		for (int i=0; i<nizo.length; i++) {
			nizo[i] = input.nextInt();
		}

		System.out.print("Unesite " + broj + " elemen(a)ta drugog niza: ");
		// unos elemenata u drugi niz
		for (int i=0; i<nizi.length; i++) {
			nizi[i] = input.nextInt();
		}
		NizoviEquals.equals(nizo, nizi); // pozivanje metode
		input.close();
	}
	/** Metoda provjerava identicnost dva niza */
	public static boolean equals(int[] niz1, int[] niz2) {
		
		if (Arrays.equals(niz1, niz2)) { // ako su nizovi striktno identicni
		System.out.println("Uneseni nizovi su striktno identicni!");
		return true;                     // vrati true (da je istinito)
		} else {
			System.out.println("Uneseni nizovi nisu striktno identicni!");
			return false;                // ako nisu, vrati false (da nije istinito)
		}
	}
	
}
