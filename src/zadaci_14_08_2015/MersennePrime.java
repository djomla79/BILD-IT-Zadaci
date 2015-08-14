package zadaci_14_08_2015;

import java.math.BigInteger;

public class MersennePrime {

	public static void main(String[] args) {
		/*
		 A prime number is called a Mersenne prime if it can be written
		 in the form 2p - 1 for some positive integer p. Write a program that finds
		 all Mersenne primes with p … 100 and displays the output as shown below.
		 */
		
		System.out.println("Prime - Mersenne");
		
		for(int p=2; p<=100; p++) {                                      // petlja brojeva od 2 do 100
			if(isPrime(p)) {                                             // ako je broj primaran
				long mersennePrime = (long)(Math.pow(2, p)) - 1;         // ubacivanje primarnih u formulu mersenne brojeva
				BigInteger mersenne = new BigInteger("" + mersennePrime);// storovanje brojeva u obj BI
				String n = "" + p;
				
				if(n.length() < 2) {
					System.out.print("  " + p + "   -   " + mersenne + "\n"); // ispis primarnih i mersenne brojeva u konzolu
				} else {
					System.out.print(" " + p + "   -   " + mersenne + "\n"); 
				}
			}
		}
	}
	/** Metoda koja vraca da li je broj primarni ili ne */
    public static boolean isPrime(int broj) {
    	                         // petlja koja provjerava da li je broj primaran
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) { // ako je broj djeljiv sa i, tj sa 2, vraca false, nije primaran 
                return false;
            }
        }
        return true;             // ako nije djeljiv, vraca true, broj je primaran
    }
}
