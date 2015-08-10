package zadaci_10_08_2015;

import java.util.Scanner;

public class LinearEquation {

	public static void main(String[] args) {
		/*
		 (Algebra: solve linear equations)
		 Write a method that solves the following 2 * 2 system of linear equations:
		 a00x + a01y = b0
		 a10x + a11y = b1
		 x =
		 b0a11 - b1a01
		 a00a11 - a01a10
		 y =
		 b1a00 - b0a10
		 a00a11 - a01a10
		 The method header is
		 
		 public static double[] linearEquation(double[][] a, double[] b)
		 
		 The method returns null if a00a11 - a01a10 is 0. Write a test program that
		 prompts the user to enter a00, a01, a10, a11, b0, and b1, and displays the result. If
		 a00a11 - a01a10 is 0, report that “The equation has no solution.”
		 */
		Scanner input = new Scanner(System.in);
		
		double[][] a = new double[2][2];
		
		double[] b = new double[2];
		
		System.out.print("Unesite 4 elementa matrice: ");
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = input.nextDouble();         // unos elemenata prve matrice
				System.out.print(a[i][j] + " ");      // ispis elemenata u konzolu
			}
		System.out.println();
		}
		
		System.out.print("Unesite 2 broja: ");
		
		for(int i=0; i<b.length; i++) {
			b[i] = input.nextDouble();                // unos elemenata u niz
		}
		
		double[] xy = (linearEquation(a, b));         // pozivanje metode
		                                              // ispis rezultata
		System.out.println("Rezultat za X i Y je: " + xy[0] + " i " + xy[1]);
		
		input.close();
	}
	/** Metoda koja prima matricu i niz elem. i vraca niz sa izracunatim vrijednostima */
	public static double[] linearEquation(double[][] a, double[] b) {
		
		double b0 = b[0], b1 = b[1];
		double a00 = a[0][0], a01 = a[0][1], a10 = a[1][0], a11 = a[1][1];
		
		if(a00*a11 - a01*a10 == 0) {                            // ako je po formuli ispunjen uslov
			System.out.println("The equation has no solution.");// ispis u konzolu
			return null;                                        // vraca null
		}
		
		double x = (b0*a11 - b1*a01) / (a00*a11 - a01*a10);     // racunanje x po formuli
		double y = (b1*a00 - b0*a10) / (a00*a11 - a01*a10);     // racunanje y po formuli
		
		double[] xy = {x, y};                                   // ubacivanje dobijenih vrijednosti u niz
		return xy;                                              // vracanje vrijednosti niza
		
	}
	
}
