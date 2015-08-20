package zadaci_20_08_2015;

import java.util.Scanner;

public class ConvexPoligon {

	public static void main(String[] args) {
		/*
		 A polygon is convex if it contains any line segments that connects two points of the polygon.
		 Write a program that prompts the user to enter the number of points in a convex polygon,
		 then enter the points clockwise, and display the area of the polygon.
		 formula: area = ((x1y2 + x2y3 + x3y4 + ... + xny1) - (y1x2 + y2x3 + y3x4 + ... + ynx1) / 2
		 
		 Enter the number of the points: 7
		 Enter the coordinates of the points: -12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -3.5
		 The total area is 250.075
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj tacaka: ");
		
		int tacke = input.nextInt();                  // unos broja tacaka
		
		double[][] xy = new double[tacke][2];
		
		System.out.print("Unesite tacke: ");
		
		for(int i=0; i<tacke; i++) {
			xy[i][0] = input.nextDouble();
			xy[i][1] = input.nextDouble();            // unos tacaka
		}
		/** Racunanje povrsine poligona po formuli
		 * (x1y2 + x2y3 + x3y4 +...+ xny1)-(y1x2 + y2x3 + y3x4 +...+ ynx1)/2 */
		double a = 0, b = 0;
		
		for(int i=0; i<6; i++) {
			a += xy[i][0]*xy[i+1][1];
			b += xy[i][1]*xy[i+1][0];
		}
		a += xy[6][0]*xy[0][1];
		b += xy[6][1]*xy[0][0];                       // suma zadnjih tacaka plus suma prvih

		double povrsina = Math.abs((a-b) / 2.0);      // povrsina po formuli
		                                              // ispis povrsine
		System.out.println("Povrsina poligona je: " + povrsina);
		
		input.close();
	}
	
}
