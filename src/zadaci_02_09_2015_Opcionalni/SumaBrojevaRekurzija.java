package zadaci_02_09_2015_Opcionalni;

import java.util.Scanner;

public class SumaBrojevaRekurzija {

	public static void main(String[] args) {
		/*
		 Write a recursive method that computes the sum of the digits in an integer.
		 Use the following method header:
		 
		 public static int sumDigits(long n)
		 
		 For example, sumDigits(234) returns 2 + 3 + 4 = 9.
		 Write a test program that prompts the user to enter an integer and displays its sum.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesi broj: ");
		
		int n = input.nextInt();    // unos broja
		                            // pozivanje metode
		System.out.println("Suma cifara unesenog broja je: " + sumDigits(n));
		
		input.close();
	}
	/** Metoda koja prima broj 'n'
	 * i vraca sumu cifara broja*/
	public static int sumDigits(long n) {
		
		int broj = (int)Math.abs(n); // pretvaramo broj n u broj abs vrijednosti
		int suma = 0;
		
		suma += broj % 10;           // u sumu ubacujemo zadnju cifru broja 
		
		if(broj > 0) {               // ako je broj veci od 0
			                         // sumiramo brojeve pozivanjem metode (sama sebe - rekurzija)
			suma += sumDigits(broj /= 10);
		}

		return suma;                 // vracanje ukupne sume cifara unesenog broja
		
	}
}
