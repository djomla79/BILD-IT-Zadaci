package zadaci_25_08_2015;

public class GeometricObjectComparableTest {

	/*
	 Modify the GeometricObject class to implement the Comparable interface,
	 and define a static max method in the GeometricObject class for finding
	 the larger of two GeometricObject objects.
	 Draw the UML diagram and implement the new GeometricObject class.
	 Write a test program that uses the max method to find the larger
	 of two circles and the larger of two rectangles.
	 */

	public static void main(String[] args) {
		
		/* kreiranje objekata (krugova) sa parametrima */
		GeometricObject c1 = new CircleFromGeometricObject(3.0);
		GeometricObject c2 = new CircleFromGeometricObject(5.0);
		
		/* Kreiranje objekata (pravougaonika) sa parametrima */
		GeometricObject r1 = new RectangleFromGeometricObject(3.0, 5.0);
		GeometricObject r2 = new RectangleFromGeometricObject(7.0, 9.0);
		
		/* Pozivanje metode za poredjenje dva kruga i ispis povrsine i obima veceg */
		GeometricObject circleTo = GeometricObject.compare(c1, c2);
		
		System.out.println("Povrsina veceg kruga je: " + circleTo.getArea());
		System.out.println("Obim veceg kruga je: " + circleTo.getPerimeter() + "\n");
		
		/* Pozivanje metode za poredjenje dva pravougaonika i ispis povrsine i obima veceg */
		GeometricObject rectangleTo = GeometricObject.compare(r1, r2);
		
		System.out.println("Povrsina veceg pravougaonika je: " + rectangleTo.getArea());
		System.out.println("Obim veceg pravougaonika je: " + rectangleTo.getPerimeter());
		
	}
}
/** Abstraktna klasa GeometricObject */
abstract class GeometricObject implements Comparable<GeometricObject> {
	
	/** Prazan konstruktor */
	protected GeometricObject() {
	}
	/** Abstraktna metoda za povrsinu objekta */
	public abstract double getArea();
	
	/** Abstraktna metoda za obim objekta */
	public abstract double getPerimeter();
	
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
/** Klasa CircleFGO koja extenda GeometricObject */
class CircleFromGeometricObject extends GeometricObject {

	private double radius;
	
	/** Prazan konstruktor */
	CircleFromGeometricObject() {	
	}
	/** Konstruktor sa parametrom radius */
	CircleFromGeometricObject(double radius) {
		
		this.radius = radius;
	}
	/** Metoda koja vraca povrsinu kruga */
	public double getArea() {
		
		return radius*radius*Math.PI;
	}
	/** Metoda koja vraca obim kruga */
	public double getPerimeter() {
		
		return 2*radius*Math.PI;
	}
}
/** Klasa RectangleFGO koja extenda GeometricObject */
class RectangleFromGeometricObject extends GeometricObject {

	private double width;
	private double height;
	
	/** Konstruktor sa parametrima width i height */
	RectangleFromGeometricObject(double width, double height) {
		
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
