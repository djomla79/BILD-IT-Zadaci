package zadaci_02_09_2015_Opcionalni;

import java.util.Scanner;

public class BrojNaopakoRekurzija {

	public static void main(String[] args) {
		/*
		 Write a recursive method that displays an int value
		 reversely on the console using the following header:
		 
		 public static void reverseDisplay(int value)
		 
		 For example, reverseDisplay(12345) displays 54321.
		 Write a test program that prompts the user to enter
		 an integer and displays its reversal.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		
		int broj = input.nextInt(); // unos broja (12345)
		
		System.out.print("Broj naopako: ");
		
		reverseDisplay(broj);       // pozivanje metode
		
		input.close();
	}
	/** Metoda koja prima broj 'n'
	 * i vraca broj sa obrnutim ciframa */
	public static void reverseDisplay(int n) {
		
		if(n != 0) {                 // ako je broj razlicit od 0
			
			System.out.print(n % 10);// ispis zadnje cifre broja
			
			reverseDisplay(n / 10);  // pozivanje metode (sama sebe - rekurzija)
		}
	}
}
