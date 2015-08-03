package zadaci_03_08_2015;

import java.util.Scanner;

public class UppercaseKarakteri {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese neki string
		 te mu vraæa broj uppercase karaktera u unijetom stringu.
		 Na primjer, ukoliko korisnik unese string "Dobrodošli u Dubai"
		 program mu vraæa da je broj uppercase karaktera 2.
		 */
		Scanner input = new Scanner(System.in);
		
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int brojac = 0;
		
		System.out.print("Unesite string: ");
		
		String str = input.nextLine();                 // unos stringa
		
		for(int i=0; i<str.length(); i++) {            // petlja koja prolazi kroz uneseni string str
			for(int j=0; j<uppercase.length(); j++) {  // petlja koja prolazi kroz string sa uppercase-ima
			if(str.charAt(i) == uppercase.charAt(j)) { // ako je bilo koji karakter unesenog stringa jednak karakteru uppercase stringa
				brojac++;                              // brojac se povecava za 1
			}
			}
		}
		                                               // ispis broja ponavljanja uppercase karaktera u unesenom stringu
		System.out.println("Broj uppercase karaktera u stringu je: " + brojac);
		input.close();
	}

}
