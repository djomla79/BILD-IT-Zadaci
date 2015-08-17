package zadaci_15_16_2015;

public class MyStringBuilder1 {
	
	String s;
	
	/** Konstruktor MyStringBuilder1 */
	MyStringBuilder1(String s) {
		this.s = s;
	}
	/** Metoda koja dodaje jedan objekat na drugi */
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		
		String str = this.s + s.s;
		
		return new MyStringBuilder1(str);
	}
	/** Metoda koja dodaje broj na objekat */
	public MyStringBuilder1 append(int i) {
		
		String str = this.s + i;
		
		return new MyStringBuilder1(str);
	}
	/** Metoda koja vraca duzinu stringa */
	 public int length() {
		 
		 return this.s.length();
	 }
	 /** Metoda koja vraca karakter
	  * koji se nalazi na odredjenom indeksu */
	 public char charAt(int index) {
		 
		 return this.s.charAt(index);
	 }
	 /** metoda koja pretvara string objekta u sva mala slova */
	 public MyStringBuilder1 toLowerCase() {
		 
		 String s = "";
		 
		 for(int i=0; i<this.s.length(); i++) {
			 s += Character.toUpperCase(this.s.charAt(i));
		 }
		 return new MyStringBuilder1(s);
	 }
	 /** Metoda koja vraca objekat substring koji
	  * pocinje od indexa begin i ide do indexa end */
	 public MyStringBuilder1 substring(int begin, int end) {
		 
		 String s = "";
		 
		 for(int i=begin; i<=end; i++) {
			 s += this.s.charAt(i);
		 }
		 return new MyStringBuilder1(s);
	 }
	/** toString metoda */
	public String toString() {
		
		return this.s;
	}
	/** Main Klasa */
	public static void main(String[] args) {
	/*
	 (Implement the StringBuilder class) The StringBuilder class is provided
	 in the Java library. Provide your own implementation for the following methods
	 (name the new class MyStringBuilder1):
	 public MyStringBuilder1(String s);
	 public MyStringBuilder1 append(MyStringBuilder1 s);
	 public MyStringBuilder1 append(int i);
	 public int length();
	 public char charAt(int index);
	 public MyStringBuilder1 toLowerCase();
	 public MyStringBuilder1 substring(int begin, int end);
	 public String toString();
	 */
		/** Kreiranje objekata MSB1 i pozivanje svih metoda */
		MyStringBuilder1 s1 = new MyStringBuilder1("String JEDAN");
		
		MyStringBuilder1 s2 = new MyStringBuilder1("String DVA");
		
		System.out.println("String1 + String2: " + s1.append(s2).toString());
		
		System.out.println("String1 + broj: " + s1.append(11).toString());
		
		System.out.println("Duzina prvog stringa: " + s1.length() + "\nDuzina drugog stringa: " + s2.length());
		
		System.out.println("U prvom nizu karakter na indeksu 3 je: " + s1.charAt(3) + "\nU drugom nizu karakter na indexu 3 je: " + s2.charAt(3));
		
		System.out.println("Prvi string, mala slova: " + s1.toLowerCase().toString() + "\nDrugi string, mala slova: " + s2.toLowerCase().toString());
		
		System.out.println("Karakteri prvog stringa izmedju 3. i 7. indexa su: " + s1.substring(3, 7));
		System.out.println("Karakteri drugog stringa izmedju 1. i 5. indexa su: " + s2.substring(1, 5));
		
	}
}
