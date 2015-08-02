package zadaci_02_08_2015;

import java.util.Scanner;

public class SocailSecurityNumberSSN {

	public static void main(String[] args) {
		/*
		  Napisati program koji pita korisnika da unese Social Security Number (SSN)
		  u formatu DDD-DD-DDDD gdje D predstavlja broj.
		  Program treba da provjerava da li je broj unesešen u ispravnom formatu.
		  Ukoliko nije, program pita korisnika da pokuša ponovo.
		  Ukoliko jeste unešen u pravom formatu, program završava sa radom.
		 */
		Scanner input = new Scanner(System.in);
		
		boolean validan = true;
		boolean isValid = true;
		
		String str1 = "", str2 = "", str3 = "", ssn = "";
		
	do {
		System.out.print("Unesite 9 jednocifrenih brojeva: ");
		
		for(int i=0; i<3; i++) {
			str1 += input.next();
		}
		for(int i=0; i<2; i++) {
			str2 += input.next();                                          // unos brojeva
		}
		for(int i=0; i<4; i++) {
			str3 += input.next();
		}
	
		for(int i=0; i<str1.length(); i++) {                              // petlja prolazi kroz prvi string brojeva
			if(Character.isDigit(str1.charAt(i)) && str1.length() == 3) { // ako su u stringu brojevi i duzina stringa je 3
				validan = true;                                           // vraca true, da je validan
			} else {
				validan = false;
			}
		}
		
		for(int i=0; i<str2.length(); i++) {                              // petlja prolazi kroz drugi string brojeva
			if(Character.isDigit(str2.charAt(i)) && str2.length() == 2) { // ako su u stringu brojevi i duzina stringa je 2
				validan = true;                                           // vraca true, da je validan
			} else {
				validan = false;
			}
		}
		
		for(int i=0; i<str3.length(); i++) {                              // petlja prolazi kroz treci string brojeva
			if(Character.isDigit(str3.charAt(i)) && str3.length() == 4) { // ako su u stringu brojevi i duzina stringa je 4
				validan = true;                                           // vraca true, da je validan
			} else {
				validan = false;
			}
		}
		
		ssn = str1 + "-" + str2 + "-" + str3;                             // unos tri stringa plus karakteri - u prazan ssn string
		
		if(validan && ssn.length() == 11) {                               // ako su uslovi ispunjeni
		System.out.print("Social Security Number je: " + ssn);            // ispis stringa ssn u konzolu
		isValid = true;                                                   // petlja se zavrsava
		} else {                                                          // ako uslovi nisu ispunjeni
			System.out.println("Greska, unos pogresan!");                 // ispis greske
			isValid = false;                                              // petlja nastavlja da se 'vrti'
		}
		
		} while(!isValid);                                                // petlja se 'vrti' dok se uslov ne ispuni
		input.close();
	}

}
