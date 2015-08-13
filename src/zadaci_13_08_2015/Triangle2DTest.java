package zadaci_13_08_2015;

public class Triangle2DTest {

	public static void main(String[] args) {
		/*
		 Define the Triangle2D class that contains:
		 Three points named p1, p2, and p3 of the type MyPoint with getter and setter methods.
		 A no-arg constructor that creates a default triangle with the points (0, 0), (1, 1), and (2, 5).
		 A constructor that creates a triangle with the specified points.
		 A method getArea() that returns the area of the triangle.
		 A method getPerimeter() that returns the perimeter of the triangle.
		 A method contains(MyPoint p) that returns true if the specified point p is inside this triangle.
		 A method contains(Triangle2D t) that returns true if the specified triangle is inside this triangle.
		 A method overlaps(Triangle2D t) that returns true if the specified triangle overlaps with this triangle.
		 
		 Write a test program that creates a Triangle2D objects t1 using the constructor
		 new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5)),
		 displays its area and perimeter, and displays the result of t1.contains(3, 3),
		 r1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4)))
		 and t1. overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), MyPoint(2, 6.5))). 
		 */
		boolean isTrue;
		
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5)); // kreiranje objekta T2D
		t1.getArea();
		t1.getPerimeter();
		
		isTrue = t1.contains(new MyPoint(3, 3));
		
		isTrue = t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4)));
		
		if(isTrue = true) {                                             // ako se uslov ispuni
			System.out.println("Unesene tacke se nalaze u trouglu.");   // ispis u konzolu
		} else {                                                        // a ako ne
			System.out.println("Unesene tacke se ne nalaze u trouglu.");// ispis u konzolu
		}
		
	}
}
/** Klasa Triangle2D */
class Triangle2D {
	
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	/** Geteri i seteri za p1, p2 i p3 */
	public MyPoint getP1(){
		return p1;
	}
	public MyPoint getP2(){
		return p2;
	}
	public MyPoint getP3(){
		return p3;
	}
	public void setP1(MyPoint p1){	        
		this.p1 = p1;	   
	}
	public void setP2(MyPoint p2){	        
		this.p2 = p2;	   
	}
	public void setP3(MyPoint p3){	        
		this.p3 = p3;	   
	}
	/** Konstruktor sa default vrijednostima */
	Triangle2D() {
		p1 = new MyPoint(0, 0);
		p2 = new MyPoint(1, 1);
		p3 = new MyPoint(2, 5);
	}	
	/** Konstruktor sa parametrima x1,...,y3 */
	Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
		p1 = new MyPoint(x1, y1);
		p2 = new MyPoint(x2, y2);
		p3 = new MyPoint(x3, y3);         
	}
	/** Konstruktor sa objektima p1, p2, p3 */
	Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	/** Metoda koja vraca povrsinu trougla */
	public double getArea(){
		
		double str1 = p1.distance(p2);      // pozivanje metode za izracunavanje duzine 3 stranice trougla
		double str2 = p2.distance(p3);
		double str3 = p3.distance(p1);
		
		double s = (str1 + str2 + str3) / 2; // racunanje poluobima
		                                     // racunanje povrsine trougla
		double povrsina = Math.sqrt(s*(s - str1)*(s - str2)*(s - str3));
		
		System.out.println("Povrsina je: " + povrsina);
		return povrsina;                     // vracanje vrijednosti povrsine trougla
	}
	/** Metoda koja vraca obim trougla */
	public double getPerimeter(){
		
		double str1 = p1.distance(p2);      // pozivanje metode za izracunavanje duzine 3 stranice trougla
		double str2 = p2.distance(p3);
		double str3 = p3.distance(p1);
		
		double obim = str1 + str2 + str3;   // racunanje obima trougla
		
		System.out.println("Obim je: " + obim);
		return obim;                        // vracanje vrijednosti obima trougla
	}
	
	/** Metoda koja provjerava da li se za unesene tacke
	 * trougla one nalaze u trouglu (objektu) ili ne */
	public boolean contains(MyPoint p){
		 
		double str1, str2, str3;
		double s;
		double a1, a2, a3;
		
		/** Racunanje povrsine tri trougla za unesene tacke p */
		str1 = p1.distance(p);
		str2 = p1.distance(p2);
		str3 = p2.distance(p);
		s = (str1 + str2 + str3) / 2;
		a1 = Math.sqrt(s*(s - str1)*(s - str2)*(s - str3)); // povrsina prvog trougla za unesenu stranicu (tacke)
		
		str1 = p2.distance(p);
		str2 = p2.distance(p3);
		str3 = p3.distance(p);
		s = (str1 + str2 + str3) / 2;
		a2 = Math.sqrt(s*(s - str1)*(s - str2)*(s - str3)); // povrsina drugog trougla za unesenu stranicu (tacke)
		
		str1 = p1.distance(p);
		str2 = p1.distance(p3);
		str3 = p3.distance(p);
		s = (str1 + str2 + str3) / 2;
		a3 = Math.sqrt(s*(s - str1)*(s - str2)*(s - str3)); // povrsina treceg trougla za unesenu stranicu (tacke)
		
		str1 = p1.distance(p2);
		str2 = p2.distance(p3);
		str3 = p3.distance(p1);
		s = (str1 + str2 + str3) / 2;
		double povrsina = Math.sqrt(s*(s - str1)*(s - str2)*(s - str3)); // povrsina originalnog trougla
		
		/** Ako je po formuli povrsina tri trougla za unesene
		 * tacke manje ili jednaka povrsini originalnog trougla */
		if((a1 + a2 + a3) <= povrsina) {
			return true;                                              // vraca true
		} else {                                                      // a ako se ne nalaze
			return false;                                             // vraca false
		}
	}
	
	/** Metoda koja provjerava da li se uneseni
	 * trougao nalazi u originalnom trouglu */
	public boolean contains(Triangle2D t){
		                  // ako se nalazi
		if((contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3()))) {
			System.out.println("Uneseni trougao se nalazi u drugom trouglu.");
			return true;  // ispis u konzolu, vraca true
		} else {
			System.out.println("Uneseni trougao se ne nalazi u drugom trouglu.");
			return false; // ispis u konzolu, vraca false
		}
	}
}
/** Klasa MyPoint */
class MyPoint {

	private double x = 0;
	private double y = 0;
	
	/** Geteri */
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	/** Konstruktor default, x=0, y=0 */ 
	MyPoint() {
		x = 0;
		y = 0;
	}
	/** Konstruktor sa parametrima x, y */
	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/** Metoda za racunanje rastojanja izmedju dvije tacke */
	public double distance(MyPoint p1) {
		double x = Math.pow(p1.x - this.x, 2); 
		double y = Math.pow(p1.y - this.y, 2);
		double suma =  x + y;
		return Math.sqrt(suma);  // vracanje vrijednosti rastojanja izmedju tacaka po formuli
	}
}