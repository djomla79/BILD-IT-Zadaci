package zadaci_17_08_2015;

import java.util.Date;
import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		/*
		 (The Triangle class) Design a class named Triangle that extends
		 GeometricObject. The class contains:
		 Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
		 A no-arg constructor that creates a default triangle.
		 A constructor that creates a triangle with the specified side1, side2, and side3.
		 The accessor methods for all three data fields.
		 A method named getArea() that returns the area of this triangle.
		 A method named getPerimeter() that returns the perimeter of this triangle.
		 A method named toString() that returns a string description for the triangle.
		 For the formula to compute the area of a triangle, see Programming Exercise 2.19.
		 The toString() method is implemented as follows:
		 return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
		 Write a test program that prompts the user to enter three sides of the triangle,
		 a color, and a Boolean value to indicate whether the triangle is filled.
		 The program should create a Triangle object with these sides and set the color and filled properties using the input.
		 The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite tri stranice trougla: ");
		double prva = input.nextDouble();               // unos tri stranice trougla
		double druga = input.nextDouble();
		double treca = input.nextDouble();

		Triangle t1 = new Triangle(prva, druga, treca); // kreiranje obj. Triangle sa parametrima

		System.out.print("Unesite boju (white,...,black): ");
		String boja = input.next();                     // unos boje
		t1.setColor(boja);                              // pozivanje metode za set boje
		
		System.out.print("Da li je trougao ispunjen bojom (true ili false): ");
		boolean filled = input.nextBoolean();           // da li je trougao ispunjen bojom
		t1.setFilled(filled);                           // pozivanje metode za set ispunjen bojom
		System.out.println();
		
		/* ispis stranica, povrsine i obima trougla, da li je ispunjen i koje je boje trougao */
		System.out.println(t1.toString() + "\nPovrsina trougla je: " + t1.getArea());
		System.out.println("Obim trougla je: " + t1.getPerimeter()); 
		System.out.println("Boja trougla je: " + t1.getColor()); 
		System.out.println("Trougao je ispunjen: " + t1.isFilled());

		input.close();
	}
}
/** Klasa Triangle extenda klasu GO */
class Triangle extends GeometricObject {
	
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	/** prazan konstruktor */
	Triangle() {
	}
	/** Konstruktor Triangle sa parametrima side1, side2 i side3 */
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	/** Geteri i seteri */
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	/** Metoda koja vraca obim trougla */
	public double getPerimeter() {
		return side1+side2+side3;
	}
	/** Metoda koja vraca povrsinu trougla */
	public double getArea() {
		double s = getPerimeter()/2;
		double o = s*(s-side1)*(s-side2)*(s-side3);
		return Math.sqrt(o);
	}
	/** toString metoda */
	public String toString() {
		return "Trougao: stranica1 = " + side1 + " stranica2 = " + side2 + " stranica3 = " + side3;
	}
}
/** Klasa GeometricObject */
class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	/** Konstruktor sa parametrom za datum */
	GeometricObject () {
		dateCreated = new Date();
	}
	/** Geteri i seteri */
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
}
