package zadaci_07_08_2015;

import java.util.Scanner;

public class CetiriBrojaZaRedom {

	public static void main(String[] args) {
		/*
		 (Pattern recognition: consecutive four equal numbers)
		 Write the following method that tests whether the array
		 has four consecutive numbers with the same value.
		 
		 public static boolean isConsecutiveFour(int[] values)
		 
		 Write a test program that prompts the user to enter a series of integers
		 and displays if the series contains four consecutive numbers with the same value.
		 Your program should first prompt the user to enter the input size—i.e.,
		 the number of values in the series.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza: ");
		
		int duzina = input.nextInt();   // unos duzine niza
		
		while(duzina < 4) {
			System.out.print("Greska!\nUnesite 4 ili vise elemenata u niz: ");
			duzina = input.nextInt();
		}
		
		int [] niz = new int[duzina];
		
		System.out.print("Unesite " + duzina + " elemenata niza: ");
		
		for(int i=0; i<niz.length; i++) {// unos elemenata u niz
			niz[i] = input.nextInt();
		}
		
		isConsecutiveFour(niz);          // pozivanje metode
		
		input.close();
	}
	/** Metoda koja uzima niz brojeva i vraca vrijednost boolean */
	public static boolean isConsecutiveFour(int[] values) {
		
		int broj = values[0];   // odredjujemo broj na prvoj poziciji niza
		int brojac = 0;
		boolean isOk = false;
		
		for(int i=0; i<values.length; i++) { // za sve elemente niza
			if(broj != values[i]) {          // ako je prvi broj u nizu razlicit od sledeceg unesenog
				broj = values[i];            // broj postaje taj novi uneseni broj
			} else {                         // a ako su brojevi isti
				brojac++;                    // brojac broji koliko se puta zaredom ponavlja isti broj
				if(brojac == 4) {            // ako se ponavlja 4 puta za redom
					isOk = true;             // vraca true
				}
			}
		}
		if(isOk) {                           // ako je vrijednost true
			System.out.println("Niz ima 4 broja zaredom."); // ispis u konzolu
		} else {                             // a ako je false
		System.out.println("Niz nema 4 broja zaredom.");    // ispis u konzolu
		}
		return isOk;                         // vraca vrijednost boolean
	}
}
