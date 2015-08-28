package zadaci_26_08_2015;

public class SumOfTheAreasOfGeometricObjects {

	public static void main(String[] args) {
		/*
		 Write a method that sums the areas of all the geometric objects in an array.
		 The method signature is:
		 
		 public static double sumArea(GeometricObject[] a)
		
		Write a test program that creates an array of four objects
		(two circles and two rectangles)
		and computes their total area using the sumArea method. 
		 */
		
		/** Kreiranje niza objekata GeometricObject */
		GeometricObject[] a = new GeometricObject[4];
		
		/** unos objekata u niz, 2 kruga i 2 pravougaonika */
		a[0] = new Circle(3);
		a[1] = new Circle(5);
		a[2] = new Rectangle(7, 9);
		a[3] = new Rectangle(3, 5);
		
		System.out.println("Povrsine unesenih objekata: " + a[0].getArea() + ", " + a[1].getArea() + ", " + a[2].getArea() + ", " + a[3].getArea() + "\n");
		
		sumArea(a);                     // pozivanje metode za ispis ukupne sume svih objekata iz niza
		
	}
	/** Metoda koja vraca sumu svih objekata niza GO */
	public static double sumArea(GeometricObject[] a) {
		
		double suma = 0;
		GeometricObject obj;
		
		for(int i=0; i<a.length; i++) { // za sve elemente niza
			 obj = a[i];                // obj postaje objekat iz niza
			 suma += obj.getArea();     // sumiranje svih povrsina objekata iz niza
		}
		                                // ispis ukupne sume povrsina u konzolu
		System.out.println("Ukupna suma svih povrsina objekata iz niza je: " + suma);
		return suma;
	}
}
