package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Date;

public class ArraylistLoanDateCircle {

	public static void main(String[] args) {
		/*
		 (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
         object, a Date object, a string, and a Circle object to the list, and use a loop
         to display all the elements in the list by invoking the object’s toString() method.
		 */
		
		Loan loan = new Loan(20.0);    // kreiranje obj Loan
		Date date = new Date();        // kreiranje obj Date
		Circle circle = new Circle(5); // kreiranje obj Circle
		
		String niz = "jestba.'vakoide";  // string niz
		
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(loan);                // ubacivanje objekata u listu
		list.add(date);
		list.add(niz);
		list.add(circle);
		
		for (int i=0; i<list.size(); i++) {
			list.get(i);
		}
		/* Stampanje svih elemenata (objekata) iz niza pozivajuci toString metodu */
		System.out.println("Elementi niza su: " + list.toString());
	}	
	
}
/** Klasa Loan */
class Loan {
	 
	private double loanAmount;
	
	/** prazan konstruktor */
	Loan() {
	}
	/** Konstruktor sa parametrom */
	Loan(double loanAmount) {
	  this.loanAmount = loanAmount;
    }
	/** Geteri i seteri */
	public double getLoanAmount() {
	   return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	/** toString metoda */
	public String toString(){
		return getLoanAmount() + " ";
	}
}
/** Klasa Circle */
class Circle {
	
	private double radius;
	
	/** Konstruktor sa default vrijed. */
	Circle() {
		radius = 1;
	}
	/** Konstruktor sa parametrom */
	Circle(double newRadius) {
		radius = newRadius;
	}
	/** Geteri i seteri */
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		if (radius>=0) {
			radius = newRadius;
		}
    }
	/** toString metoda */
	public String toString(){
		return getRadius() + " ";
	}
}