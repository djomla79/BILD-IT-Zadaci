package zadaci_13_08_2015;

import java.util.Scanner;

public class BoundingRenctangle {

	public static void main(String[] args) {
		/*
		 A bounding rectangle is the minimum rectangle that encloses a set of points in a two-dimensional plane.
		 Write a method that returns a bounding rectangle for a set of points in a two-dimensional plane, as follows:
		 
		 public static MyRectangle2D getRectangle(double[][] points)
		 
		 Write a test program that prompts the user to enter five points
		 and displays the bounding rectangle’s center, width, and height.
		 Here is a sample run: Enter five points: 1.0 2.5 3 4 5 6 7 8 9 10
		 The bounding rectangle's center (5.0, 6.25), width 8.0, height 7.5 
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite 10 brojeva za 5 tacaka: ");
		double[][] brojevi = new double[5][2];
	      
	    for(int i = 0; i < brojevi.length; i++) {
	    	for(int j = 0; j < brojevi[i].length; j++) {
	    		brojevi[i][j] = input.nextDouble();          // unos brojeva
	    	}
	    }
	     
	    MyRectangle2 p = getRectangle(brojevi);            // pozivanje metode
	                                                         // ispis centra, sirine i visine p-ugaonika u konzolu
	    System.out.println("\nCentar pravougaonika: (" + p.getX() + ", " + p.getY() + "), sirina: " + p.getWidth() + ", visina: " + p.getHeight());
	     
		input.close();	
	}
	/** Metoda koja prima matricu sa tackama i vraca objekat
	 * pravougaonik sa njegovim centrom, sirinom i visinom */
	public static MyRectangle2 getRectangle(double[][] points) {
    	
    	double strLijevo = points[0][0];            // odredjujemo pocetne vrijednosti matrice
    	double strDesno = points[0][0];
    	double strGore = points[0][1];
    	double strDole = points[0][1];
    	
    	double x, y, width, height;
    	
    	for(int i=0; i<points.length; i++) {        // za sve elemente matrice
    		for(int j=0; j<points[i].length; j++) {
    			if(points[i][0] < strLijevo) {      // ako je bilo koji broj prve kolone manji od pocetnog strLijevo
    				strLijevo = points[i][0];       // taj broj postaje strLijevo (broj za lijevu stranicu p-ugaonika)
    			}
    			if(points[i][0] > strDesno) {       // ako je bilo koji broj prve kolone veci od pocetnog srtDesno
    				strDesno = points[i][0];        // taj broj postaje strDesno (broj za desnu stranicu p-ugaonika)
    			}
    			if(points[i][1] > strGore) {        // ako bilo koji broj druge kolone veci od pocetnog strGore
    				strGore = points[i][1];         // taj broj postaje strGore (broj za gornju stranicu p-ugaonika)
    			}
    			if(points[i][1] < strDole) {        // ako je bilo koji broj druge kolone manji od pocetnog strDole
    				strDole = points[i][1];         // taj broj postaje strDole (broj za donju stranicu p-ugaonika)
    			}
    		}
    	}
    	
    	x = (strLijevo + strDesno) / 2;             // po formuli dobijamo x
    	y = (strGore + strDole) / 2;                // po formuli dobijamo y
    	width = strDesno - strLijevo;               // po formuli dobijamo sirinu
    	height = strGore - strDole;                 // po formuli dobijamo visinu
    	
    	MyRectangle2 r = new MyRectangle2(x, y, width, height); // kreiramo objekat MRectangle sa parametrima x, y, width, height
    	
    	return r;                                               // vracanje vrijednosti za objekat MR za unesene parametre
    }
}
/** Klasa MyRectangle2D */
class MyRectangle2 {
	
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
    public MyRectangle2() {
        this.x = 0;
        this.y = 0;
        this.height = 1;
        this.width = 1;
    }
    /** Konstruktor sa parametrima x, y, width i height */
    public MyRectangle2(double x, double y, double width, double height) {
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
    	/* Po formuli ako je uslov ispunjen, vraca true, ako nije vraca false */
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
    public boolean contains(MyRectangle2 r) {
    	/* Po formuli ako je uslov ispunjen, vraca true, ako nije vraca false */
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
    public boolean overlaps(MyRectangle2 r) {
    	/* Po formuli ako je uslov ispunjen, vraca true, ako nije vraca false */
    	if((Math.abs(2*(r.getX()-this.x)) >= height || Math.abs(2*(r.getY() - this.y)) >= width)) {
    		System.out.println("Uneseni pravougaonik se presjeca sa originalnim pravougaonikom.");
    		return true;
    	} else {
    		System.out.println("Uneseni pravougaonik se ne presjeca sa originalnim pravougaonikom.");
    		return false;
    	}
    }
}
