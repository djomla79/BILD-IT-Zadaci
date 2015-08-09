package zadaci_09_08_2015;

import java.util.Arrays;
import java.util.Scanner;

public class IdenticneMatrice {

	public static void main(String[] args) {
		/*
		 (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
		 identical if their corresponding elements are equal. Write a method that returns
		 true if m1 and m2 are strictly identical, using the following header:
		 
		 public static boolean equals(int[][] m1, int[][] m2)
		 
		 Write a test program that prompts the user to enter two 3 * 3 arrays of
		 integers and displays whether the two are strictly identical.
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
	/** Metoda koja provjerava da li su matrice identicne */
	public static boolean equals(int[][] m1, int[][] m2) {
		
		if(Arrays.deepEquals(m1, m2)) {                      // uslov ako su matrice identicne
			System.out.println("Matrice su striktno identicne!");   // ispis u konzolu
			return true;                                     // vrati true
		} else {                                             // a ako nisu
			System.out.println("Matrice nisu striktno identicne!"); // ispis u konzolu
			return false;                                    // vrati false
		}		
	}
}
