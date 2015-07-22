package zadaci_22_07_2015;

import java.util.Scanner;

public class ProstiBrojevi3argumenta {

	public static void main(String[] args) {
		
		 /*
		  Napisati metodu koja prima 2 argumenta:
		  poèetni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
		  BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.
		  */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite pocetni i krajnji broj za ispis prostih brojeva u konzolu"
				          + "\ni unesite broj koji odredjuje ispis prostih brojeva po liniji: ");
		int pocetni = input.nextInt();    // unos od kojeg broja trazimo proste
		int krajnji = input.nextInt();    // unos do kojeg broja trazimo proste
		int brojPoLiniji = input.nextInt();  // unos koliko prostih brojeva ispisujemo u liniju u konzoli
		// ispis svih prostih brojeva u konzolu
		System.out.println("Prvih " + krajnji + " prostih brojeva su: ");
		ispisProstih(pocetni, krajnji, brojPoLiniji); // pozivanje metode za ispis prostih brojeva
		input.close();
	}
	/** Metod za ispis prostih brojeva */
	public static void ispisProstih(int pocetni, int krajnji, int brojPoLiniji) {
		
		int brojac = 0;
		// petlja za ispis prostih brojeva
		for(int broj = pocetni; broj <= krajnji; broj++) {
	         if (prostiBroj(broj)) {  // pozivanje metode koja provjerava da li su brojevi prosti
	        	 brojac++;
	            if (brojac %brojPoLiniji == 0) {   // ispis prostih brojeva po liniji (koliko korisnik unese)
	            	System.out.println(broj + " ");
	            } else {
	                System.out.print(broj + " ");	
	            }
	         }
	     }
    }
	    /** Metod koji provjerava da li su brojevi prosti */
	    public static boolean prostiBroj(int broj) {
	        
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
}
