package zadaci_26_08_2015;

public class ComparableCircleTest2 {

	public static void main(String[] args) {
		/*
		 Rewrite the Circle class in Listing 13.2 to extend GeometricObject and implement the Comparable interface.
		 Override the equals method in the Object class. Two Circle objects are equal if their radius are the same.
		 Draw the UML diagram that involves Circle, GeometricObject, and Comparable.
		 */
		/* kreiranje objekata (krugova) sa unesenim parametrima */
		GeometricObject c1 = new Circle(5.0);
		GeometricObject c2 = new Circle(7.0);
		GeometricObject c3 = new Circle(3.0);
		GeometricObject c4 = new Circle(3.0);
		
		/* Pozivanje metode za poredjenje dva kruga i ispis povrsine veceg */
		System.out.println("Povrsina prvog kruga je: " + c1.getArea());
		System.out.println("Povrsina drugog kruga je: " + c2.getArea());
		GeometricObject circleTo = GeometricObject.compare(c1, c2);
		System.out.println("Povrsina veceg kruga je: " + circleTo.getArea() + "\n");
		
		/* Pozivanje overrajdane compareTo metode za poredjenje dva kruga */
		System.out.println("Povrsina treceg kruga je: " + c3.getArea());
		System.out.println("Povrsina cetvrtog kruga je: " + c4.getArea());
		if(c3.compareTo(c4) == 0) {
			System.out.println("Krugovi su jednaki.");
		} else if(c3.compareTo(c4) > 0) {
			System.out.println("Povrsina veceg kruga je: " + c3.getArea());			
		} else {
			System.out.println("Povrsina veceg kruga je: " + c4.getArea());
		}
		
	}
}
/** Klasa Circle koja extenda GO */
class Circle extends GeometricObject {
	
	double radius;
	/** Prazan konstruktor */
	Circle() {
	};
	/** Konstruktor sa parametrom radius */
	Circle(double radius) {
		
		this.radius = radius;
	}
	/** Metoda koja vraca povrsinu kruga */
	public double getArea() {
		
		return radius*radius*Math.PI;
	}
	/** Overrajdana toString metoda */
	@Override
	public String toString() {
		
		return "Povrsina kruga (radius: " + radius + ") je " + getArea();
	}
}
/** Abstraktna klasa GeometricObject koja implementira Comparable */
abstract class GeometricObject implements Comparable<GeometricObject> {
	
	/** Prazan konstruktor */
	protected GeometricObject() {
	}
	/** Abstraktna metoda za povrsinu objekta */
	public abstract double getArea();
	
	/** Interfejs Comparable */
	public interface Comparable {
		
		public int compareTo(GeometricObject o);
	}
	/** Metoda koja poredi dva objekta i vraca veci */
	public static GeometricObject compare(GeometricObject o1, GeometricObject o2) {
		
		if(o1.compareTo(o2) > 0 ) {
			return o1;
		} else {
			return o2;
		}
	}
	/** Overrajdana metoda za poredjenje dva objekta */
	@Override
	public int compareTo(GeometricObject o) {
		
		if(this.getArea() > o.getArea()) {
			return 1;
		} else if (this.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
}
