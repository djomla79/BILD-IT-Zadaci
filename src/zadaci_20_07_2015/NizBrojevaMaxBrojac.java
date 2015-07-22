package zadaci_20_07_2015;

import java.util.Scanner;

public class NizBrojevaMaxBrojac {

	public static void main(String[] args) {
		
		/*
		 Napisati program koji uèitava niz brojeva, pronalazi najveæi broj
		 te ispisruje koliko se puta taj broj ponavlja.
		 Pretpostavimo da se unos brojeva završava sa nulom.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza: ");
		
		int broj = input.nextInt();
		// unos broja kojim odredjujemo velicinu niza
		int [] niz = new int[broj];
		
		System.out.print("Unesite " + broj + " elemen(a)ta niza: ");
		// unos elemenata u niz
		for (int i=0; i<niz.length; i++) {
			niz[i] = input.nextInt();
		}
		int brojac = 1;
		int max = niz[0];
		// odredjivanje najveceg broja u nizu
		for (int i=1; i<niz.length; i++) {
			if (niz[i] > max) {
				max = niz[i];
			    brojac = 0;	
			}
			// brojac koji broji ponavljanje najveceg broja u nizu
			if (niz[i]==max) {
				brojac++;				
			}
		}
		// ispis
		System.out.println("Najveci broj niza je: " + max + "\nBroj ponavljanja najveceg broja je: " + brojac);
		input.close();	
	}
}
