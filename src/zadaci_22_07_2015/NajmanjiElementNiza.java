package zadaci_22_07_2015;

import java.util.Scanner;

public class NajmanjiElementNiza {

	public static void main(String[] args) {
		
		/*
        Napisati metodu koja nalazi najmanji element u nizu
        decimalnih vrijednosti koristeæi se sljedeæim headerom:
        public static double min(double[ ] array)
        Napišite potom test program koji pita korisnika da unese
        deset brojeva te poziva ovu metodu da vrati najmanji element u nizu.
        */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata u nizu: ");
		
		int duzina = input.nextInt();
		// unos broja duzine niza, npr. 10
		double brojevi[] = new double[duzina];
		
		System.out.print("Unesite " + duzina + " elemen(a)ta niza. ");
		// unos elemenata u niz
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = input.nextDouble();
		}
		
		NajmanjiElementNiza.min(brojevi);  // pozivanje metode
		
		input.close();
	}
	/** Metod odredjivanja najmanjeg elementa niza */
	public static double min(double niz[]) {
			
	    double min = niz[0];  // odredjivanje najmanjeg el. u nizu
			
		for (int i = 1; i < niz.length; i++) {
		  if (niz[i] < min) {  // ako je bilo koji element niza manji od odredjenog najmanjeg el.
			  min = niz[i];    // onda taj element postaje najmanji element niza
		  }
		}
		// ispis najmanjeg elementa niza
		System.out.println("Najmanji element niza je: " + min);
		return min;
	}   

}
