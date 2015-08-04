package zadaci_04_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class JedinstveniBrojevi {

	public static void main(String[] args) {
		/*
		 Napisati program koji uèitava 10 brojeva te ispisuje
		 koilko je jedinstvenih brojeva unijeto te sve jedinstvene
		 brojeve koji su unijeti, razmaknute jednim spaceom.
		 Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom. 
		 */
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> brojevi = new ArrayList<>();
		
		System.out.print("Unesite broj elemenata niza: ");
		
		int elementi = input.nextInt();        // unos broja elemenata niza
		
		System.out.print("Unesite " + elementi + " elemenata niza.");
		
		for(int i=0; i<elementi; i++) {        // petlja koja ide od 0 do unesenog broja elemenata niza
			int broj = input.nextInt();        // unos brojeva
			if (!brojevi.contains(broj)) {     // ako arraylista ne sadrzi uneseni broj
				brojevi.add(broj);             // taj broj se ubacuje u arraylistu
			}
		}
		
		System.out.print("Jedinstveni brojevi su: ");
		for(int i=0; i<brojevi.size(); i++) { // za sve unesene brojeve u arraylisti
			System.out.print(brojevi.get(i) + " "); // ispis svih brojeva iz liste
		}
		                                      // ispis ukupnog broja jedinstvenih brojeva iz liste
		System.out.println("\nUkupno ima: " + brojevi.size() + " jedinstvena/ih broja/eva.");
		input.close();
	}

}
