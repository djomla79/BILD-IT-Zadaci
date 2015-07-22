package zadaci_20_07_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListMaxNumberMethod {

	public static void main(String[] args) {
		/*
		  Napisati sljedeæu metodu koja vraæa najveæu vrijednosti u ArrayListu Integera.
		  Metoda vraæa null ukoliko je lista null iil ukoliko lista sadrži 0 elemenata.
		  
		  public static Integer max(ArrayList<Integer> list)
		 */
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> brojevi = new ArrayList<>();   
		
		int broj;
		int n;
		
		// unosom broja odredjujemo broj integera arrayliste
		System.out.print("Unesite koliko niz sadrzi brojeva: ");
		n = input.nextInt();
		
		// kad unesemo broj 0, u listu dodajemo vrijednost null
		if(n==0) {
			brojevi.add(null);
		} else {
			System.out.print("Unesite brojeve niza: "); // dodavanje brojeva u arraylistu
			for(int i=0; i<n; i++) {
				broj = input.nextInt();
				brojevi.add(broj);
			}
		}
		// pozivanje, ispis metode
		max(brojevi);
		input.close();
	}
	
	/** Metoda koja prima listu integera i vraca najveci clan niza */
	public static ArrayList<Integer> max(ArrayList<Integer> list) {
		
		for (int i=0; i<list.size(); i++) {
		   list.get(i);
		}
		if(list.isEmpty() || list.contains(null)) { // ako je lista prazna ili sadrzi null, metoda vraca null
		return null;
		} else {
			System.out.println("Najveci clan niza: " + list.toString() + " je: " + Collections.max(list));
			return list;
		}
	}

}
