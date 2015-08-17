package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistShuffle {

	public static void main(String[] args) {
		/*
		 Write the following method that shuffles the elements in an ArrayList of integers.
		 
		 public static void shuffle(ArrayList<Integer> list)
		 */
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> brojevi = new ArrayList<>();   
		
		int broj, n;
		
		System.out.print("Unesite koliko niz sadrzi brojeva: ");
		n = input.nextInt();                        // unosom broja odredjujemo broj elemenata arrayliste
		
		System.out.print("Unesite brojeve niza: "); // dodavanje brojeva u arraylistu
		for(int i=0; i<n; i++) {
			broj = input.nextInt();
			brojevi.add(broj);
		}
		
		shuffle(brojevi);                           // pozivanje metode i ispis
		
		input.close();
	}
	/** Metoda koja nasumicno rasporedjuje elemente u listi */
	public static void shuffle(ArrayList<Integer> list) {
		
		Collections.shuffle(list);                  // mijesanje elemenata list
		
		System.out.println("Izmijesani elementi liste: " + list);
		
	}
}
