package zadaci_26_07_2015;

import java.util.Scanner;

public class ValidanPassword {

	public static void main(String[] args) {
		/*
		 Neke web stranice forsiraju odreðena pravila za passworde.
		 Napisati metodu koja provjerava da li je unijeti string validan password.
		 Pravila da bi password bio validan su sljedeæa:
		 1. Password mora biti saèinjen od najmanje 8 karaktera.
		 2. Password smije da se sastoji samo od slova i brojeva.
		 3. Password mora sadržati najmanje 2 broja.
		 Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan"
		 ukoliko su sva pravila ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite password: ");
		
		String password = input.next();  // unos passworda
		
		isValid(password);               // pozivanje metode
		
		input.close();
	}
	/** Metoda provjere validnosti passworda */
	public static boolean isValid(String pass) {
		
		boolean validan = true;
		int brojac = 0;
		
		if(pass.length() < 8) {   // ako je duzina passworda manja od 8 karaktera
			validan = false;      // vraca false
		}
		for(int i=0; i<pass.length(); i++) {                // petlja koja prolazi kroz string password
			if(!Character.isLetterOrDigit(pass.charAt(i))) {// ako karakteri u stringu nisu brojevi ili slova
				validan = false;                            // vraca false
			}
			if(Character.isDigit(pass.charAt(i))) {         // ako su karakteri u stringu brojevi
				brojac++;                                   // brojac broji koliko brojeva ima u stringu
			}
		}
		if(validan && brojac >= 2) {                        // ako je duzina stringa veca od 8, karakteri su slova i brojevi
			System.out.println("Password je validan.");     // i broj brojeva u stringu je veci ili jednak 2, onda
			return true;                                    // metoda vraca true
		} else {                                            // a ako uslovi nisu ispunjeni
			System.out.println("Password nije validan.");
			return false;                                   // metoda vraca false
		}
	}
}
