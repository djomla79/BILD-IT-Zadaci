package zadaci_26_08_2015;

public class ComparableRectangleTest {

	public static void main(String[] args) {
		/*
		 Rewrite the Rectangle class in Listing 13.3 to extend GeometricObject and implement the Comparable interface.
		 Override the equals method in the Object class. Two Rectangle objects are equal if their areas are the same.
		 Draw the UML diagram that involves Rectangle, GeometricObject, and Comparable.
		 */
		
		/* Kreiranje objekata (pravougaonika) sa unesenim parametrima */
		GeometricObject r1 = new Rectangle(3.0, 5.0);
		GeometricObject r2 = new Rectangle(7.0, 9.0);
		GeometricObject r3 = new Rectangle(10.0, 10.0);
		GeometricObject r4 = new Rectangle(10.0, 10.0);
		
		/* Pozivanje metode za poredjenje dva pravougaonika i ispis povrsine veceg */
		GeometricObject rectangleTo = GeometricObject.compare(r1, r2);
		
		System.out.println("Povrsina prvog pravougaonika je: " + r1.getArea());
		System.out.println("Povrsina drugog pravougaonika je: " + r2.getArea());
		
		System.out.println("Povrsina veceg pravougaonika je: " + rectangleTo.getArea() + "\n");
		
		/* Pozivanje overrajdane compareTo metode za poredjenje dva pravougaonika */
		System.out.println("Povrsina treceg pravougaonika je: " + r3.getArea());
		System.out.println("Povrsina cetvrtog pravougaonika je: " + r4.getArea());
		if(r3.compareTo(r4) == 0) {
			System.out.println("Pravougaonici su jednaki.");
		} else if(r3.compareTo(r4) > 0) {
			System.out.println("Povrsina veceg pravougaonika je: " + r3.getArea());			
		} else {
			System.out.println("Povrsina veceg pravougaonika je: " + r4.getArea());
		}
		
	}
}
/** Klasa Rectangle koja extenda GeometricObject */
class Rectangle extends GeometricObject {

	private double width;
	private double height;
	
	/** Konstruktor sa parametrima width i height */
	Rectangle(double width, double height) {
		
		this.width = width;
		this.height = height;
	}
	/** Metoda koja vraca povrsinu pravougaonika */
	public double getArea() {
		
		return width*height;
	}
	/** Metoda koja vraca obim pravougaonika */
	public double getPerimeter() {
		
		return 2*(width + height);
	}
}

