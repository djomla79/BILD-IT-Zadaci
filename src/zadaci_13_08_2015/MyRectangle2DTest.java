package zadaci_13_08_2015;

public class MyRectangle2DTest {

	public static void main(String[] args) {
		/*
		 Define the MyRectangle2D class that contains:
		 Two double data fields named x and y that specify the center of the rectangle
		 with getter and setter methods. (Assume that the rectangle sides are parallel to x- or y- axes.)
		 The data fields width and height with getter and setter methods.
		 A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and 1 for both width and height.
		 A constructor that creates a rectangle with the specified x, y, width, and height.
		 A method getArea() that returns the area of the rectangle.
		 A method getPerimeter() that returns the perimeter of the rectangle.
		 A method contains(double x, double y) that returns true if the specified point (x, y) is inside this rectangle.
		 A method contains(MyRectangle2D r) that returns true if the specified rectangle is inside this rectangle.
		 A method overlaps(MyRectangle2D r) that returns true if the specified rectangle overlaps with this rectangle.
		 Write a test program that creates a MyRectangle2D object r1 (new MyRectangle2D(2, 2, 5.5, 4.9)),
		 displays its area and perimeter, and displays the result of r1.contains(3, 3),
		 r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)), and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
		 */
		 MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);  // kreiranje objekta MR2D
		 r1.getArea();                                          // pozivanje metode za ispis povrsine
		 r1.getPerimeter();                                     // pozivanje metode za ispis obima
		 r1.contains(3, 3);                                     // poz. metode, da li se tacke nalaze u p-ugaoniku
		 r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2));       // poz. metode, da li se uneseni p nalazi u originalnom p
		 r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4));        // poz. metode, da li se uneseni i originalni p presjecaju
	}
}
/** Klasa MyRectangle2D */
class MyRectangle2D {
	
	private double x;
    private double y;
    private double height;
    private double width;
    
    /** Geteri i seteri za x, y, height, width */
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    /** Konstruktor po default vrijednostima */
    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.height = 1;
        this.width = 1;
    }
    /** Konstruktor sa parametrima x, y, width i height */
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    /** Metoda koja vraca povrsinu pravougaonika */
    public double getArea() {
    	double povrsina = width*height;
    	System.out.println("Povrsina pravougaonika je: " + povrsina);
        return povrsina;
    }
    /** Metoda koja vraca obim pravougaonika */
    public double getPerimeter() {
    	double obim = 2*(width + height);
    	System.out.println("Obim pravougaonika je: " + obim);
        return obim;
    }
    /** Metoda koja provjerava da li se
     * unesene tacke nalaze u originalnom p-ugaoniku */
    public boolean contains(double x, double y) {
    	if((Math.abs(2*(x-this.x)) > height || Math.abs(2*(y - this.y)) > width)) {
    		System.out.println("Unesene tacke se nalaze u pravougaoniku.");
    		return true;
    	} else {
    		System.out.println("Unesene tacke se ne nalaze u pravougaoniku.");
    		return false;
    	}
    }
    /** Metoda koja provjerava da li se uneseni
     * p-ugaonik nalazi u originalnom p-ugaoniku */
    public boolean contains(MyRectangle2D r) {
    	if((Math.abs(2*(r.getX()-this.x)) > height || Math.abs(2*(r.getY() - this.y)) > width)) {
    		System.out.println("Uneseni pravougaonik se nalazi u originalnom pravougaoniku.");
    		return true;
    	} else {
    		System.out.println("Uneseni pravougaonik se ne nalazi u originalnom pravougaoniku.");
    		return false;
    	}
    }
    /** Metoda koja provjerava da li se uneseni
     * i originalni p-ugaonik presijecaju */
    public boolean overlaps(MyRectangle2D r) {
    	if((Math.abs(2*(r.getX()-this.x)) >= height || Math.abs(2*(r.getY() - this.y)) >= width)) {
    		System.out.println("Uneseni pravougaonik se presjeca sa originalnim pravougaonikom.");
    		return true;
    	} else {
    		System.out.println("Uneseni pravougaonik se ne presjeca sa originalnim pravougaonikom.");
    		return false;
    	}
    }
}
