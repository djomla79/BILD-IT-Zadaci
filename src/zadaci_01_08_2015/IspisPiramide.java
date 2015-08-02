package zadaci_01_08_2015;

import java.util.Scanner;

public class IspisPiramide {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese cijeli broj
		 te ispisuje piramidu svih brojeva do tog broja.
		 (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, red ispod
		 vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		
		int broj = input.nextInt();  // unos broja
		
		ispisPiramide(broj);         // pozivanje metode
		
		input.close();
	}
	/** Metoda koja prima argument (integer) i ispisuje piramidu do broja 99 */
	public static void ispisPiramide(int n) {
		
		for (int i = 1; i <= n; i++) {         // vanjska petlja koja ide od 1 do unesenog broja
			for (int j = 1; j <= n - i; j++) { // petlja koja ide od 1 do unesenog broja n koji se smanjuje za i, n-i(n-1, n-2,...,n-n)
				System.out.print("   ");        // petlja stampa * i 2 prazna polja
			}
			for (int k = i; k >= 1; k--) {     // petlja koja krece od i (1, 2,...,n) i smanjuje se do 1, vrsi ispis lijeve strane piramide
				if (k >= 10) {                 // ako je broj jednak ili veci od 10
					System.out.print(k + " "); // stampa brojeve sa jednim razmakom
				} else {                       // a ako nije 
					System.out.print(k + "  ");// stampa brojeve (od 1 do 9) sa dva razmaka
				}
			}
			for (int l = 2; l <= i; l++) {     // petlja koja krece od 2 i ide do i (1, 2,...,n) i vrsi ispis desne strane piramide
				if (l >= 10) {                 // ako je broj jednak ili veci od 10
					System.out.print(l + " "); // stampa brojeve sa jednim razmakom
				} else {                       // a ako nije
					System.out.print(l + "  ");// stampa brojeve (od 2 do 9) sa dva razmaka
				}
			}
			System.out.println();              // prebacivanje u sledeci red
		}
	}
}
