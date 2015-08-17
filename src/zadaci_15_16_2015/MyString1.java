package zadaci_15_16_2015;

public class MyString1 {
	
	char[] chars;
	
	/** Konstruktor MyString */
	MyString1(char[] chars) {
		
		this.chars = chars;
	}
	/** Metoda koja vraca duzinu niza */
	public int length() {
		
		int duzina = this.chars.length;
		return duzina;
	}
	/** Metoda koja vraca index niza */
	public char charAt(int index) {
		
		return this.chars[index];	
	}
	/** Metoda koja vraca objekt MS sa vrijednostima od pocetne vrijednosti
	 * unesenog parametra do krajnje vrijednosti unesenog parametra*/
	public MyString1 substring(int begin, int end) {
		
		char[] chars = new char[end-begin];
		
		for(int i=0; i <chars.length; i++) {
			chars[i] = this.chars[i+begin];
		}
		return new MyString1(chars);
	}
	/** Metoda koja vraca objekat sa karakterima sa malim slovima */
	public MyString1 toLowerCase() {
		
		char[] chars = new char[this.chars.length];
		for(int i=0; i<chars.length; i++){
			chars[i] = Character.toLowerCase(this.chars[i]);
		}
		return new MyString1(chars);
	}
	/** Metoda koja provjerava da li su dva niza ista */
	public boolean equals(MyString1 s) {
		
		for(int i=0; i<s.length(); i++) {
			if(s.chars[i] == this.chars[i]) {
				return true;
			}
		}
		return false;
	}
	/** Metoda koja konvertuje integer u karakter */
	public static MyString1 valueOf(int i) {
		
		char[] chars = Integer.toString(i).toCharArray();
		
		return new MyString1(chars);
	}
	/** toString metoda */
	public String toString() {
		
		String str = "";
		
		for(int i=0; i<this.length(); i++) {
			str += this.chars[i];
		}
		return str;
	}
	/** Main Klasa */
	public static void main(String[] args) {
		/*
		 (Implement the String class) The String class is provided in the Java library.
		 Provide your own implementation for the following methods (name the new
		 class MyString1):
		 public MyString1(char[] chars);
		 public char charAt(int index);
		 public int length();
		 public MyString1 substring(int begin, int end);
		 public MyString1 toLowerCase();
		 public boolean equals(MyString1 s);
		 public static MyString1 valueOf(int i);
		 */
		
		char[] chars1 = {'a', 'B', 'c', 'D', 'e','F', 'g', 'H', 'i', 'J', 'k', 'L', 'm', 'N', 'o'};
		
		char[] chars2 =  {'A', 'b', 'C', 'd', 'E', 'f', 'G', 'h', 'I'};
		
		/* Kreiranje objekata MS1 i pozivanje svih
		 * metoda za nizove karaktera chars1 i chars2 */
		MyString1 s1 = new MyString1(chars1);
		
		MyString1 s2 = new MyString1(chars1);
		
		MyString1 s3 = new MyString1(chars2);
		
		System.out.println("U prvom nizu karakter na indeksu 5 je: " + s1.charAt(5) + "\nU drugom nizu karakter na indexu 5 je: " + s3.charAt(5));
		
		System.out.println("Duzina prvog niza je: " + s1.length() + "\nDuzina drugog niza je: " + s3.length());
		
		System.out.println("Karakteri prvog niza izmedju 3. i 7. indexa su: " + s1.substring(3, 7));
		System.out.println("Karakteri drugog niza izmedju 1. i 5. indexa su: " + s3.substring(1, 5));
		
		System.out.println("Prvi niz, mala slova: " + s1.toLowerCase().toString() + "\nDrugi niz, mala slova: " + s3.toLowerCase().toString());
		
		System.out.println("Da li su dva niza ista? " + s1.equals(s2));
		
		System.out.println("Da li su prvi niz i drugi niz isti? " + s1.equals(s3));
		
		System.out.println(MyString1.valueOf(5));
	}
}
