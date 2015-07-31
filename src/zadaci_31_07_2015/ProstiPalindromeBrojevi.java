package zadaci_31_07_2015;

public class ProstiPalindromeBrojevi {

	public static void main(String[] args) {
		/*
		 Palindrome prime je prosti broj koji je takoðer i palindrom.
		 Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757.
		 Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji. 
		 */
		
		isPrime(1000);  // pozivanje metode
		
	}
	/** Metoda koja vraca sve primarne brojeve za odredjeni unos */
	public static int isPrime(int n) {
		
		int brojac = 0;
		int i;
		for (i=10; i < n; i++) {                   // petlja koja ide od 0 do unesenog broja (100)
			if (primarni(i) && isPalindrome(i)) { // ako je broj primaran i palindrome
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
	/** Metoda koja provjerava da li je uneseni broj Palindrome */
	public static boolean isPalindrome(int number) {
		
		boolean isPalindrome = false;
		
		if(number == reverse(number)) { // ako je uneseni broj jednak obrnutom broju
			isPalindrome = true;        // onda je taj broj palindrome, vraca true (istinito)
		} else {                        // ako nije jednak
			isPalindrome = false;       // vraca false, nije istinito
		}
		return isPalindrome;            // vraca da li je broj palindrom ili nije
	}
}
