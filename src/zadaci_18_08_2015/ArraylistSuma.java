package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistSuma {

	public static void main(String[] args) {
		/*
		 Write the following method that returns the sum of all numbers in an ArrayList:
		 
		 public static double sum(ArrayList<Double> list)
		 
		 Write a test program that prompts the user to enter 5 numbers,
		 stores them in an array list, and displays their sum.
		*/
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> brojevi = new ArrayList<>();   
		
		System.out.print("Unesite pet brojeva: ");
		
		for (int i=0; i<5; i++) {
			brojevi.add(input.nextDouble()); // unos brojeva u listu
		}
		
		sum(brojevi);                        // pozivanje metoda
		
		input.close();
	}
	/** Metoda koja prima arraylistu i vraca sumu svih el. liste tipa double */
	public static double sum(ArrayList<Double> list) {
		
		double suma = 0;
		
		for(int i=0; i<list.size(); i++) {  // za sve elemente liste
			suma += list.get(i);            // suma svih elemenata liste
		}
		
		System.out.println("Ukupna suma svih brojeva niza je: " + suma); // ispis u konzolu
		return suma;
	}
}
