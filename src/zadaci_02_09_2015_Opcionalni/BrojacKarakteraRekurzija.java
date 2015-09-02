package zadaci_02_09_2015_Opcionalni;

import java.util.Scanner;

public class BrojacKarakteraRekurzija {

	public static void main(String[] args) {
		/*
		 Write a recursive method that finds the number of occurrences
		 of a specified letter in a string using the following method header:
		 
		 public static int count(String str, char a)
		 
		 For example, count("Welcome", 'e') returns 2.
		 Write a test program that prompts the user to enter a string and a character,
		 and displays the number of occurrences for the character in the string.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		
		String str = input.next();              // unos stringa
		
		System.out.print("Unesite slovo: ");
		
		char slovo = input.next().charAt(0);    // unos karaktera
		
		System.out.print("Broj karaktera '" + slovo + "' u stringu '" + str + "' je: ");
		
		System.out.println(count(str, slovo));  // pozivanje metode

		input.close();
	}

	/** Metoda koja prima string, karakter i
	 * vraca broj ponavljanja karaktera u stringu */
	public static int count(String str, char a) {
		
		int brojac = 0;
		
		if(str.length() == 0) { // ako je duzina stringa 0
			return 0;           // vraca se vrijednost 0
		} else {                // ako je duzina veca od 0
			
			if(str.charAt(str.length()-1) == a) {  // i ako je zadnji karakter jednak unesenom karakteru
				brojac++;                          // brojac se povecava za jedan
			}
			str = str.substring(0, str.length()-1);// string str postaje string str bez zadnjeg karaktera
			
			return brojac + count(str, a);         // pozivamo metodu sa novim str stringom (sama sebe - rekurzija)
		}
	}
}
