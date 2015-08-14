package zadaci_14_08_2015;

import java.math.BigInteger;

public class SquareNumbers {

	public static void main(String[] args) {
		/*
		 (Square numbers) Find the first ten square numbers that are greater than
		 Long.MAX_VALUE. A square number is a number in the form of n2. For example,
		 4, 9, and 16 are square numbers. Find an efficient approach to run your program fast.
		 */
		
		String maxLong = "" + Long.MAX_VALUE;                                 // ubacujemo u string max vrijednost za brojeve long
	    System.out.println("Maximalni broj long je: " + maxLong);             // ispis tog broja
	      
	    String nizMaxLong = String.format("%.0f", Math.sqrt(Long.MAX_VALUE)); // ubacujemo string korijen Long.MAX_VALUE long broja
	      
	    BigInteger korijenMaxLong = new BigInteger(nizMaxLong);               // kreiramo objekat u BigInt klasi sa parametrom string
	   
	    System.out.println("Korijen maxLong broja je: " + korijenMaxLong);    // ispis korijenovanog broja
	      
	    int brojac = 0;
	    
	    System.out.println("Prvih 10 'Square numbers' brojeva preko maxLong broja su: "); // ispis u konzolu
	    
	    while(brojac < 10) {                                                  // petlja radi dok brojac ne dodje do 10
	    	/* Ako je proizvod dva korijena broja (square number) iznad Long.MAX_VALUE granice, brojac se povecava za 1 */
	    	if(korijenMaxLong.multiply(korijenMaxLong).compareTo(new BigInteger("" + Long.MAX_VALUE)) >= 0) {
	    		brojac++;
	    		String osnova = "" + korijenMaxLong.multiply(korijenMaxLong); // ubacujemo u string dobijeni square number
	    		BigInteger BrojOsnova = new BigInteger(osnova);               // kreiramo obj BI sa parametrom string
	    		System.out.println(brojac + ". " + BrojOsnova);               // ispis brojeva
	    	}
	    	korijenMaxLong = korijenMaxLong.add(BigInteger.ONE);              // vraca vrijednost korijenMaxLong povecanu za 1
	    }
	}
}
