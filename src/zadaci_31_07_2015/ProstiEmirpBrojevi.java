package zadaci_31_07_2015;

public class ProstiEmirpBrojevi {

	public static void main(String[] args) {
		/*
		 Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj i kada ispišemo naopako.
		 Na primjer, broj 17 i broj 71 su prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi.
		 Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. 
		 */
		
		System.out.println("Emirp brojevi: \n");
		isPrime(100);   // pozivanje metode
		
	}
	/** Metoda koja vraca sve primarne brojeve za odredjeni unos */
	public static int isPrime(int n) {
		
		int brojac = 0;
		int i;
		for (i=12; i < n; i++) {                   // petlja koja ide od 0 do unesenog broja (100)
			if (primarni(i) && primarni(reverse(i))) { // ako je broj primaran i palindrome
				brojac++;                         // brojac koji broji primarne i palindrome
				if (brojac % 10 == 0) {           // kad brojac dodje do 10
					System.out.println(i + " ");  // ispis u novi red
				} else {
					System.out.print(i + " ");
				}
			}
		}
		return i;                                   // vraca primarne brojeve i palindrome
	}
	/** Metoda koja vraca da li je broj primarni ili ne */
	public static boolean primarni(int n) {
        
		// petlja koja provjerava da li je broj primaran
		for (int i = 2; i < n; i++) {
			if (n % i == 0) { // ako je broj djeljiv sa i, tj sa 2, vraca false, nije primaran 
				return false;
				}
			}
		return true;             // ako nije djeljiv, vraca true, broj je primaran
		}
	/** Metoda koja obrce uneseni broj naopako */
	public static int reverse(int n) {
		
		String broj = Integer.toString(n); // pretvaranje unesenog broja u string
		String suma = "";
		
		// petlja koja ide kroz string naopako
		for(int i=broj.length()-1; i>=0; i--) {
			suma += broj.charAt(i);  // unos karaktera iz stringa u novi prazan string
		}
		int brojObrnuto = Integer.parseInt(suma);  // pretvaranje dobijenog obrnutog stringa u integer
		
		return brojObrnuto;                        // vracanje pretvorenog broja (obrnutog naopako)
	}
	
}
