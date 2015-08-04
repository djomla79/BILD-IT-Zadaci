package zadaci_04_08_2015;

import java.util.Scanner;

public class ShortBroj16Bita {

	public static void main(String[] args) {
		/*
		 U javi, short vrijednost se sprema u samo 16 bita.
		 Napisati program koji pita korisnika da unese short
		 broj te mu ispiše svih 16 bita za dati cijeli broj.
		 Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		
		short broj = input.nextShort();                  // unos broja
		
		while(broj < 0 || broj > 127) {                  // dok se uslov ne ispuni
			System.out.println("Greska, pogresan unos!\nUnesite broj ponovo: ");
			broj = input.nextShort();                    // ispis greske i unos se vrsi ponovo
		}
		
		String binarni = Integer.toBinaryString(broj);  // string sa binarnim kodom unesenog broja
		
		int duzina = binarni.length();                  // broj koji oznacava duzinu binarnog broja
		
		String nule = "00000000000000000";              // string sa 16 nula
		
		if (duzina < 16) {                              // ako je duzina binarnog broja manja od 16
		  binarni = nule.substring(0, 16 - duzina).concat(binarni); // binarni broj postaje string sa unosom, 16 - duzina binarnog broja, nula
		}                                                           // i dodanim binarnim brojem posle unesenog stringa sa nulama
		                                                            // ispis dobijenog 16-bitnog binarnog broja
		System.out.println("16-bitni broj, broja " + broj + " je: " + binarni);
		
		//System.out.println("\n" + Integer.toBinaryString(0x10000 | broj).substring(1));
		
		input.close();
	}

}
