package zadaci_14_08_2015;

import java.math.BigInteger;

public class VelikiBrojeviDjeljiviSa5i6 {

	public static void main(String[] args) {
		/*
		 Find the first ten numbers greater than
		 Long.MAX_VALUE that are divisible by 5 or 6.
		 */
		String max = "" + Long.MAX_VALUE;                         // ubacujemo u string max vrijednost za brojeve long
	    
		System.out.println("Maximalni broj long je: " + max);     // ispis tog broja
		
		BigInteger maxLong = new BigInteger("" + Long.MAX_VALUE); // kreiranje obj BI sa parametrom maxLong vrijednosti
		
		BigInteger pet = new BigInteger("5");
		BigInteger sest = new BigInteger("6");
	      
		int brojac = 0;
		
		System.out.println("Prvih 10 brojeva (iznad maxLong broja) djeljivih sa 5 ili 6 su :");
		
		while(brojac < 10) {

			BigInteger modulPet = maxLong.remainder(pet);         // poz met. gdje se broj dijeli sa brojem 5 i daje ostatak
			BigInteger modulSest = maxLong.remainder(sest);       // poz met. gdje se broj dijeli sa brojem 6 i daje ostatak
			BigInteger nula = BigInteger.ZERO;                    // kreiranje obj BI parametar int vrijednosti nula
			
			/* Ako je ostatak dijeljenja jednak nuli tj, broj je djeliv sa brojem 5 ili 6*/
			if (modulPet.equals(nula) || modulSest.equals(nula)) {
				brojac++;                                         // brojac se povecava za 1
				System.out.println(brojac + ". " + maxLong);      // i ispisuje te brojeve
			}
			maxLong = maxLong.add(BigInteger.ONE);                // vraca vrijednost maxLong povecanu za 1 
		}
		
	}

}
