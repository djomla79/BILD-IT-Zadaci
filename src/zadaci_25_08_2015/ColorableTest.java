package zadaci_25_08_2015;

public class ColorableTest {

	public static void main(String[] args) {
		/*
		 Design an interface named Colorable with a void method named howToColor().
		 Every class of a colorable object must implement the Colorable interface.
		 Design a class named Square that extends GeometricObject and implements Colorable.
		 Implement howToColor to display the message Color all four sides.
		 Draw a UML diagram that involves Colorable, Square, and GeometricObject.
		 Write a test program that creates an array of five GeometricObjects.
		 For each object in the array, display its area and invoke its howToColor method if it is colorable.
		 */
		
		/** Kreiranje niza objekata GeometricObject */
		GeometricObject[] o = new GeometricObject[5];
		
		/** unos objekata u niz */
		o[0] = new CircleObject(5);
		o[1] = new Square(9);
		o[2] = new RectangleObject(7, 11);
		o[3] = new CircleObject(3);
		o[4] = new RectangleObject(10, 11);
		
		GeometricObject obj;
		
		for(int i=0; i<o.length; i++) {
			
			obj = o[i];                          // objekat obj postaje objekat iz niza
			System.out.println("Objekat: " + (i+1));          // ispis broja el. (objekta) niza
			System.out.println("Povrsina: " + obj.getArea()); // ispis povrsine objekta niza
			
			if(obj instanceof Colorable) {       // ako je obj istanca interfejsa Colorable
				
				Colorable col = (Colorable)obj;  // kreiranje objekta Colorable
			    col.howToColor();                // i pozivanje metode howToColor
			} else {                             // a ako nije
				                                 // ispis poruke u konzolu
				System.out.println("Objekat ne moze biti obojen.");
			}
			System.out.println();
		}
	}

}
/** Interfejs Colorable */
interface Colorable {

	/** Abstraktni metod howToColor */
	public void howToColor();	
}

/** Klasa CircleObject koja extenda GO i implementira Colorable */
class CircleObject extends GeometricObject implements Colorable {
	
	double radius;
	
	/** Konstruktor sa parametrom radius */
	CircleObject(double radius) {
		
		this.radius = radius;
	}
	/** Geter i seter za radius */
	public double getRadius() {
		
		return radius;
	}
	public void setRadius(double radius) {
		
		if(this.radius >= 0) {
			this.radius = radius;
		}
	}
	/** Metoda koja vraca povrsinu kruga */
	public double getArea() {
		
		return radius*radius*Math.PI;
	}
	/** Metoda koja vraca obim kruga */
	public double getPerimeter() {
		
		return 2*radius*Math.PI;
	}
	/** Overrajdana howToColor metoda  */
	@Override
	public void howToColor() {
		
		System.out.println("Oboji krug");
	}
}
/** Klasa RectangleO koja extenda GO i implementira Colorable */
class RectangleObject extends GeometricObject implements Colorable {

	private double width;
	private double height;
	
	/** Konstruktor sa parametrima width i height */
	RectangleObject(double width, double height) {
		
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
 
	/** Overrajdana howToColor metoda */
	@Override
	public void howToColor() {
		
		System.out.println("Oboji sve strane pravougaonika.");
	}
}
/** Klasa Square koja extenda GO i implementira Colorable */
class Square extends GeometricObject implements Colorable {
	
	double side;
	
	/** Konstruktor sa parametrom side */
	Square(double side) {
		
		this.side = side;
	}
	/** Metoda koja vraca povrsinu kvadrata */
	public double getArea() {
		
		return side*side;
	}
	/** Metoda koja vraca obim kvadrata */
	public double getPerimeter() {
		
		return side*4;
	}
	/** Overrajdana howToColor metoda */
	@Override
	public void howToColor() {
		
		System.out.println("Oboji sve strane kvadrata.");
	}
}
