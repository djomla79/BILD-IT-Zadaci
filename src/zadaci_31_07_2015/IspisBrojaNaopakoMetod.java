package zadaci_31_07_2015;

import java.util.Scanner;

public class IspisBrojaNaopakoMetod {

	public static void main(String[] args) {
		
		/*
		 Napišite metodu sa sljedeæim headerom koja vraæa
		 naopako ispisan broj koji joj je proslijeðen kao argument:
		 public static void reverse(int number).
		 Na primjer, reverse(3456) treba da vrati 6543.
		 Napisati program koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako. 
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite broj: ");
		
		int broj = input.nextInt(); // unos broja
		
		reverse(broj);              // pozivanje metode
		
		input.close();

	}
	/** Metoda koja uneseni broj obrce naopako */
	public static void reverse(int number) {	
		
		int priv = (int)Math.abs(number);     // uneseni broj postaje privremeni (ako je neg, postaje poz zbog math.abs)
		
		System.out.print("\nBroj naopako: ");
		while (priv != 0) {                   // dok uneseni broj ne dodje do nule petlja se 'vrti'
			int ostatak = priv % 10;          // broj ostatak postaje zadnja cifra unesenog broja
			System.out.print(ostatak);        // vrsimo printanje te cifre
			priv = priv / 10;                 // zatim uneseni broj smanjujemo za jednu cifru, petlja ide dalje
		}
	}

}
