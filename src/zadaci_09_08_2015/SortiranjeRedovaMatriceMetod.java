package zadaci_09_08_2015;

import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeRedovaMatriceMetod {

	public static void main(String[] args) {
		
		/*
		 (Row sorting) Implement the following method to sort the rows in a twodimensional array.
		 A new array is returned and the original array is intact.
		 
		 public static double[][] sortRows(double[][] m)
		 
		 Write a test program that prompts the user to enter a 3 * 3 matrix of double
		 values and displays a new row-sorted matrix.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj redova i broj kolona matrice: ");
		
		int redovi = input.nextInt();
		int kolone = input.nextInt();                        // unos broja redova i kolona matrice
		
		double[][] matrix = new double[redovi][kolone];
		
        System.out.print("Unesite " + redovi + " reda i " + kolone + " kolone: \n");
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();          // unos elemenata u matricu
				System.out.print(matrix[i][j] + " ");       // ispis matrice u konzolu
			}
			System.out.println();
		}
		
		double[][] niz = sortRows(matrix);                 // pozivanje metode
		
		System.out.println("\nSortirani redovi matrice su: ");
		
		for(int i=0; i<niz.length; i++) {
			for(int j=0; j<niz[i].length; j++) {
				System.out.print(niz[i][j] + " ");          // ispis matrice sa sortiranim redovima
			}
		System.out.println();
		}
	    input.close();	
	}
	/** Metoda sortiranja redova matrice */
	public static double[][] sortRows(double[][] array) {
		
		for(int i=0; i<array.length; i++) {
			Arrays.sort(array[i]);                         // sortiranje redova matrice
		}
		return array;                                      // vracanje matrice sa sortiranim redovima
	}
	
}
