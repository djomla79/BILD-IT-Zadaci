package zadaci_09_08_2015;

import java.util.Scanner;

public class MatricaNajveciElement {

	public static void main(String[] args) {

		/*
		 Write the following method that returns the location
		 of the largest element in a two-dimensional array:
		 
		 public static Location locateLargest(double[][] a)
		 
		 The return value is an instance of Location.
		 Write a test program that prompts the user to enter a 2D array
		 and displays the location of the largest element in the array.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj redova i broj kolona niza: ");
		
		int redovi = input.nextInt();
		int kolone = input.nextInt();                      // unos broja redova i kolona
		
		double [][] matrix = new double [redovi][kolone];
		
        System.out.print("Unesite " + redovi + " reda i " + kolone + " kolone: ");
		
		for (int i=0; i<matrix.length; i++) {              // petlja matrice i unos elemenata matrice
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();            // unos elemenata u matricu
				System.out.print(matrix[i][j] + " ");      // ispis elemenata u konzolu
			}
			System.out.println();
		}
		
		locateLargest(matrix);                            // pozivanje metode
		
		input.close();
	}
	/** Metod koji odredjuje lokaciju najveceg elementa matrice */
	public static int locateLargest(double[][] a) {
		
		double max = a[0][0];                            // odredjen najveci el matrice kao pocetni
		int index1 = 0;                                  // prvi index broja
		int index2 = 0;                                  // drugi index broja
		
		for (int i=0; i<a.length; i++) {                 // petlja koja prolazi kroz cijelu matricu
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j] > max) {                     // ako je bilo koji broj matrice veci od pocetnog najveceg broja
					max = a[i][j];                       // taj broj postaje najveci broj matrice
					index1 = i;                          // prvi index najveceg broja matrice
					index2 = j;                          // drugi index najveceg broja matrice
				}
			}
		}
		                                                 // ispis u konzolu najveceg br. matrice i njegovih indexa
		System.out.println("Najveci broj matrice je " + max + "\nLokacija najveceg elementa je na: (" + index1 + ", " + index2 + ")");
		return (int)max;
	}
}
