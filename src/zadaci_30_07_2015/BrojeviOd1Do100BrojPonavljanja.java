package zadaci_30_07_2015;

import java.util.Scanner;

public class BrojeviOd1Do100BrojPonavljanja {

	public static void main(String[] args) {
		
		/*
		 Napisati program koji ucitava cijele brojeve izmedju 1 i 100 te broji
		 koliko se puta koji broj ponavlja i ispisuje za svaki uneseni broj koliko
		 se puta ponovio. Pretpostavite da se unos zavrsava brojem 0.
		 Koristite niz da primite unos podataka od korisnika.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite brojeve od 1 do 100, \nunos se zavrsava sa brojem 0: ");
		
		int broj;
		int[] brojevi = new int[101];       // odredjivanje duzine niza 
		
		do {
			broj = input.nextInt();         // unos brojeva u niz
			brojevi[broj]++;                // brojac za svaki broj u nizu
		} while (broj != 0);                // petlja se 'vrti' dok se ne unese 0
		
		for (int i = 1; i <= 100; i++) {    // petlja brojeva od 1 do 100
			if (brojevi[i] != 0) {          // ako u nizu nema nule
				// ispis u konzolu
				System.out.println("Broj " + i + " se ponovio " + brojevi[i] + " puta.");
			}
		}
	    input.close();
	}	
}