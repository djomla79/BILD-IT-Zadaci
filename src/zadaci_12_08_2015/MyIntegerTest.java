package zadaci_12_08_2015;

import java.util.Scanner;

public class MyIntegerTest {

	public static void main(String[] args) {
		/*
		 (The MyInteger class) Design a class named MyInteger. The class contains:
		 An int data field named value that stores the int value represented by this object.
		 A constructor that creates a MyInteger object for the specified int value.
		 A getter method that returns the int value.
		 The methods isEven(), isOdd(), and isPrime() that return true if the
		 value in this object is even, odd, or prime, respectively.
		 The static methods isEven(int), isOdd(int), and isPrime(int) that
		 return true if the specified value is even, odd, or prime, respectively.
		 The static methods isEven(MyInteger), isOdd(MyInteger), and
		 isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
		 The methods equals(int) and equals(MyInteger) that return true if
		 the value in this object is equal to the specified value.
		 Write a client program that tests all methods in the class.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite 2 broja: ");
		
		int broj1 = input.nextInt();                
		int broj2 = input.nextInt();          // unos brojeva
		
		MyInteger br1 = new MyInteger(broj1); // kreiranje objekta MI
		MyInteger br2 = new MyInteger(broj2); // kreiranje objekta MI
		
		System.out.println("Broj " + broj1 + ":");
	    MyInteger.isEven(br1);                // pozivanje metode za provjeru parnih brojeva
	    br1.isOdd();                          // pozivanje metode za provjeru neparnih br.
	    MyInteger.isPrime(br1);               // pozivanje metode za provjeru primarnog broja
	    System.out.println("Broj " + broj2 + ":");
	    MyInteger.isEven(br2);                // pozivanje metode za provjeru parnih brojeva
	    MyInteger.isOdd(br2);                 // pozivanje metode za provjeru neparnih br.
	    br2.isPrime();                        // pozivanje metode za provjeru primarnog broja
	    
	    System.out.println("Da li su brojevi " + broj1 + " i " + broj2 + " isti? "); 
	    br1.equals(br2);                      // pozivanje metode, da li su iste vrijednosti unesenih brojeva
	    
	    input.close();
	}
}
/** Klasa MyInteger */
class MyInteger {
	
	private int value;
	
	/** Konstruktor sa jedim parametrom  */
	MyInteger(int value) {
		this.value = value;
	}
	/** Geter */
	public int getValue() {
		return value;
	}
	/** Metoda koja provjerava da li je broj paran */
	public static boolean isEven(int value) {
		if(value % 2 == 0) {
			System.out.println("Broj je paran.");
			return true;
		} else {
			return false;
		}	
	}
	/** Metoda koja provjerava da li je broj neparan */
	 public static boolean isOdd(int value) { 
		 if(!isEven(value)) {
			 System.out.println("Broj je neparan.");
			 return true;
		 } else {
			 return false;
		 } 	 
	 }
	 /** Metoda koja provjerava da li je  neparan */
	public static boolean isOdd(MyInteger broj) {
	    return isOdd(broj.value);   
	}
	/** Metoda koja provjerava da li je broj paran */
	public static boolean isEven(MyInteger value) {
	    if (value.getValue() % 2 == 0) {
	        return true;
	    } else {
	        return false;
	    } 
	}
	/** Metod koji provjerava da li je broj primaran */
    public static boolean isPrime(int broj) {
    	int brojac = 0;
        int djelioc = 1;
        // petlja koja provjerava da li je broj prosti
        while (djelioc <= broj) {
            if (broj % djelioc == 0) {
                brojac++;
            }
            djelioc++;
        }
        return (brojac == 2); // vraca kad je broj prost
    }
    /** Metoda koja provjerava da li je broj primaran */
    public static boolean isPrime(MyInteger broj) {
    	if(isPrime(broj.value)) {
    		System.out.println("Broj je primaran.");
    		return true;
    	} else {
    		System.out.println("Broj nije primaran.");
    		return false;    		
    	}  
    }
    /** Metoda koja provjerava da li je broj objekta paran */
    public boolean isEven() {
        return isEven(this.value);  
    }
    /** Metoda koja provjerava da li je broj objekta neparan */
    public boolean isOdd() {
    	return isOdd(this.value);
    }
    /** Metoda koja provjerava da li je broj objekta primaran */
    public boolean isPrime() {
    	if(isPrime(value)) {
    		System.out.println("Broj je primaran.");
    		return true;
    	} else {
    		System.out.println("Broj nije primaran.");
    		return false;    		
    	}
    }
    /** Metoda koja provjerava da li je unesena
     * vrijednost jednaka vrijednosti objekta */
    public boolean equals(int value) {
    	if(value == getValue()) {
    		System.out.println("Vrijednosti su iste.");
    		return true;
    	} else {
    		System.out.println("Vrijednosti nisu iste.");
    		return false;
    	}
    }
    /** Metoda koja provjerava da li je unesena
     * vrijednost jednaka vrijednosti objekta */
    public boolean equals(MyInteger broj) {
    	if(broj.value == getValue()) {
    		System.out.println("Vrijednosti su iste.");
    		return true;
    	} else {
    		System.out.println("Vrijednosti nisu iste.");
    		return false;
    	}
    }
}	
		

