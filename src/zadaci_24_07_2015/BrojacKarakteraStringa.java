package zadaci_24_07_2015;

import java.util.Scanner;

public class BrojacKarakteraStringa {

	private static char ch;
	public static void main(String[] args) {
		/*
		 Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header:
		 public static int countLetters(String s).
		 Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite rijec: ");
		// unos stringa
		String rijec = input.next();
		
		countLetters(rijec); // pozivanje metode
		
		input.close();
	}
	/** Metoda koja broji slova u stringu */
	public static int countLetters(String s) {
		
		int brojac = 0;
		// petlja koja prolazi kroz string
		for(int i=0; i<s.length(); i++) {
			ch = s.charAt(i);
			brojac++;  // i broji koliko karaktera uneseni string ima
			System.out.print(ch);
		}
		// ispis u konzolu
		System.out.println("\nUnesena rijec ima: " + brojac + " karaktera.");
		return brojac;  // vraca broj karaktera u stringu
	}
}
