package zadaci_11_08_2015_Opcionalni;

import java.util.Scanner;

public class QuadraticEquationTest {

	public static void main(String[] args) {
		/*
		 Design a class named QuadraticEquation for a quadratic equation ax2 + bx + x = 0.
		 Write a test program that prompts the user to enter values
		 for a, b, and c and displays the result based on the discriminant.
		 If the discriminant is positive, display the two roots.
		 If the discriminant is 0, display the one root. Otherwise, display “The equation has no roots.”
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite tri broja za kvadratnu jednacinu: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();                                  // unos brojeva
		
		QuadraticEquation kvadratna = new QuadraticEquation(a, b, c);   // kreiranje objekta QuadraticEquation
		
		if (kvadratna.getDiscriminant() < 0) {                          // ako je diskriminta kj manja od nule
			System.out.println("Jednacina nema rjesenja.");             // ispis u konzolu
		} else if (kvadratna.getDiscriminant() == 0) {                  // ako je jednaka nuli
			System.out.println("Rjesenje jednacine je: " + kvadratna.getRoot1() + "."); // ispis prvog rjesenja u konzolu
		} else {                                                        // ako je veca od nule, ispis oba rjesenja u konzolu
			System.out.println("Prvo rjesenje jednacine je: " + kvadratna.getRoot1() + "\nDrugo rjesenje jednacine je: " + kvadratna.getRoot2());
		}
		
		input.close();
	}
}
/** Klasa kvadratne jednacine */
class QuadraticEquation {
	
	private double a;
	private double b;
	private double c;

	/** Konstruktor sa tri parametra */
	QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	/** Metoda koja vraca discriminantu */
	public double getDiscriminant() {
		
		double discriminant = Math.pow(b, 2) - 4*a*c; // formula diskriminante kjednacine
	
		return discriminant;                          // vraca diskriminantu kj
	}
	/** Metoda koja vraca prvo rjesenje kvadratne jendacine */
	public double getRoot1() {
		
		double root1 = (-b + Math.sqrt(getDiscriminant())) / (2*a); // po formuli prvo rjesenje kjednacine
		
		return root1;                                               // vraca vrijednost prvog rjesenja kj
		
	}
	/** Metoda koja vraca drugo rjesenje kvadratne jednacine */
	public double getRoot2() {
		
		double root2 = (-b - Math.sqrt(getDiscriminant())) / (2*a); // po formuli drugo rjesenje kjednacine
		
		return root2;                                               // vraca vrijednost drugog rjesenja kj
	}

}
