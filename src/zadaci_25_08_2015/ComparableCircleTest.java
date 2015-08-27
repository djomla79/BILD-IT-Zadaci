package zadaci_25_08_2015;

public class ComparableCircleTest {

	public static void main(String[] args) {
		/*
		 Define a class named ComparableCircle that extends Circle and implements Comparable.
		 Draw the UML diagram and implement the compareTo method to compare the circles on the basis of area.
		 Write a test class to find the larger of two instances of ComparableCircle objects.
		 */
		
		/* Kreiranje objekata (krugova) sa parametrima */
		ComparableCircle c1 = new ComparableCircle(3);
		ComparableCircle c2 = new ComparableCircle(5);
		
		/* Pozivanje metode za uporedjivanje dva objekta (kruga) i ispis veceg */
		ComparableCircle circleTo = ComparableCircle.compare(c1, c2);
		
		System.out.println("Povrsina veceg od dva kruga je: " + circleTo.getArea());
		
	}
}
/** Klasa Circle */
class Circle {
	
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
/** Klasa ComparableCircle koja extenda Circle i implement*/
class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
	
	/** Konstruktor CC sa parametrom radius */
	ComparableCircle(double radius) {
		
		super(radius);
	}
	/** Overrajdana copareTo metoda
	 * koja poredi povrsine dva kruga */
	@Override
	public int compareTo(ComparableCircle o) {

		if (getArea() > o.getArea()) {
			return 1;
		} else if(getArea() < o.getArea()) {
			return -1;
		} else
			return 0;
		
	}
	/** Metoda koja poredi dva objekta i vraca povrsinu veceg objekta (kruga) */
	public static ComparableCircle compare(ComparableCircle c1, ComparableCircle c2) {
		
		if(c1.compareTo(c2) > 0) {
			return c1;
		} else {
			return c2;
		}
		
	}
}