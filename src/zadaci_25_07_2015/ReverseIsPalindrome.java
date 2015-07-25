package zadaci_25_07_2015;

import java.util.Scanner;

public class ReverseIsPalindrome {

	public static void main(String[] args) {
		/*
		 Napisati metode sa sljedeæim headerima: public static int reverse(int number)
		 i public static boolean isPalindrome(int number).
		 Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.)
		 Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije.
		 Koristite reverse metodu da implementirate isPalindrome metodu.
		 Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		// unos broja
		int broj = input.nextInt();
		// pozivanje metode da li je broj palindrome ili nije, i ispis u konzolu
		System.out.println("Da li je broj Palindrome? " + isPalindrome(broj));
		
		input.close();
	}
	/** Metoda koja obrce uneseni broj naopako */
	public static int reverse(int number) {
		
		String broj = Integer.toString(number); // pretvaranje unesenog broja u string
		String suma = "";
		// petlja koja ide kroz string naopako
		for(int i=broj.length()-1; i>=0; i--) {
			suma += broj.charAt(i);  // unos karaktera iz stringa u novi prazan string
		}
		int brojObrnuto = Integer.parseInt(suma);  // pretvaranje dobijenog obrnutog stringa u integer
		return brojObrnuto;                        // vracanje pretvorenog broja (obrnutog naopako)
	}
	/** Metoda koja provjerava da li je uneseni broj Palindrome */
	public static boolean isPalindrome(int number) {
		
		boolean isPalindrome = false;
		
		if(number == reverse(number)) { // ako je uneseni broj jednak obrnutom broju
			isPalindrome = true;        // onda je taj broj palindrome, vraca true (istinito)
		} else {                        // ako nije jednak
			isPalindrome = false;       // vraca false, nije istinito
		}
		return isPalindrome;            // vraca da li je broj palindrom ili nije
	}
}
