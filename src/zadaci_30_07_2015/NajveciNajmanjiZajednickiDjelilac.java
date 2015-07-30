package zadaci_30_07_2015;

import java.util.Scanner;

public class NajveciNajmanjiZajednickiDjelilac {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese dva cijela, pozitivna broja
		 te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite prvi broj: ");
		
		int n = input.nextInt();
		                                        // unos brojeva
		System.out.print("Unesite drugi broj: ");
		
		int m = input.nextInt();
		
		// ispis u konzolu
		System.out.println("Najmanji zajednicki djelilac za brojeve " + n + " i " + m + " je " + djeliloc(n, m) + ".");
		System.out.println("Najveci zajednicki djelilac za brojeve " + n + " i " + m + " je " + djelilac(n, m) + ".");
		
		input.close();
	}
	/** Metod koji uzima dva parametra (integera) i vraca najveci zajednicki djelilac */
	public static int djelilac(int n, int m) {
		
		int nzd = 1;
		int broj = 2;
		// petlja u kojoj uzimamo parametre
		while(broj <= n && broj <= m) {          // petlja se 'vrti' dok se uslov ne ispuni
			if(n % broj == 0 && m % broj == 0) { // ako su oba unesena broja djeljivi sa brojem
				nzd = broj;                      // najmanji zajednicki djelilac postaje taj broj
			}
			broj++;                              // broj se povecava za jedan
		}
		// metoda vraca najveci zajednicki djelilac
		return nzd;
	}
	/** Metod koji uzima dva parametra (integera) i vraca najmanji zajednicki djelilac */
	public static int djeliloc(int n, int m) {
	
		int nzd = 1;
		int broj = 2;
		// petlja u kojoj uzimamo parametre
		while(broj <= n && broj <= m) {          // petlja se 'vrti' dok se uslov ne ispuni
			if(n % broj == 0 && m % broj == 0) { // ako su oba unesena broja djeljivi sa brojem
				nzd = broj;                      // najmanji zajednicki djelilac postaje taj broj
				break;                           // petlja se prekida, cim prvi broj postane djeljiv sa oba broja
			}
			broj++;
		}
		// metoda vraca najmanji zajednicki djelilac
		return nzd;
	}
}
