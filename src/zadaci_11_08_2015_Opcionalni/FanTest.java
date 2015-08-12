package zadaci_11_08_2015_Opcionalni;

public class FanTest {

	public static void main(String[] args) {
		
		Fan fan1 = new Fan();     // kreiranje objekta fan
		fan1.setColor("yellow");  // postavljanje vrijednosti boje
		fan1.setSpeed(3);         // brzine
		fan1.setRadius(10);       // radiusa
		fan1.setOn(true);         // i da li je ventilator ukljucen
		System.out.println("Fan is on, its speed, color and radius are: " + fan1.toString()); // pozivanje metode i ispis u konzolu
		
		Fan fan2 = new Fan();     // kreiranje drugog objekta fan
		System.out.println("Fan's color and radius are: " + fan2.toString()); // pozivanje metode i ispis u konzolu (default vrijednosti konstr.)

	}

}
/** Klasa Fan */
class Fan {
	
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	/** Konstruktor sa default vrijednostima */
	Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	/** Geteri i seteri */
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	/** Metod koji vraca string sa opisom
	 * rada ventilatora za unesene vrijedosti */
	public String toString() {
		
		if (on) {
		return "" + speed + ", " + color + ", " + radius;
		} else {
			return "" + color + ", " + radius + ", " + " fan is off";
		}
	}
}

