package zadaci_04_08_2015;

import java.util.Scanner;

public class ASCIIBrojUKarakter {

	public static void main(String[] args) {
		/*
		 Napisati program koji prima ASCII kod
		 (cijeli broj izmeðu 0 i 127) te ispisuje koji je to karakter.
		 Na primjer, ukoliko korisnik unese 69 kao ASCII kod,
		 program mu ispisuje da je karakter sa tim brojem karakter E.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		
		short broj = input.nextShort();    // unos broja
		while(broj < 33 || broj > 126) {   // ako je unos pogresan
			System.out.print("Greska, unos pogresan!\nUnesite broj ponovo: ");
			broj = input.nextShort();      // unos broja se vrsi ponovo
		}
		                                   // ispis karaktera po ASCII kod-u unesenog broja
		System.out.println("Uneseni broj " + broj + " je po ASCII kod-u karakter: " + (char)(broj));
		
		input.close();
	}
}
