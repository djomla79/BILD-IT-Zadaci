package zadaci_13_08_2015;

public class Circle2DTest {

	public static void main(String[] args) {
		/*
		 Define the Circle2D class that contains:
		 Two double data fields named x and y that specify the center of the circle
		 with getter methods. A data field radius with a getter method.
		 A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius.
		 A constructor that creates a circle with the specified x, y, and radius.
		 A method getArea() that returns the area of the circle.
		 A method getPerimeter() that returns the perimeter of the circle.
		 A method contains(double x, double y) that returns true if the specified point (x, y) is inside this circle.
		 A method contains(Circle2D circle) that returns true if the specified circle is inside this circle.
		 A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle.
		 
		 Write a test program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
		 displays its area and perimeter, and displays the result of c1.contains(3, 3),
		 c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new Circle2D(3, 5, 2.3)). 
		 */
		Circle2D c1 = new Circle2D(2, 2, 5.5);          // kreiranje objekta C2D
		                                                // pozivanje metoda za povrsinu i obim kruga i ispis u konzolu
		System.out.println("Povrsina kruga je: " + c1.getArea() + "\nObim kruga je: " + c1.getPerimeter());
		
		 System.out.println(c1.contains(3, 3));         // pozivanje metode, da li se tacka nalazi u krugu
		 System.out.println(c1.contains(new Circle2D(4, 5, 10.5))); // da li se krug nalazi unutar drugog kruga
		 System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));  // da li se krugovi presjecaju
		
	}
}
/** Klasa Circle2D */
class Circle2D {
	
	private double x;
	private double y;
	private double radius;
	
	/** Geteri za x, y i radius */
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	/** Konstrukor default x=0, y=0, radius=1 */
	Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}
	/** Konstruktor sa parametrima x, y i radius */
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	/** Metod koji vraca povrsinu kruga */
	public double getArea() {
		return Math.pow(radius, 2)*Math.PI;
	}
	/** Metod koji vraca obim kruga */
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	/** Metoda koja vraca da li se tacka nalazi u krugu */
	public boolean contains(double x, double y) {
		
		double suma = Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2);
		double dis = Math.sqrt(suma);
		
		if (Math.sqrt(radius) >= dis) {
			System.out.println("Tacka se nalazi u krugu.");
			return true;
		} else {
			System.out.println("Tacka se ne nalazi u krugu.");
			return false;
		}
	}
	/** Metoda koja vraca da li se novi krug nalazi u krugu */
	public boolean contains(Circle2D circle) {
		
		double suma = Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2);
		double dis = Math.sqrt(suma);
		double rad1 = Math.abs(Math.sqrt(radius) - Math.sqrt(circle.radius));
		
		if (rad1 >= dis) {
			System.out.println("Krug se nalazi unutar drugog kruga.");
			return true;
		} else {
			System.out.println("Krug se ne nalazi unutar drugog kruga.");
			return false;
		}
	}
	/** Metoda koja vraca da li je */
	public boolean overlaps(Circle2D circle) {
		
		double suma = Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2);
		double dis = Math.sqrt(suma);
		double rad1 = Math.abs(Math.sqrt(radius) - Math.sqrt(circle.radius));
		double rad2 = Math.abs(Math.sqrt(radius) + Math.sqrt(circle.radius));
		
		if (rad1 < dis && dis < rad2) {
			System.out.println("Krugovi se presjecaju.");
			return true;
		} else {
			System.out.println("Krugovi nemaju dodirnih tacaka.");
			return false;
		}
	}
	
}
