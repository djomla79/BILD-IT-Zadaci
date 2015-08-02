package zadaci_02_08_2015;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese cijeli
		 trocifreni broj te provjerava da li je unijeti broj palindrom.
		 Broj je palindrom ukoliko se èita isto i sa lijeva na desno i
		 sa desna na lijevo npr. 121, 131, itd.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite trocifreni broj: ");
		
		int broj = input.nextInt();   // unos broja
		
		System.out.print("Da li je uneseni broj palindrome? " + isPalindrome(broj)); // pozivanje metode
		
		input.close();
	}
	/** Metoda koja obrce uneseni broj naopako */
	public static int reverse(int number) {
		
		String broj = Integer.toString(number); // pretvaranje unesenog broja u string
		String suma = "";
		int brojObrnuto = 0;
		// petlja koja ide kroz string naopako
		for(int i=broj.length()-1; i>=0; i--) {
			suma += broj.charAt(i);  // unos karaktera iz stringa u novi prazan string
		}
		
		brojObrnuto = Integer.parseInt(suma);  // pretvaranje dobijenog obrnutog stringa u integer
		
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
