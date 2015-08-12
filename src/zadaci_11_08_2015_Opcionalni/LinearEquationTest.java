package zadaci_11_08_2015_Opcionalni;

import java.util.Scanner;

public class LinearEquationTest {

	public static void main(String[] args) {
		/*
		 Write a test program that prompts the user to enter
		 a, b, c, d, e, and f and displays the result.
		 If ad - bc is 0, report that “The equation has no solution.”
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite sest brojeva za linearnu jednacinu: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();                                    // unos brojeva
		
		LinearEquation jednacina = new LinearEquation(a, b, c, d, e, f);  // kreiranje objekta LE
		
		if(jednacina.isSolvable()) {                                      // ako jednacina ima rjesenja 
			System.out.println("Rjesenja linearne jednacine su: " + jednacina.getX() + " i " + jednacina.getY()); // ispis rjesenja
		} else {                                                          // a ako nema
			System.out.println("Jednacina nema rjesenja.");               // ispis u konzolu
		}
		
		input.close();	
	}
}
/** Klasa LinearEquation */
class LinearEquation {
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	/** Konstruktor sa parametrima */
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	/** Geteri i seteri */
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	/** Metoda koja provjerava da li jednacina ima rjesenja */
	public boolean isSolvable() {
		
		double abcd = a*d - b*c;       
		boolean isOk = true;
		
		if(abcd != 0) {         // jednacina ima rjesenje ako je uslov ispunjen
			isOk = true;        // vraca true
		} else {                // a ako uslov nije ispunjen, nema rjesenja
			isOk = false;       // vraca false
		}
		
		return isOk;            // vraca true ili false
		
	}
	/** Metoda koja vraca vrijednost x */
	public double getX(){
		
		double x = (e*d - b*f) / (a*d - b*c); // dobijamo x po formuli
		
		return x;                             // vraca vrijednost x
		
	}
	/** Metoda koja vraca vrijednost y */
	public double getY(){
		
		double y = (a*f - e*c) / (a*d - b*c); // dobijamo y po formuli
		
		return y;                             // vraca vrijednost y
		
	}

}
				