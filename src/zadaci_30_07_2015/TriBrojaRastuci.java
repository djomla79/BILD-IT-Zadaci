package zadaci_30_07_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TriBrojaRastuci {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese 3 cijela broja
		 te mu ispiše ta ista tri broja u rastuæem redosljedu.
		 Bonus: Napisati metodu koja prima tri cijela broja 
		 kao argumente te vraæa brojeve u rastuæem redosljedu. 
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite tri broja: ");
		
		int broj1 = input.nextInt();
		int broj2 = input.nextInt();   // unos brojeva
		int broj3 = input.nextInt();
		
		rastuci(broj1, broj2, broj3);  // pozivanje metode
		
		input.close();
	}
	/** Metoda koja prima integere kao argumente a vraca arraylistu int */
	public static ArrayList<Integer> rastuci(int broj1, int broj2, int broj3) {
		
		ArrayList<Integer> list = new ArrayList<>();  // arraylista
		
		list.add(broj1);
		list.add(broj2);                              // unos brojeva u arr listu
		list.add(broj3);
		Collections.sort(list);                       // sortiranje brojeva u listi
		System.out.println("Brojevi u rastucem nizu: " + list); // ispis u konzoli
		return list;                                  // vraca arraylistu int
	}
}
