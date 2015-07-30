package zadaci_30_07_2015;

public class ProstiBrojeviOd0Do100000 {

	public static void main(String[] args) {
		/*
		 Napisati metodu sa sljedeæim headerom:
		 public static int isPrime(int n) koja provjerava da li je broj prost/prime.
		 Napsati test program koji poziva ovu metodu i
		 ispisuje sve proste brojeve u rasponu od 0 do 10000.
		 */
		
		isPrime(100000);   // pozivanje metode
		
	}
	/** Metoda koja vraca sve primarne brojeve za odredjeni unos */
	public static int isPrime(int n) {
		
		int brojac = 0;
		int i;
		for (i=0; i < n; i++) {                  // petlja koja ide od 0 do unesenog broja (100000)
			if (primarni(i)) {                   // ako je broj primaran
				brojac++;                        // brojac koji broji primarne
				if (brojac % 20 == 0) {          // kad brojac dodje do 20
					System.out.println(i + " "); // ispis u novi red
				} else {
					System.out.print(i + " ");
				}
			}
		}	
	return i;                                   // vraca primarne brojeve
	}
	/** Metoda koja vraca da li je broj primarni ili ne */
	public static boolean primarni(int broj) {
        
		// petlja koja provjerava da li je broj primaran
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0) { // ako je broj djeljiv sa i, tj sa 2, vraca false, nije primaran 
				return false;
				}
			}
		return true;             // ako nije djeljiv, vraca true, broj je primaran
		}
	}
