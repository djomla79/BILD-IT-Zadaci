package zadaci_28_07_2015;

import java.util.Scanner;

public class SubstringStringa {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese dva stringa te provjerava
		 i ispisuje da li je drugi string substring prvog stringa.
		 Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC
		 kao drugi string program mu ispisuje da je BC substring ABCD stringa.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite rijec: ");
		// unos prve rijeci
		String str1 = input.next();
		
		System.out.print("Unesite drugu rijec: ");
		// unos druge rijeci
		String str2 = input.next();
		// ako je drugi string veci od prvog, mijenjamo im mjesta
		while(str2.length() > str1.length()) {  // petlja se 'vrti' dok drugi string ima vise karaktera od prvog
			System.out.println("Greska, druga rijec je veca od prve!");
			System.out.println("Unesite drugu rijec ponovo: ");
			str2 = input.next();                // unesite drugi string ponovo
		}
		// petlja koja prolazi kroz prvi string
		for(int i=0; i<str1.length(); i++) {
		}
			if(str1.contains(str2)) { // ako je drugi string substring prvog stringa
				System.out.println("String " + str2 + " je substring stringa " + str1);   // ispis u konzolu
			} else {                  // a ako nije
				System.out.println("String " + str2 + " nije substring stringa " + str1); // ispis u konzolu
			}
		input.close();
	}	
}
