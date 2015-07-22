package zadaci_21_07_2015;

import java.util.Scanner;

public class IspisNasumicnihPitanja {

	public static void main(String[] args) {
		
		/*
		  Napisati metodu koja prima jedan argument, broj pitanja, te generise toliko
		  nasumicnih jednostavnih pitanja sabiranja tipa: "Koliko je 2+5?"
		  Metoda treba da broji broj tacnih i netacnih odgovora te ih ispise korisniku.
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj pitanja: ");
		
		int brojPitanja = input.nextInt();
		
		nasumicnaPitanja(brojPitanja); // pozivanje, i ispis metode
		
		input.close();
	}	
	/** Metod koji prima jedan argument i odradjuje radnju u tijelu metoda */
	public static void nasumicnaPitanja(int brojPitanja) {
		
		Scanner input = new Scanner(System.in);
		
		int tacni = 0;
		int netacni = 0;
		int pitanje = 1;
		// petlja koja prima argument, na koliko pitanja ce korisnik odgovoriti 
		for (int i = 0; i < brojPitanja; i++) {

			int broj1 = (int)(Math.random() * 10);  // prvi nasumicno generisan broj
			int broj2 = (int)(Math.random() * 10);  // drugi nasumicno generisan broj
			// ispis pitanja u konzoli
			System.out.print("Pitanje " + pitanje + ".\nKoliko je " + broj1 + " + " + broj2 + "?\nVas odgovor je: ");
			pitanje++; // brojac pitanja	
			
			int odgovor = input.nextInt(); // odgovor na pitanje

			if (odgovor == broj1 + broj2) { // uslov ako je odgovor tacan
				tacni++;  // brojac tacnih odgovora
			} else {
				netacni++; // brojac netacnih odgovora
			}
		}
		// ispis tacnih i netacnih odgovora na pitanja u konzoli
		System.out.println("Broj tacnih odgovora je: " + tacni + "\nBroj netacnih odgovora je: " + netacni);
		input.close();
	}
}