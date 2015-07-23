package zadaci_23_07_2015;

import java.util.Scanner;

public class ISBN10 {

	public static void main(String[] args) {
		/*
		 ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva:
		 d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao checksum
		 i njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom formulom:
		 (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11.
		 Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom.
		 Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj.
		 (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj.
		 Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
		 */
		
		Scanner input = new Scanner(System.in);
		
		int [] niz = new int[9]; // odredjivanje niza ISBN broja
		
		System.out.println("Unesite prvih devet brojeva vaseg ISBN-a: ");
		// unos 9 cifara ISBN broja
		for(int i=0; i<niz.length; i++) {
			niz[i] = input.nextInt();
		}
		// formula izracunavanja 10. broja ISBN-a po konvenciji
		int checksum = (niz[0]*1 + niz[1]*2 + niz[2]*3 + niz[3]*4 + niz[4]*5 + niz[5]*6 + niz[6]*7 + niz[7]*8 + niz[8]*9)%11;
		
		System.out.println("Vas ISBN broj je: "); // ispis prvih 9 unesenih brojeva
		for(int i=0; i<niz.length; i++) {
			System.out.print(niz[i]);
		}
		if(checksum == 10) {         // ako je vrijednost 10. broja dobijena formulom jednaka 10
			System.out.print("X");   // tada se po konveciji printa znak X
		} else {                          // u svakom drugom slucaju
			System.out.print(checksum); // se printa onaj broj koji je po formuli izracunat
		}
		input.close();
	}

}
