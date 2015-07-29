package zadaci_29_07_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GradoviPoAbecedi {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu.
		 Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, program vraæa Atlanta, Chicago, Los Angeles.
		 */
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> gradovi = new ArrayList<>();
		
		String grad = "";
		
		System.out.print("Unesite broj gradova koliko zelite da unesete: ");
		
		int broj = input.nextInt();      // odredjivanje duzine niza za unos gradova
		
		System.out.print("Unesite imena " + broj + " grada: ");
		for(int i = 0; i <= broj; i++) { // petlja za unos gradova u listu
			grad = input.nextLine();     // unos gradova
			gradovi.add(grad);			 // spremanje gradova u listu
		}
		Collections.sort(gradovi);       // sortiranje unesenih gradova u listi po abecedi
		
		System.out.print(gradovi);       // ispis sortiranih gradova u konzolu
		
		input.close();
	}

}
