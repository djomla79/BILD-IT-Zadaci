package zadaci_26_08_2015;

public class ComparableOctagonTest {

	public static void main(String[] args) {
		/*
		 Write a class named Octagon that extends GeometricObject and implements the Comparable and Cloneable interfaces.
		 Assume that all eight sides of the octagon are of equal length. The area can be computed using the following formula:
		 area = (2 + 4/Math.sqrt(2))* side * side
		 Draw the UML diagram that involves Octagon, GeometricObject, Comparable, and Cloneable.
		 Write a test program that creates an Octagon object with side value 5 and displays its area and perimeter.
		 Create a new object using the clone method and compare the two objects using the compareTo method.
		 */
		Octagon o1 = new Octagon(5);     // kreiramo objekat Oktagon sa unesenim parametrom
		
		System.out.println(o1.toString() + "\n");
		
		Octagon o2 = o1.clone();         // o2 klonira objekat o1
		
		/* Pozivanje compareTo metode za poredjenje dva objekta (oktagona) */
		System.out.println("Povrsina prvog oktagona: " + o1.getArea());
		System.out.println("Povrsina drugog oktagona: " + o2.getArea());
		if (o1.compareTo(o2) == 0) {
			System.out.println("Oktagoni su jednaki.");
		} else if (o1.compareTo(o2) > 0) {
			System.out.println("Povrsina veceg kruga je: " + o1.getArea());
		} else {
			System.out.println("Povrsina veceg kruga je: " + o2.getArea());
		}
		
	}
}
/** Klasa Octagonal extenda GO koji implementira Cloneable */
class Octagon extends GeometricObject implements Cloneable {
	
	protected double side;

	/** Prazan konstruktor */
	Octagon() {
	}
	/** Konstruktor sa parametrom side */
	Octagon(double side) {
		this.side = side;
	}
	/** Geter i seter za parametar side */
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	/** Metoda koja vraca povrsinu oktagona */
	public double getArea() {
		
		return (2 +(4/Math.sqrt(2)))*side*side;
	}
	/** Metoda koja vraca obim oktagona */
	public double getPerimeter() {
		return side*8;
	}
	/** Overrajdana clone metoda */
	@Override
	public Octagon clone() {
		
		Octagon o = new Octagon();
		
		o.side = getSide();
		
		return o;
	}
	/** Overrajdana toString metoda */
	@Override
	public String toString() {
		
		return "Povrsina oktagona: " + getArea() + "\nObim oktagona: " + getPerimeter();
	}
}