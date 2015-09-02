package zadaci_02_09_2015_Opcionalni;

import java.util.Scanner;

public class NajveciBrojNizaRekurzija {

	public static void main(String[] args) {
		/*
		 Write a recursive method that returns the largest integer in an array.
		 Write a test program that prompts the user to enter a list of eight
		 integers and displays the largest element.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite osam brojeva: ");
		
		int[] brojevi = new int[8];
		
		for(int i=0; i<brojevi.length; i++) {
			brojevi[i] = input.nextInt();                   // unos brojeva u niz
		}
		
		System.out.print("Najveci clan niza je: ");
		System.out.println(max(brojevi, brojevi.length-1)); // pozivanje metode
		
		input.close();
	}
	/** Metoda koja prima niz brojeva i
	 * broj 'n' i vraca najveci clan niza */
	public static int max(int[] niz, int n) {

		int max = niz[0];         // odredjujemo prvi clan niza kao max
		
		if(niz[n] > max) {        // ako je zadnji clan niza veci od max
			
			max = niz[n];         // taj broj postaje max
			return max;           // vracanje vrijednosti max
		} else {                  // a ako nije
			
			return max(niz, n-1); // pozivamo metodu ponovo (samu sebe - rekurzija)
		}
	}
	
}
