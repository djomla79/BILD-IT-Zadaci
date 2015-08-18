package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistCombineTwoLists {

	public static void main(String[] args) {
		/*
		 Write a method that returns the union of two array lists of integers using the following header:
		 
		 public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2)
		 */
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> niz1 = new ArrayList<>();   
		ArrayList<Integer> niz2 = new ArrayList<>();   
		
		System.out.print("Unesite 5 brojeva u niz1: ");
		
		for (int i=0; i<5; i++) {
			niz1.add(input.nextInt());      // unos brojeva u prvi niz
		}	
		
		System.out.print("Unesite 5 brojeva u niz2: ");
		
		for (int i=0; i<5; i++) {
			niz2.add(input.nextInt());      // unos brojeva u drugi niz
		}	
		
		union(niz1, niz2);                  // pozivanje metode za spajanje dvije liste
		input.close();
		
	}
	/** Metoda koja prima dvije liste integera i vraca jednu sastavljenu od te dvije unesene */
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		
		ArrayList<Integer> list = new ArrayList<>(list1);  // kreiranje nove liste i dodavanje prve liste u nju
		list.addAll(list2);                                // dodavanje druge liste u listu
		
		for(int i=0; i<list.size(); i++) {                 // petlja koja prolazi kroz citavu listu
			list.get(i);
		}
		
		System.out.println("Spojeni brojevi dva niza su: " + list); // ispis svih elemenata liste
		return list;                                       // vraca vrijednost spojene liste
	}
	
}
