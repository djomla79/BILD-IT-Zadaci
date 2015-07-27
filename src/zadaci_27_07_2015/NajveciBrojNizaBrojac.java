package zadaci_27_07_2015;

import java.util.Scanner;

public class NajveciBrojNizaBrojac {

	public static void main(String[] args) {
		
		/*
		 Napišite program koji uèitava neodreðen broj cijelih brojeva (unos prekida nula),
		 pronalazi najveæi od unijetih brojeva te ispisuje koliko se najveæi broj puta ponovio. 
		 Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje
		 da je najveæi broj 5 te ispisuje da se isti ponavlja 4 puta. 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza: ");
		
		int broj = input.nextInt();                                  // unos
		
		int [] niz = new int[broj];                                  // i odredjivanje broja elemenata niza
		
		System.out.print("Unesite " + broj + " elemen(a)ta niza: ");
		
		for (int i=0; i<niz.length; i++) {                           // petlja koja prolazi kroz citav niz
			niz[i] = input.nextInt();                                // i vrsi se unos elemenata u niz 
		}
		int brojac = 1;
		int max = niz[0];                                            // odredjivanje 1. elementa kao najveci broj niza
		for (int i=1; i<niz.length; i++) {                           // petlja koja ide od 2. elementa niza kroz cijeli niz
			if (niz[i] > max) {                                      // ako je bilo koji elem. niza veci od prvog (max) broja
				max = niz[i];                                        // taj broj postaje najveci (max) broj niza
			    brojac = 0;	                                         // brojac se vraca na 0 (resetuje)
			}
			if (niz[i]==max) {                                       // ako je broj u nizu najveci
				brojac++;				                             // brojac broj ponavljanje tog broja u nizu
			}
		}
		// ispis najveceg broja u nizu i broj njegovih ponavljanja
		System.out.println("Najveci broj niza je: " + max + "\nBroj ponavljanja najveceg broja je: " + brojac);
		input.close();	
	}

}
