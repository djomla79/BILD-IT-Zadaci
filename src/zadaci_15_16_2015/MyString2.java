package zadaci_15_16_2015;

public class MyString2 {
	
	private String str = "";
	
	/** Konstruktor MyString2 sa parametrom string */
	MyString2(String s) {
		this.str = s;
	}
	/** Metoda koja poredi dva stringa */
	public int compare(String s) {
		
		if(str.length() == s.length()) {
			return 0;
		} else if(str.length() > s.length()) {
			return 1;
		} else {
			return -1;
		}
	}
	/** Metoda koja vraca objekat, novi string koji
	 * ide od parametra begin do kraja stringa*/
	public MyString2 substring(int begin) {
		
		String s = "";
		
		for(int i=begin; i<str.length(); i++) {
			s += this.str.charAt(i);
		}
		return new MyString2(s);
	}
	/** Metoda koja pretvara string u string sa
	 * velikim slovima i vraca obj sa tim vrijednostima */
	public MyString2 toUpperCase() {
		
		String s = "";
		
		for(int i=0; i<str.length(); i++) {
			s += Character.toUpperCase(str.charAt(i));
		}
		return new MyString2(s);
	}
	/** Metoda koja pretvara string u niz karaktera */
	public char[] toChars() {
		
		char[] chars = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			chars[i] = str.charAt(i);
		}
		return chars;
	}
	/** Metoda koja vraca obj. vrijednosti string boolean */
	public static MyString2 valueOf(boolean b) {
		
		String t = "true";
		String f = "false";
		
		if(b == true) {
			return new MyString2(t);
		} else {
			return new MyString2(f);
		}
	}
	/** toString metoda */
	public String toString() {
		return this.str;
	}
	/** Main Klasa */
	public static void main(String[] args) {
		/*
		 (Implement the String class) The String class is provided in the Java library.
		 Provide your own implementation for the following methods (name the new
		 class MyString2):
		 public MyString2(String s);
		 public int compare(String s);
		 public MyString2 substring(int begin);
		 public MyString2 toUpperCase();
		 public char[] toChars();
		 public static MyString2 valueOf(boolean b);
		 */
		
		/* Kreiranje objekta MS2 i pozivanje metoda */
		MyString2 s1 = new MyString2("Sta da napisem ovdje");
		
		System.out.println("Ako je string1 veci (1), a ako je string2 veci (-1). " + s1.compare("A tek ovdje"));
		
		System.out.println("Substring unesenog stringa: " + s1.substring(4).toString());
		
		System.out.println("String sa velikim slovima: " + s1.toUpperCase().toString());
		
		System.out.println("String boolean vrijednosti: " + MyString2.valueOf(true));
		
	}
}
