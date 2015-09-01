package zadaci_01_09_2015_Opcionalni;

import java.util.Scanner;

public class SumaBrojevaRekurzija1 {

	public static void main(String[] args) {
		/*
		 Write a recursive method to compute the following series:
		 m(i) = 1 + 1/2 + 1/3 + 1/4 + 1/i
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
		System.out.printf("%.2f", suma(broj));   // pozivanje metode
		
		input.close();
	}
	/** Metoda koja prima argument
	 * int 'n' i vraca sumu po formuli */
	public static double suma(int n) {
		
		if(n == 0) {         // ako je broj 0
			return 1;        // vraca broj 1
			
		} else if(n == 1) {  // a ako je broj 1
			return 1 + n;    // vraca 1 + n, (1+1=2)
			
		} else {             // a ako je broj veci od 1
			                 // vraca vrijednost po formuli koristeci rek. metodu
			return (double)1/n + suma(n - 1);
		}	
	}
}
