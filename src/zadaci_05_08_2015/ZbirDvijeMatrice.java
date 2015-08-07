package zadaci_05_08_2015;

import java.util.Scanner;

public class ZbirDvijeMatrice {

	public static void main(String[] args) {
		/*
		 (Algebra: add two matrices) Write a method to add two matrices.
		 The header of the method is as follows:
		 
		 public static double[][] addMatrix(double[][] a, double[][] b)
		 
		 In order to be added, the two matrices must have the same dimensions and the
		 same or compatible types of elements. Let c be the resulting matrix.
		*/
		Scanner input = new Scanner(System.in);
		
		double [][] matrix1 = new double [3][3];
		double [][] matrix2 = new double [3][3];
        
        System.out.println("Unesite elemente prvog niza: ");
		for (int i=0; i<matrix1.length; i++) {
			for (int j=0; j<matrix1[i].length; j++) {
				matrix1[i][j] = input.nextDouble();           // unos elemenata prve matrice
				System.out.print(matrix1[i][j] + " ");        // ispis elemenata u konzolu
			}
		System.out.println();
		}
		System.out.println("Unesite elemente drugog niza: ");
		for (int i=0; i<matrix2.length; i++) {
			for (int j=0; j<matrix2[i].length; j++) {
				matrix2[i][j] = input.nextDouble();          // unos elemenata druge matrice
				System.out.print(matrix2[i][j] + " ");       // ispis elemenata u konzolu
			}
			System.out.println();
		}
		double [][] niz = addMatrix(matrix1, matrix2);       // pozivanje metode
		
		System.out.println("Elementi zbira dvije matrice su: "); // ispis nove matrice u konzolu
		for (int i=0; i<niz.length; i++) {
			for (int j=0; j<niz[i].length; j++) {
				System.out.print(niz[i][j] + " ");
			}
		System.out.println();
		}
		input.close(); 
	}
	/** Metoda koja prima kao argumente dvije matrice i vraca njihov zbir */
	public static double[][] addMatrix(double[][]a, double[][]b) {
		
		double[][] c = new double[3][3];
		
		for (int i=0; i<a.length; i++) {         // za matrice a i b
			for (int j=0; j<a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];     // njihov zbir je nova matrica c
			}
		}
		return c;                                // vracanje vrijednosti nove matrice
	}
}
