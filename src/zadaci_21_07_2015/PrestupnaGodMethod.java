package zadaci_21_07_2015;

import java.util.Scanner;

public class PrestupnaGodMethod {

	public static void main(String[] args) {
		
		/*
		 Napisati program koji ispisuje sve prestupne godine,
		 10 po liniji, od godine 101 do 2100, odvojene jednim spaceom.
		 Takoðer ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.
		 */
		
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite prvu i zadnju godinu i broj godina po liniji: "); // ispis texta za unos godina
		
		int prva = input.nextInt();        // unos godine od koje racunamo prestupne godine
		int zadnja = input.nextInt();      // unos godine do koje racunamo prestupne godine
		int brojPoLiniji = input.nextInt();// unos broja koji odredjuje koliko prestpunih godina da printa u jednom redu, npr 10
		
		// ispis svih prestupnih godina od npr. 101 do 2100 (koje korisnik unese)
		System.out.println("Prestupne godine, od " + prva + ". do " + zadnja + ". godine su: ");
		
		prestupneGodine(prva, zadnja, brojPoLiniji);  // pozivanje metode
		input.close();
	}
	/** Metod koji uzima parametre i izracunava prestupne godine */
	public static void prestupneGodine(int prva, int zadnja, int brojPoLiniji) {
		
		int brojac = 0;
		// petlja koja izracunava prestupne godine od prve do zadnje unesene
		for (int godina = prva; godina <= zadnja; godina++) {
		   if (godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0)) {
			  brojac++;  // brojac prestupnih godina
			  if (brojac % brojPoLiniji == 0) { // i koliko godina da ispise po liniji u konzoli
					System.out.println(godina + " ");
			   } else {
					System.out.print(godina + " ");
			   }
		   }
	     }
		// ispis ukupnog broja prestupnih godina
	System.out.println("\nUkupan broj prestupnih godina izmedju " + prva + ". i " + zadnja + ". godine je: " + brojac);
	}
}