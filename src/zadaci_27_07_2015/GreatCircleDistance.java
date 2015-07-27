package zadaci_27_07_2015;

import java.util.Scanner;

public class GreatCircleDistance {

	public static void main(String[] args) {
		/*
		 Great circle distance predstavlja udaljenost izmeðu dvije taèke na površine sfere.
		 Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu dvije taèke.
		 Great circle distance izmeðu ove dvije taèke može biti izraèunata koristeæi se sljedeæom formulom:
		 d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)).
		 Napisati program koji pita korisnika da unese geografsku širinu i dužinu
		 u stepenima dvije taèke na površini zemlje te mu ispisuje great circle distance.
		 Prosjeèni radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti
		 u radianse koristeæi se Math.toRadians metodom jer Java trigonometrijske metode koriste radianse.
		 Širina i dužina u ovoj formuli se odnose na zapad i sjever.
		 Koristimo negativne vrijednosti da oznaèimo istok i jug.
		 */
		
		Scanner input = new Scanner(System.in);
		
		double radiusZemlje = 6371.01;              // prosjecni radius zemlje
		
		System.out.print("Unesite geografsku sirinu (x1 i y1): ");
		
		double x1 = input.nextDouble();             // unos geografske sirine
		double y1 = input.nextDouble();
		
		System.out.print("Unesite geografsku duzinu (x2 i y2): ");
		
		double x2 = input.nextDouble();             // unos geografske duzine
		double y2 = input.nextDouble();
		
		// formula za izracunavanje i ispis great circle distance unosom geografske sirine i duzine
		double greatCircleDistance = radiusZemlje*(Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))
				*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1 - y2))));
		
		System.out.println("Great circle distance: " + greatCircleDistance);  // ispis gcd u konzolu
		
		input.close();
	}
	
}
