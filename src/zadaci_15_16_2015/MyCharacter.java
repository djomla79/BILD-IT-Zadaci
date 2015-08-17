package zadaci_15_16_2015;

public class MyCharacter {
	
	char c;
	
	/** Konstruktor MyCharacter */
	public MyCharacter(char c) {
		this.c = c;
	}
	/** Metoda koja pretvara veliko slovo u malo */
	public MyCharacter toLowerCase() {
		
		String s = this.c + "";
		char c = s.toLowerCase().charAt(0);
		
		return new MyCharacter(c);
	}
	/** Metoda koja pretvara malo slovo u veliko */
	public MyCharacter toUpperCase() {
		
		String s = this.c + "";
		char c = s.toUpperCase().charAt(0);
		
		return new MyCharacter(c);
	}
	/** Metoda toString */
	public String toString() {
		
		return this.c + "";
	}
	/** Main Klasa */
	public static void main(String[] args) {
		/*
		The Character class is provided in the Java library.
		Provide your own implementation for this class.
		Name the new class MyCharacter.
		 */
		
		/* Kreiranje objekata MC i pozivanje metoda za
		 * pretvaranje malog slova u veliko i obratno */
		MyCharacter c1 = new MyCharacter('x');
		MyCharacter c2 = new MyCharacter('X');
		
		System.out.println(c2.toLowerCase().toString());
		System.out.println(c1.toUpperCase().toString());
	}
}
