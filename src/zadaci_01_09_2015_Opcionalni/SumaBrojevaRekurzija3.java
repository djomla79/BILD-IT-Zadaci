package zadaci_01_09_2015_Opcionalni;

import java.util.Scanner;

public class SumaBrojevaRekurzija3 {

	public static void main(String[] args) {
		/*
		 Write a recursive method to compute the following series:
		 m(i) = 1/2 + 2/3 +...+ i/i+1
		 Write a test program that displays m(i) for i = 1, 2, . . ., 10.
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		
		int broj = input.nextInt(); // unos broja
		
		while(broj < 0) {           // petlja radi dok se uslov ne ispuni
			System.out.println("Unos ne moze biti negativan!");
			System.out.print("Unesite broj: ");
			broj = input.nextInt();
		}
		
		System.out.print("Suma za uneseni broj je: ");
		System.out.printf("%.2f", suma(broj));  // pozivanje metode
		
		input.close();
	}
	/** Metoda koja prima argument int 'n'
	 * i vraca sumu po formuli */
	public static double suma(int n) {
		
		if(n == 0) {    // ako je broj 0
			
			return 0;   // vraca vrijednost 0
		} else {        // ako je veci od 0
			            // vraca vrijednost po formuli koristeci rek. metodu
			return (double)n / (n + 1) + suma(n - 1);
		}
		
	}
	
}
