package zadaci_24_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArraylist {

	public static void main(String[] args) {
		/*
		 Write the following method that sorts an ArrayList of numbers.
		 
		 public static void sort(ArrayList<Number> list)
		 */

		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> brojevi = new ArrayList<>();   
		
		brojevi.add(11);
		brojevi.add(3);
		brojevi.add(7);
		brojevi.add(1);
		brojevi.add(5);                    // unos brojeva u listu	
		
		sort(brojevi);                     // pozivanje metode za sortiranje brojeva iz liste
		
		input.close();
		
	}
	/** Metoda koja prima arraylistu int brojeva i sortira ih */
	public static void sort(ArrayList<Integer> list) {
		
		Collections.sort(list);            // pozivanje klase Coll. i metode za sortiranje el. liste
		                                   // ispis u konzolu
		System.out.println("Sortirani niz brojeva je: " + list);
		
	}
	
}
