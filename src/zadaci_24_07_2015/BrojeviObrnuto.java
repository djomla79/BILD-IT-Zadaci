package zadaci_24_07_2015;

import java.util.Scanner;

public class BrojeviObrnuto {

	public static void main(String[] args) {
		
		/*
		Napisite program koji ucitava 10 cijelih brojeva od korisnika
		u niz te ih ispisuje u obrnutom redoslijedu.
        */
		
        Scanner input = new Scanner(System.in);
		
        int [] niz = new int[10]; // odredjivanje duzine niza
		
        System.out.print("Unesite elemente niza: ");
		// unos elemenata u niz
		for (int i=0; i<niz.length; i++) {
			niz[i] = input.nextInt();
		}
		// ispis elemenata iz niza u obrnutom redoslijedu
		for (int i=niz.length-1; i>=0; i--) {
		    System.out.print(niz[i] + " ");
		}
		input.close();
	}
}
