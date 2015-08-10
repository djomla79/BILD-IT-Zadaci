package zadaci_10_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class IdenticneMatrice {

	public static void main(String[] args) {
		/*
		 (Identical arrays)
		 The two-dimensional arrays m1 and m2 are identical if they have the same contents.
		 Write a method that returns true if m1 and m2 are identical, using the following header:
		 
		 public static boolean equals(int[][] m1, int[][] m2)
		 
		 Write a test program that prompts the user to enter two 3 * 3
		 arrays of integers and displays whether the two are identical.
		 */
		Scanner input = new Scanner(System.in);
		
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
        
        System.out.println("Unesite elemente prvog niza: ");
		for(int i=0; i<matrix1.length; i++) {
			for(int j=0; j<matrix1[i].length; j++) {
				matrix1[i][j] = input.nextInt();              // unos elemenata prve matrice
				System.out.print(matrix1[i][j] + " ");        // ispis elemenata u konzolu
			}
		System.out.println();
		}
		
		System.out.println("Unesite elemente drugog niza: ");
		for(int i=0; i<matrix2.length; i++) {
			for(int j=0; j<matrix2[i].length; j++) {
				matrix2[i][j] = input.nextInt();             // unos elemenata druge matrice
				System.out.print(matrix2[i][j] + " ");       // ispis elemenata u konzolu
			}
			System.out.println();
		}
		
		equals(matrix1, matrix2);                            // pozivanje metode          
		
		input.close();
	}
	/** Metoda koja provjerava da li su matrice imaju iste elemente */
	public static boolean equals(int[][] m1, int[][] m2) {
		
		boolean ok = true;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<m1.length; i++) {  // za elemente matrica
			list.add(m1[0][i]);           // dodajemo prvi red elemenata matrice u listu
			list.add(m1[1][i]);           // dodajemo drugi red elemenata matrice u listu
			list.add(m1[2][i]);           // dodajemo treci red elemenata matrice u listu
			                              // ako elementi iz liste odgovaraju elementima druge matrice
			if(list.contains(m2[0][i]) && list.contains(m2[1][i]) && list.contains(m2[2][i])) {
				ok = true;                // vraca true
			} else {                      // a ako ne odgovaraju
				ok = false;               // vraca false
			}
		}
		
		if(ok) {                          // ako je uslov ispunjen
			System.out.println("Matrice imaju iste elemente!");  // ispis u konzolu			
		} else {                          // ako uslov nije ispunjen
			System.out.println("Matrice nemaju iste elemente!"); // ispis u konzolu			
		}
		return ok;			              // vraca vrijednost boolean, true ili false
	}
}
