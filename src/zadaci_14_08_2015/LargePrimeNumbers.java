package zadaci_14_08_2015;

import java.math.BigInteger;

public class LargePrimeNumbers {

	public static void main(String[] args) {
		/*
		 Write a program that finds five prime numbers larger than Long.MAX_VALUE.
		 */
		
		String maxLong = "" + Long.MAX_VALUE;                           // ubacujemo u string max vrijednost za brojeve long
	    
		System.out.println("Maximalni broj long je: " + maxLong);       // ispis tog broja
		
		BigInteger primarniLong = new BigInteger("" + Long.MAX_VALUE);  // kreiranje obj BI sa parametrom maxLong vrijednosti      
	      
		int brojac = 0;
	    
		System.out.println("Prvih deset primarnih brojeva iznad maxLong broja su: ");
		
		while(brojac < 10) {                                            // petlja radi dok brojac ne dodje do 10
			
			if(primarniLong.isProbablePrime(1)) {                       // poz. metode za provjeru primarnih brojeva
				brojac++;                                               // ako je broj primaran, brojac se povecava za 1
				System.out.println(brojac + ". " + primarniLong);
			}  
			primarniLong = primarniLong.add(BigInteger.ONE);            // vraca vrijednost primarniLong povecanu za 1
		}
	}
}
