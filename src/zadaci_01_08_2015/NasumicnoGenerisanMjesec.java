package zadaci_01_08_2015;

import java.util.Scanner;

public class NasumicnoGenerisanMjesec {

	public static void main(String[] args) {
		/*
		 Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12
		 te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
		 */
		
		Scanner input = new Scanner(System.in);
		// niz stringova sa svih 12 mjeseci u godini
		String [] mjeseci = {"Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "Avgust", "Septembar", "Oktombar", "Novembar", "Decembar"};
		
		for(int i=0; i<mjeseci.length-1; i++) {  // petlja koja prolazi kroz niz sa mjesecima
		}
		
		int mjesec = (int)(Math.random()*13);    // nasumican broj izmedju 1 i 12
		
		System.out.println("Nasumican broj je: " + mjesec); // ispis tog broja
		
		System.out.print("Mjesec je: ");
		switch(mjesec) {                         // za svaki generisani broj
		case 1:
			System.out.print(mjeseci[mjesec-1]); // ispis mjeseca u konzolu 
			break;                               // prekid programa
		case 2:
			System.out.print(mjeseci[mjesec-1]); // i tako dalje za svaki slucaj
			break;
		case 3:
			System.out.print(mjeseci[mjesec-1]);
			break;
		case 4:
			System.out.print(mjeseci[mjesec-1]);
			break;
		case 5:
			System.out.print(mjeseci[mjesec-1]);
			break;
		case 6:
			System.out.print(mjeseci[mjesec-1]);
			break;
		case 7:
			System.out.print(mjeseci[mjesec-1]);
			break;
		case 8:
			System.out.print(mjeseci[mjesec-1]);
			break;
		case 9:
			System.out.print(mjeseci[mjesec-1]);
			break;
		case 10:
			System.out.print(mjeseci[mjesec-1]);
			break;
		case 11:
			System.out.print(mjeseci[mjesec-1]);
			break;
		case 12:
			System.out.print(mjeseci[mjesec-1]);
			break;
		}
		input.close();
	}

}
