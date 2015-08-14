package zadaci_14_08_2015;

import java.math.BigDecimal;

public class VelikiDecimalniDjeljiviSa2i3 {

	public static void main(String[] args) {
		/*
		 Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
		 */
		
		BigDecimal broj = new BigDecimal("10000000000000000000000000000000000000000000000000"); // obj sa 50cifrenim brojem
		BigDecimal dva = new BigDecimal(2);                      // kreiramo obj sa parametrom int vrij 2
		BigDecimal tri = new BigDecimal(3);                      // kreiramo obj sa parametrom int vrij 3
		
		System.out.println("\nPrvih deset brojeva (sa 50 cifara) djeljivih sa 2 ili 3 su :");
		
		int brojac = 0;
		
		while(brojac < 10) {                                     // petlja radi dok brojac ne dodje do 10

			BigDecimal modulDva = broj.remainder(dva);           // poz met. gdje se broj dijeli sa brojem 2 i daje ostatak
			BigDecimal modulTri = broj.remainder(tri);           // poz met. gdje se broj dijeli sa brojem 3 i daje ostatak
			BigDecimal nula = BigDecimal.ZERO;                   // kreiranje obj BI parametar int vrijednosti nula
			
			/* Ako je ostatak dijeljenja jednak nuli tj, broj je djeliv sa brojem 2 ili 3 */
			if (modulDva.equals(nula) || modulTri.equals(nula)) {
				brojac++;
				System.out.println(brojac + ". " + broj);        // ispis brojeva u konzolu
			}
			broj = broj.add(new BigDecimal(1));                  // vraca vrijednost broj povecanu za 1
		}
	}
}
