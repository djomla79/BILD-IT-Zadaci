package zadaci_10_08_2015;

import java.util.Scanner;

public class IntersectingPoint {

	public static void main(String[] args) {
		/*
		 (Geometry: intersecting point) Write a method that returns the intersecting point of two lines.
		 The intersecting point of the two lines can be found by using the formula
		 shown in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the
		 two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is
		 
		 public static double[] getIntersectingPoint(double[][] points)
		 
		 The points are stored in a 4-by-2 two-dimensional array points with
		 (points[0][0], points[0][1]) for (x1, y1). The method returns the intersecting
		 point or null if the two lines are parallel. Write a program that prompts
		 the user to enter four points and displays the intersecting point.
		 */
		Scanner input = new Scanner(System.in);

		double[][] a = new double[4][2];
		
		System.out.print("Unesite 8 brojeva matrice, \npo 4 tacke za dvije linije: ");
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = input.nextDouble();          // unos elemenata matrice
				System.out.print(a[i][j] + " ");       // ispis elemenata u konzolu
			}
		System.out.println();
		}

		double[] xy = getIntersectingPoint(a);         // pozivanje metode

		if (xy == null) {                              // ako su linije paralelne, LE nema rjesenja
			System.out.println("Linije su paralelne.");// ispis u konzolu
		} else {                                       // ako linije nisu paralelne, LE ima rjesenje,
			System.out.print("Tacke presjeka linija za unesene tacke su: " + xy[0] + " " + xy[1]);// ispis u konzolu
		}
		
		input.close();
	}
	/** Metoda koja prima matricu sa tackama dvije linije
	 * izracunava matricu i tacke za unesene tacke
	 * i vraca tacke presjeka za dobijenu matricu i tacke */
	public static double[] getIntersectingPoint(double[][] point) {
		
		double p00 = point[0][0], p01 = point[0][1], p10 = point[1][0], p11 = point[1][1];
		double p20 = point[2][0], p21 = point[2][1], p30 = point[3][0], p31 = point[3][1];
		
		double[][] a = new double[2][2];
		double[] b = new double[2];
		
		a[0][0] = p01 - p11;                      // dobijanje prvog elementa matrice po formuli
		
		a[0][1] = (p00 - p10);                    // dobijanje drugog el matrice
		if(a[0][1] != 0) {                        // ako je dobijeni el matrice razlicit od 0
			a[0][1] = a[0][1]*-1;                 // element dobija negativnu vrijednost
		}
		
		a[1][0] = p21 - p31;                      // dobijanje treceg el matrice
		
		a[1][1] = (p20 - p30);                    // dobijanje cetvrtog el matrice
		if(a[1][1] != 0) {                        // ako je dobijeni el matrice razlicit od 0
			a[1][1] = a[1][1]*-1;                 // element dobija negativnu vrijednost
		}

		b[0] = (p01 - p11)*p00 - (p00 - p10)*p01; // racunanje tacaka po formuli
		b[1] = (p21 - p31)*p20 - (p20 - p30)*p21;
		
		return linearEquation(a, b);              // vraca linear equation za izracunatu matricu i tacke
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
