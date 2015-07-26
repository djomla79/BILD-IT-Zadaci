package zadaci_26_07_2015;

import java.util.Scanner;

public class BrojDanaMjesecUGodini {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese mjesec
		 i godinu te mu ispiše broj dana u datom mjesecu.
		 Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2,
		 program treba ispisati da je Februar 2012 imao 29 dana.
		 Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3,
		 program treba ispisati da je Mart 2015 imao 31 dan. 
		 */
		
		Scanner input = new Scanner(System.in);
		// niz stringova sa svih 12 mjeseci u godini
		String [] mjeseci = {"Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "Avgust", "Septembar", "Oktombar", "Novembar", "Decembar"};
		
		System.out.print("Unesite mjesec: ");
		int mjesec = input.nextInt();            // unos mjeseca
		
		System.out.print("Unesite godinu: ");    
		int godina = input.nextInt();            // unos godine
		while(godina > 2015) {                   // dok se uslov ne ispuni petlja se 'vrti'
			System.out.print("Unesite godinu ponovo: ");
			godina = input.nextInt();            // ponovni unos godine
		}                                   
		System.out.print(godina + " godine, ");  // ispis godina u konzolu
		
		for(int i=0; i<mjeseci.length-1; i++) {  // petlja koja prolazi kroz niz sa mjesecima
		}
		if(mjesec == 2 && prestupna(godina)) {                           // ako unesemo 2 i prestupna je godina
			System.out.println(mjeseci[mjesec-1] + " je imao 29 dana."); // ispis u konzolu						
		} else if(mjesec == 2 && !prestupna(godina)) {                   // a ako unesemo 2 i nije prestupna
			System.out.println(mjeseci[mjesec-1] + " je imao 28 dana."); // ispis u konzolu									
		}
		switch(mjesec) {                                                 // za svaki uneseni mjesec
		case 1:                                                          // npr 1. slucaj
			System.out.println(mjeseci[mjesec-1] + " je imao 31 dan.");  // ispis njegov u konzolu 
			break;                                                       // prekid programa
		case 3:
			System.out.println(mjeseci[mjesec-1] + " je imao 31 dan.");  // i tako dalje za svaki slucaj
			break;
		case 4:
			System.out.println(mjeseci[mjesec-1] + " je imao 30 dana.");
			break;
		case 5:
			System.out.println(mjeseci[mjesec-1] + " je imao 31 dan.");
			break;
		case 6:
			System.out.println(mjeseci[mjesec-1] + " je imao 30 dana.");
			break;
		case 7:
			System.out.println(mjeseci[mjesec-1] + " je imao 31 dan.");
			break;
		case 8:
			System.out.println(mjeseci[mjesec-1] + " je imao 31 dan.");
			break;
		case 9:
			System.out.println(mjeseci[mjesec-1] + " je imao 30 dana.");
			break;
		case 10:
			System.out.println(mjeseci[mjesec-1] + " je imao 31 dan.");
			break;
		case 11:
			System.out.println(mjeseci[mjesec-1] + " je imao 30 dana.");
			break;
		case 12:
			System.out.println(mjeseci[mjesec-1] + " je imao 31 dan.");
			break;
		}
		input.close();
	}
	/** Metod koji provjerava da li je godina prestupna ili nije */
	public static boolean prestupna(int godina) {
		
		if (godina%400==0 || (godina%4==0 && godina%100!=0)) { // po formuli ako je godina prestupna
			return true;                                       // vraca true, istinito
		} else {                                               // ako nije prestupna
			return false;                                      // vraca false, neistinito
		}
	}
}
