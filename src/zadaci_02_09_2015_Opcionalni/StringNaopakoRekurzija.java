package zadaci_02_09_2015_Opcionalni;

import java.util.Scanner;

public class StringNaopakoRekurzija {

	public static void main(String[] args) {
		/*
		 Write a recursive method that displays a string
		 reversely on the console using the following header:
		 
		 public static void reverseDisplay(String value)
		 
		 For example, reverseDisplay("abcd") displays dcba.
		 Write a test program that prompts the user to enter a string and displays its reversal.
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		
		String str = input.next(); // unos stringa (abcd)
		
		System.out.print("String naopako: ");
		
		reverseDisplay(str);       // pozivanje metode
		
		input.close();
	}
	/** Metoda koja prima string 'n'
	 * i vraca obrnuti string 'n' */
	public static void reverseDisplay(String n) {
		
		if(n.length() != 0) {                         // ako string ima 1 ili vise karaktera
			
			System.out.print(n.charAt(n.length()-1)); // ispis zadnjeg karaktera
			
			String str = n.substring(0, n.length()-1);// string str postaje string n bez zadnjeg karaktera
			
			reverseDisplay(str);                      // pozivanje metode za novi string str (sama sebe - rekurzija)
		}
	}
}
