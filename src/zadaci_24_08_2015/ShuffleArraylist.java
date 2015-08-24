package zadaci_24_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArraylist {

	public static void main(String[] args) {
		/*
		 Write the following method that shuffles an ArrayList of numbers:
		 
		 public static void shuffle(ArrayList<Number> list)
		 */

		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> brojevi = new ArrayList<>();   
		
		brojevi.add(1);
		brojevi.add(2);
		brojevi.add(3);
		brojevi.add(4);
		brojevi.add(5);                     // unos brojeva u listu	
		
		shuffle(brojevi);                   // pozivanje metode za mijesanje brojeva u listi
		
		input.close();
		
	}
	/** Metoda koja prima arraylistu int brojeva i mijesa ih */
	public static void shuffle(ArrayList<Integer> list) {
		
		Collections.shuffle(list);          // pozivanje klase Coll. i metode za mijesanje el. liste
		                                    // ispis u konzolu
		System.out.println("Izmjesani niz brojeva je: " + list);
		
	}
	
}
