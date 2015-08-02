package zadaci_02_08_2015;

import java.util.Scanner;

public class DuzinaIPrvoSlovoStringa {

	public static void main(String[] args) {
		/*
		  Napisati program koji pita korisnika da unese neki string
		  te mu ispisuje dužinu tog stringa kao i prvo slovo stringa. 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		
		String str = input.next();          // unos stringa
		
		for(int i=0; i<str.length(); i++) { // petlja koja ide kroz cijeli string
		}
		                                    // ispis duzine i prvog slova stringa
		System.out.print("\nDuzina stringa je: " + str.length() + "\nPrvo slovo stringa je: " + str.substring(0, 1));
		
		input.close();
	}
	
}
