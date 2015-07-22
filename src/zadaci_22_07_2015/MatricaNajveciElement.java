package zadaci_22_07_2015;

import java.util.Scanner;

public class MatricaNajveciElement {

	public static void main(String[] args) {

		/*
		 Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu.
		 Metoda treba da koristi sljedeæi header:
		 public static int[ ] locateLargest(double[ ][ ] a)
		 Napisati test program koji pita korisnika da unese 2D niz
		 te mu ispisuje lokaciju najveæeg elementa u nizu.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj redova i broj kolona niza: ");
		
		int redovi = input.nextInt();
		int kolone = input.nextInt();
		// unos broja redova i kolona
		double [][] matrix = new double [redovi][kolone];
		
        System.out.print("Unesite " + redovi + " reda i " + kolone + " kolone: ");
		// petlja matrice i unos elemenata matrice
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();  // unos elemenata u matricu
				System.out.print(matrix[i][j] + " "); // ispis elemenata u konzolu
			}
			System.out.println();
		}
	MatricaNajveciElement.locateLargest(matrix);  // pozivanje metode
	input.close();
	}
	/** Metod koji odredjuje lokaciju najveceg elementa matrice */
	public static int locateLargest(double[][] a) {
		
		double max = a[0][0];  // odredjen najveci el matrice kao pocetni
		int index1 = 0;        // prvi index broja
		int index2 = 0;        // drugi index broja
		// petlja koja prolazi kroz cijelu matricu
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j] > max) {  // ako je bilo koji broj matrice veci od pocetnog najveceg broja
					max = a[i][j];    // taj broj postaje najveci broj matrice
					index1 = i;       // prvi index najveceg broja matrice
					index2 = j;       // drugi index najveceg broja matrice
				}
			}
		}
		// ispis u konzolu najveceg br. matrice i njegovih indexa
		System.out.println("Najveci broj matrice je " + max + "\nLokacija najveceg elementa je na: (" + index1 + ", " + index2 + ")");
		return (int)max;
	}

}
