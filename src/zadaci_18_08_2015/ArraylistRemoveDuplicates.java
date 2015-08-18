package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistRemoveDuplicates {

	public static void main(String[] args) {
		/*
		 Write a method that removes the duplicate elements from
		 an array list of integers using the following header:
		 
		 public static void removeDuplicate(ArrayList<Integer> list)
		 */
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> brojevi = new ArrayList<>();   
		
		System.out.print("Unesite deset brojeva: ");
		
		for (int i=0; i<10; i++) {
			brojevi.add(input.nextInt());   // unos brojeva u listu
		}	
		
		removeDuplicate(brojevi);           // pozivanje metode
		input.close();
		
	}
	/** Metoda koja izbacuje duple elemente iz liste */
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		for(int i=0; i<list.size(); i++) {                 // petlja koja prolazi kroz citavu listu
			for(int j=1; j<list.size(); j++) {             // petlja koja prolazi kroz citavu listu pocevsi od drugog el. liste
				if(list.contains(i) == list.contains(j)) { // ako u listi postoje isti elementi
					list.remove(j);                        // uklanjanje tih elemenata iz liste
					i=0;                                   // resetovanje brojaca na 0
					j=0;                                   // resetovanje brojaca na 0
				}
			}
		}
	System.out.println("Jedinstveni brojevi niza su: " + list); // ispis elemenata u konzolu
	}

}
