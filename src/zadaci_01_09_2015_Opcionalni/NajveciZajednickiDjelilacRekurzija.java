package zadaci_01_09_2015_Opcionalni;

import java.util.Scanner;

public class NajveciZajednickiDjelilacRekurzija {

	public static void main(String[] args) {
		/*
		 The gcd(m, n) can also be defined recursively as follows:
		 If m % n is 0, gcd(m, n) is n.
		 Otherwise, gcd(m, n) is gcd(n, m % n).
		 Write a recursive method to find the GCD.
		 Write a test program that prompts the user to enter two integers and displays their GCD.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite prvi broj: ");
		
		int m = input.nextInt();
		
		while(m < 0) {           // petlja radi dok se uslov ne ispuni
			System.out.println("Unos ne moze biti negativan!");
			System.out.print("Unesite prvi broj: ");
			m = input.nextInt();
		}
		
		System.out.print("Unesite drugi broj: ");
		
		int n = input.nextInt();
		
		while(n < 0) {           // petlja radi dok se uslov ne ispuni
			System.out.println("Unos ne moze biti negativan!");
			System.out.print("Unesite drugi broj: ");
			n = input.nextInt();
		}
		
		System.out.println("Najveci zajednicki djelilac za brojeve " + n + " i " + m + " je " + djelilac(m, n) + ".");
		
		input.close();
	}
	
	/** Metod koji uzima dva parametra (integera)
	 * i vraca najveci zajednicki djelilac 
	 * koristeci se rekurzivnom metodom (pozivajuci samu sebe) */
	public static int djelilac(int m, int n) {
		
		int nzd;
		
		if(m == 0 || n == 0) {        // ako je jedan od brojeva nula
			nzd = m + n;              // tada je nzd drugi broj (broj sabran sa 0 daje taj broj i djeljiv je sa samim sobom)
		} else {                      // a ako nije
			nzd = djelilac(n, m % n); // nzd se dobija metodom koja poziva samu sebe (rekurzija)
		}
		
		return nzd;                   // vracanje vrijednosti nzd
	}
	
}
