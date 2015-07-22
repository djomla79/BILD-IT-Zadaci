package zadaci_22_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeRedovaMatriceMetod {

	public static void main(String[] args) {
		
		/*
		 Implementirati sledecu metodu da sortira redove u 2D nizu.
		    public static double[][] sortRows(double[][] array)
		 Napisati testni program koji pita korisnika da unese 3x3 matricu
		 (ili da pita korisnika koliku matricu zeli unijeti)
		 te mu ispisuje na konzoli matricu sa sortiranim redovima.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj redova i broj kolona matrice: ");
		// unos broja redova i kolona matrice
		int redovi = input.nextInt();
		int kolone = input.nextInt();
		
		double [][] matrix = new double [redovi][kolone];
		
        System.out.print("Unesite " + redovi + " reda i " + kolone + " kolone: \n");
		// unos elemenata u matricu
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// pozivanje metode
		double [][] niz = sortRows(matrix);
		// ispis matrice sa sortiranim redovima
		System.out.println("\nSortirani redovi matrice su: ");
		for (int i=0; i<niz.length; i++) {
			for (int j=0; j<niz[i].length; j++) {
				System.out.print(niz[i][j] + " ");
			}
		System.out.println();
		}
	    input.close();	
	}
	/** Metoda sortiranja redova matrice */
	public static double[][] sortRows(double[][] array) {
		
		for (int i=0; i<array.length; i++) {
			Arrays.sort(array[i]); // sortiranje redova matrice
		}
		return array;  // vracanje matrice sa sortiranim redovima
	}
	
}
