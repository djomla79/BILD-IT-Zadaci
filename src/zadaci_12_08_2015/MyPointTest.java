package zadaci_12_08_2015;

import java.util.Scanner;

public class MyPointTest {

	public static void main(String[] args) {
		/*
		 Design a class named MyPoint to represent a point with
		 x- and y-coordinates. The class contains:
		 The data fields x and y that represent the coordinates with getter methods.
		 A no-arg constructor that creates a point (0, 0).
		 A constructor that constructs a point with specified coordinates.
		 A method named distance that returns the distance from this point
		 to a specified point of the MyPoint type.
		 A method named distance that returns the distance from this point to
		 another point with specified x- and y-coordinates.
		 Write a test program that creates the two points (0, 0) and (10, 30.5)
		 and displays the distance between them.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite 2 broja (10 i 30.5): ");
		
		double broj1 = input.nextDouble();                
		double broj2 = input.nextDouble();          // unos brojeva
		
		MyPoint p1 = new MyPoint();                 // kreiramo objekat MP (default vrijednosti)

		MyPoint p2 = new MyPoint(broj1, broj2);     // kreiramo objekat MP (unos parametara)

		System.out.print("Udaljenost izmedju dvije tacke je: " + p1.distance(p2)); // pozivanje metode i ispis
		
		
		input.close();
	}
}
/** Klasa MyPoint */
class MyPoint {

	private double x = 0;
	private double y = 0;
	
	/** Geteri */
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	/** Konstruktor default, x=0, y=0 */ 
	MyPoint() {
		x = 0;
		y = 0;
	}
	/** Konstruktor sa parametrima x, y */
	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/** Metoda za racunanje rastojanja izmedju dvije tacke */
	public double distance(MyPoint p1) {
		double x = Math.pow(p1.x - this.x, 2); 
		double y = Math.pow(p1.y - this.y, 2);
		double suma =  x + y;
		return Math.sqrt(suma);  // vracanje vrijednosti rastojanja izmedju tacaka po formuli
	}
}