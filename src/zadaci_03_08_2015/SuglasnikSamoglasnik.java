package zadaci_03_08_2015;

import java.util.Scanner;

public class SuglasnikSamoglasnik {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese slovo te
		 provjerava da li je unijeti karakter samoglasnik ili suglasnik.
		 Na primjer, ukoliko korisnik unese B, program vraæa da je dati karakter suglasnik.
		 Ukoliko unese A, program vraæa da je dati karakter samoglasnik.
		 */
		Scanner input = new Scanner(System.in);
		
		String samoglasnici = "AaEeIiOoUu";
		String suglasnici = "BbCcDdFfGgHhJjKkLlMmNnPpRrSsTtVvXxYyZz";
		boolean isOk = true;
		
		System.out.print("Unesite slovo: ");
		
		char slovo = input.next().charAt(0);        // unos slova
		
		for(int i=0; i<samoglasnici.length(); i++) {// petlja koja prolazi kroz string samoglasnici
			if(samoglasnici.charAt(i) == slovo) {   // ako je bilo koji karakter u stringu jednak unesenom
				isOk = true;                        // vraca true
			} 
		}
		for(int i=0; i<suglasnici.length(); i++) {  // petlja koja prolazi kroz string suglasnici
			if(suglasnici.charAt(i) == slovo) {     // ako je bilo koji karakter u stringu jednak unesenom
				isOk = false;                       // vraca false
			} 
		}
		if(isOk) {                                  // ako je uslov ispunjen (vraca true)
			System.out.println("Slovo " + slovo + " je samoglasnik."); // ispis u konzolu
		} else {                                    // ako uslov nije ispunjen (vraca false)
			System.out.println("Slovo " + slovo + " je suglasnik.");   // ispis u konzolu
		}
		input.close();
	}

}
