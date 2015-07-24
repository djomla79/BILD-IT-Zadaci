package zadaci_24_07_2015;

import java.util.Scanner;

public class KarteSpil {

	public static void main(String[] args) {
		/*
		 Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte.
		 Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K)
		 te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka).
		 Primjer: Karta koju ste izvukli je 10 u znaku kocke.
		 */
		
		Scanner input = new Scanner(System.in);
		// odredjivanje velicine niza spila karata
		int [] spil = new int[52];
		// odredjivanje niza karti
		String [] karte = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		// odredjivanje niza znakova karti
		String [] znakovi = {"Srce", "Pik", "Djetelina", "Kocka"};
		// petlja koja inicijalizuje spil karata
		for(int i=0; i<spil.length; i++) {
			spil[i] = i;
		}
		// petlja koja nasumicno generise karte u spilu 
		for(int i=0; i<spil.length; i++) {
			spil[i] = spil[(int)(Math.random()*spil.length)];
		}
		// petlja koja nasumicno generise jednu kartu iz spila
		for(int i=0; i<1; i++) {
		String karta = karte[spil[i]%13];  // string koji odredjuje kartu
		String znak = znakovi[spil[i]/13]; // string koji odredjuje znak karte
		System.out.println("Karta koju ste izvukli je: " + karta + " u znaku " + znak); // ispis u konzolu
		}
		input.close();
	}

}
