package zadaci_05_08_2015;

import java.util.Scanner;

public class MatricaSabiranjeKolona {

	public static void main(String[] args) {
		/*
		 (Sum elements column by column) Write a method that returns the sum of all the
		 elements in a specified column in a matrix using the following header:
		 
		 public static double sumColumn(double[][] m, int columnIndex)
		 
		 Write a test program that reads a 3-by-4 matrix and displays the sum of each column
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj redova i broj kolona niza: ");
		
		int redovi = input.nextInt();
		int kolone = input.nextInt();          // unos redova i kolona matrice
		
		int [][] matrix = new int [redovi][kolone];
		
        System.out.print("Unesite " + redovi + " reda i " + kolone + " kolone: ");
		
		for (int i=0; i<matrix.length; i++) { // unos elemenata u matricu
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	
		System.out.print("Unesite broj index-a kolone: ");
	
		int kolona = input.nextInt();         // unos indexa kolone
	
		sumaKolona(matrix, kolona);           // pozivanje metode
	
		input.close();

	}
	/** Metoda koja prima argumente matricu i integer i vraca sumu kolone matrice */
	public static void sumaKolona(int[][] niz, int index) {
	
		int suma = 0;
	
		for (int i=0; i<niz.length; i++) {
			suma += niz[i][index-1];          // sabiranje elemenata zeljene kolone u matrici
		}
		                                      // ispis ukupnog zbira kolone za uneseni index kolone
		System.out.println("Ukupan zbir svih elemenata " + index + ". kolone je: " + suma);
	}	
}
