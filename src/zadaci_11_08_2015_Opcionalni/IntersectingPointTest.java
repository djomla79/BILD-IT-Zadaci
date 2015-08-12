package zadaci_11_08_2015_Opcionalni;

import java.util.Scanner;

public class IntersectingPointTest {

	public static void main(String[] args) {
		/*
		 Suppose two line segments intersect. The two endpoints
		 for the first line segment are (x1, y1) and (x2, y2) and for the second line
		 segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
		 these four endpoints and displays the intersecting point.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite 8 brojeva, tacke presjeka za dvije linije: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();                                              // unos brojeva
		
		IntersectingPoint xy = new IntersectingPoint(x1, y1, x2, y2, x3, y3, x4, y4);// kreiranje objekta IP
		
		double[] tacke = xy.getIntersectingPoint();                                  // pozivanje metode

		if (tacke == null) {                                                         // ako su linije paralelne, LE nema rjesenja
			System.out.println("Linije su paralelne.");                              // ispis u konzolu
		} else {                                                                     // ako linije nisu paralelne, LE ima rjesenje
			System.out.print("Za unesene tacke, linije se sijeku u tackama: " + tacke[0] + " i "+ tacke[1]);// ispis u konzolu
		}
		
		input.close();
	}
}
/** Klasa IntersectingPoint */
class IntersectingPoint {
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	private double x4;
	private double y4;

	/** Konstruktor sa parametrima */
	IntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
}
/** Metoda koja prima matricu sa tackama dvije linije
 * izracunava matricu i tacke za unesene tacke
 * i vraca tacke presjeka za dobijenu matricu i tacke */
public double[] getIntersectingPoint() {
	
	double[][]a = new double[2][2];
	double[] b = new double[2];
	
	a[0][0] = y1 - y2;                    // dobijanje prvog elementa matrice po formuli
	
	a[0][1] = x1 - x2;                    // dobijanje drugog el matrice
	if(a[0][1] != 0) {                    // ako je dobijeni el matrice razlicit od 0
		a[0][1] = a[0][1]*-1;             // element dobija negativnu vrijednost
	}
	
	a[1][0] = y3 - y4;                    // dobijanje treceg el matrice
	
	a[1][1] = x3 - x4;                    // dobijanje cetvrtog el matrice
	if(a[1][1] != 0) {                    // ako je dobijeni el matrice razlicit od 0
		a[1][1] = a[1][1]*-1;             // element dobija negativnu vrijednost
	}

	b[0] = (y1 - y2)*x1 - (x1 - x2)*y1;   // racunanje tacaka po formuli
	b[1] = (y3 - y4)*x3 - (x3 - x4)*y3;
	
	return linearEquation();              // vraca linear equation za izracunatu matricu i tacke
}
/** Metoda koja prima matricu i niz elem. i vraca niz sa izracunatim vrijednostima */
public double[] linearEquation() {
	
	double[][] a = new double[2][2];
	double[] b = new double[2];
	
	if(a[0][0]*a[1][1] - a[0][1]*a[1][0] == 0) {            // ako je po formuli ispunjen uslov
		System.out.println("Jednacina nema rjesenja.");     // ispis u konzolu
		return null;                                        // vraca null
	}
	
	double x = (b[0]*a[1][1] - b[1]*a[0][1]) / (a[0][0]*a[1][1] - a[0][1]*a[1][0]); // racunanje x po formuli
	double y = (b[1]*a[0][0] - b[0]*a[1][0]) / (a[0][0]*a[1][1] - a[0][1]*a[1][0]); // racunanje y po formuli
	
	double[] xy = {x, y};                                   // ubacivanje dobijenih vrijednosti u niz
	return xy;                                              // vracanje vrijednosti niza
	
}
}
