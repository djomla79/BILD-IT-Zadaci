package zadaci_04_08_2015;

import java.util.Scanner;

public class ASCIIKarakterUBroj {

	public static void main(String[] args) {
		/*
		 Napisati program koji prima karakter te vraæa njegov Unicode.
		 Primjer: ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj karakter.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite karakter: ");
		
		char karakter = input.next().charAt(0);  // unos karaktera
		
		while(!Character.isLetter(karakter)) {   // ako unos nije karakter
			System.out.print("Greska, pogresan unos!\nUnesite karakter ponovo: ");
			karakter = input.next().charAt(0);   // unos karaktera se vrsi ponovo
		}
		                                         // ispis broja po ASCII kod-u unesenog karaktera
		System.out.println("Uneseni karakter " + karakter + ", po ASCII kod-u je broj: " + (int)karakter);
		
		input.close();
	}
}
