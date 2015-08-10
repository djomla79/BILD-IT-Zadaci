package zadaci_10_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AreaOfaTriangle {

	public static void main(String[] args) {
		/*
		 (Geometry: area of a triangle) Write a method that
		 returns the area of a triangle using the following header:
		 
		 public static double getTriangleArea(double[][] points)
		 
		 The points are stored in a 3-by-2 two-dimensional array
		 points with points[0][0] and points[0][1] for (x1, y1).
		 The triangle area can be computed using the formula in Programming Exercise 2.19.
		 The method returns 0 if the three points are on the same line.
		 Write a program that prompts the user to enter three points
		 of a triangle and displays the triangle's area.
		 */
		Scanner input = new Scanner(System.in);
		
		double[][] a = new double[3][2];
		
		System.out.print("Unesite 6 elemenata matrice, \npo tri tacke za dva trougla: ");
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = input.nextDouble();          // unos elemenata matrice
				System.out.print(a[i][j] + " ");       // ispis elemenata u konzolu
			}
		System.out.println();
		}
		                                               // pozivanje metode i ispis u konzolu
		System.out.println("Povrsina trougla za unesene tacke je: " + getTriangleArea(a));
		
		input.close();
	}
	
	/** Metoda koja prima argumente matrice i vraca povrsinu trougla */
	public static double getTriangleArea(double[][] points){
		
		ArrayList<Double> stranice = new ArrayList<>();
		
		double x1 = points[0][0], y1 = points[0][1], x2 = points[1][0],
			   y2 = points[1][1], x3 = points[2][0], y3 = points[2][1];
		
		double str1 = getDistance(x1, y1, x2, y2);    // racunanje duzine prve stranice
		double str2 = getDistance(x1, y1, x3, y3);    // racunanje duzine druge stranice
		double str3 = getDistance(x2, y2, x3, y3);    // racunanje duzine trece stranice
		
		stranice.add(str1);                           // ubacivanje vrijednosti stranica u listu
		stranice.add(str2);
		stranice.add(str3);
		Collections.sort(stranice);                   // sortiranje liste od najmanje do najvece vrijednosti
		
		/** Ako je zbir najmanje dvije stranice manji ili jednak najvecoj stranici*/
		if(stranice.get(2) >= stranice.get(1) + stranice.get(0)) {
			System.out.println("Tacke su na istoj stranici.");
			return 0;                                 // vraca nulu
		}
		
		double s = (str1 + str2 + str3) / 2;          // racunanje poluobima
		                                              // racunanje povrsine trougla
		double povrsina = Math.sqrt(s*(s - str1)*(s - str2)*(s - str3));
				
		return povrsina;                              // vracanje vrijednosti povrsine trougla
		
	}
	/** Metoda koja racuna rastojanje izmedju stranica za unesene tacke stranice */
	public static double getDistance(double x1, double y1, double x2, double y2) {
		
		double a = x2 - x1;
		double b = y2 - y1;
		double ab = Math.pow(a, 2) + Math.pow(b, 2);
		
		double rez = Math.sqrt(ab);  // formula za izracunavanje duzine stranice za unesene tacke stranice
		
		return rez;                  // vraca vrijednost duzine stranice
	}

}
