package zadaci_20_07_2015;

import java.util.Scanner;

public class NajveciZajedniciDjelilac {

	public static void main(String[] args) {
		/*
		 Napisati metodu koja prima dva cijela broja kao argumente
		 te vraæa najveæi zajednièki djelilac za ta dva broja.
		 PRIMJER:
		 Unesite prvi broj: 125
		 Unesite drugi broj: 2525
		 Najveæi zajednièki djelilac za brojeve 125 i 2525 je 25.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite prvi broj: ");
		
		int n = input.nextInt();
		
		System.out.print("Unesite drugi broj: ");
		
		int m = input.nextInt();
		
		// ispis metode
		System.out.println("Najveci zajednicki djelilac za brojeve " + n + " i " + m + " je " + djelilac(n, m) + ".");
		
		input.close();
	}
	
	/** Metod koji uzima dva parametra (integera) i vraca najveci zajednicki djelilac */
	public static int djelilac(int n, int m) {
		
		int nzd = 1;
		int broj = 2;
		// petlja u kojoj uzimamo parametre
		while(broj <= n && broj <= m) {
			if(n % broj == 0 && m % broj == 0) { 
				nzd = broj;
			}
			broj++;
		}
		// i vracamo najveci zajednicki djelilac
		return nzd;
	}
}
