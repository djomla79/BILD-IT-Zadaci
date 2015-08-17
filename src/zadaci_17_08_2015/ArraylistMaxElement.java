package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistMaxElement {

	public static void main(String[] args) {
		/*
		 Write the following method that returns the maximum value in an ArrayList of integers.
		 The method returns null if the list is null or the list size is 0.
		 
		 public static Integer max(ArrayList<Integer> list)
		 
		 Write a test program that prompts the user to enter a sequence of numbers ending
		 with 0, and invokes this method to return the largest number in the input.
		 */
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> brojevi = new ArrayList<>();   
		
		int broj, n;
		
		System.out.print("Unesite koliko niz sadrzi brojeva: ");
		n = input.nextInt();                            // unosom broja odredjujemo broj elemenata arrayliste
		
		if(n == 0) {                                    // kad unesemo broj 0, u listu dodajemo vrijednost null
			brojevi.add(null);
		} else {
			System.out.print("Unesite brojeve niza: "); // dodavanje brojeva u arraylistu
			for(int i=0; i<n; i++) {
				broj = input.nextInt();
				brojevi.add(broj);
			}
		}
		
		max(brojevi);                                   // pozivanje, ispis metode
		
		input.close();
	}
	
	/** Metoda koja prima listu integera i vraca najveci clan niza */
	public static ArrayList<Integer> max(ArrayList<Integer> list) {
		
		if(list.isEmpty() || list.contains(null)) {    // ako je lista prazna ili sadrzi null, metoda vraca null
			System.out.println(list.get(0));
			return null;
		} else {                                       // ako ima elemente, vraca najveci element niza
			System.out.println("Najveci clan niza: " + list.toString() + " je: " + Collections.max(list));
			return list;
		}
	
	}
}
