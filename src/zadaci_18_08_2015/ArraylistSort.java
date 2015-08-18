package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistSort {

	public static void main(String[] args) {
		/*
		 Write the following method that sorts an ArrayList of numbers:
		 
		 public static void sort(ArrayList<Integer> list)
		 */
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> brojevi = new ArrayList<>();   
		
		System.out.print("Unesite pet brojeva: ");
		
		for (int i=0; i<5; i++) {
			brojevi.add(input.nextInt());  // unos brojeva u listu
		}	
		
		sort(brojevi);                     // pozivanje metode
		
		input.close();
		
	}
	/** Metoda koja prima arraylistu integera i sortira ih */
	public static void sort(ArrayList<Integer> list) {
		
		Collections.sort(list);            // pozivanje klase Collections za sortiranje
		System.out.println("Sortirani niz brojeva je: " + list); // ispis u konzolu
		
	}
}
