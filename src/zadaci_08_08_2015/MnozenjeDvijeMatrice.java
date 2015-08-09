package zadaci_08_08_2015;

import java.util.Scanner;

public class MnozenjeDvijeMatrice {

	public static void main(String[] args) {
		/*
		 (Algebra: multiply two matrices) Write a method to multiply two matrices.
		 The header of the method is:
		 
		 public static double[][] multiplyMatrix(double[][] a, double[][] b)
		 
		 To multiply matrix a by matrix b, the number of columns in a must be the same as
		 the number of rows in b, and the two matrices must have elements of the same or
		 compatible types. Let c be the result of the multiplication.
		 Assume the column size of matrix a is n.
		 */
		
		Scanner input = new Scanner(System.in);
		
		double [][] matrix1 = new double [3][3];
		double [][] matrix2 = new double [3][3];
        
        System.out.print("Unesite elemente prvog niza: ");
		for (int i=0; i<matrix1.length; i++) {
			for (int j=0; j<matrix1[i].length; j++) {
				matrix1[i][j] = input.nextDouble();           // unos elemenata prve matrice
				System.out.print(matrix1[i][j] + " ");        // ispis elemenata u konzolu
			}
		System.out.println();
		}
		System.out.print("Unesite elemente drugog niza: ");
		for (int i=0; i<matrix2.length; i++) {
			for (int j=0; j<matrix2[i].length; j++) {
				matrix2[i][j] = input.nextDouble();          // unos elemenata druge matrice
				System.out.print(matrix2[i][j] + " ");       // ispis elemenata u konzolu
			}
			System.out.println();
		}
		double [][] niz = multiplyMatrix(matrix1, matrix2);       // pozivanje metode
		
		System.out.println("Elementi mnozenja dvije matrice su: "); // ispis nove matrice u konzolu
		for (int i=0; i<niz.length; i++) {
			for (int j=0; j<niz[i].length; j++) {
				System.out.print(niz[i][j] + " ");
			}
		System.out.println();
		}
		input.close(); 
	}
	/** Metoda koja prima kao argumente dvije matrice i vraca njihov umnozak */
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		
		double[][] c = new double[3][3];
		
		for (int i=0; i<a.length; i++) {         // za matrice a i b
			for (int j=0; j<a[i].length; j++) {
				c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j]; // njihov umnozak je nova matrica c
			}
		}
		return c;                                // vracanje vrijednosti nove matrice
	}
	
}
