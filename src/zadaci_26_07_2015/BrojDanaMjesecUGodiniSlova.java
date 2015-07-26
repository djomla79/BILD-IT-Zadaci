package zadaci_26_07_2015;

import java.util.Scanner;

public class BrojDanaMjesecUGodiniSlova {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese godinu i prva tri slova
		 imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu.
		 Na primjer, ukoliko korisnik kao godinu unese 2001
		 a kao mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
		 */
		
		Scanner input = new Scanner(System.in);
		// niz stringova sa svih 12 mjeseci u godini
		String [] mjeseci = {"Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "Avgust", "Septembar", "Oktombar", "Novembar", "Decembar"};
		
		System.out.print("Unesite mjesec: ");
		String mjesec = input.next();            // unos mjeseca
		
		System.out.print("Unesite godinu: ");    
		int godina = input.nextInt();            // unos godine
		while(godina > 2015) {                   // dok se uslov ne ispuni petlja se 'vrti'
			System.out.print("Unesite godinu ponovo: ");
			godina = input.nextInt();            // ponovni unos godine
		}                                   
		System.out.print(godina + " godine, ");  // ispis godina u konzolu
		
		for(int i=0; i<mjeseci.length-1; i++) {  // petlja koja prolazi kroz niz sa mjesecima
		}
		if(mjesec.matches("Feb") && prestupna(godina)) {          // ako unesemo Feb i prestupna je godina
			System.out.println(mjeseci[1] + " je imao 29 dana."); // ispis u konzolu						
		} else if(mjesec.matches("Feb") && !prestupna(godina)) {  // a ako unesemo Feb i nije prestupna
			System.out.println(mjeseci[1] + " je imao 28 dana."); // ispis u konzolu									
		}
		switch(mjesec) {                                          // za svaki uneseni mjesec
		case "Jan":                                               // npr  slucaj Jan
			System.out.println(mjeseci[0] + " je imao 31 dan.");  // ispis njegov u konzolu 
			break;                                                // prekid programa
		case "Mar":
			System.out.println(mjeseci[2] + " je imao 31 dan.");  // i tako dalje za svaki slucaj
			break;
		case "Apr":
			System.out.println(mjeseci[3] + " je imao 30 dana.");
			break;
		case "Maj":
			System.out.println(mjeseci[4] + " je imao 31 dan.");
			break;
		case "Jun":
			System.out.println(mjeseci[5] + " je imao 30 dana.");
			break;
		case "Jul":
			System.out.println(mjeseci[6] + " je imao 31 dan.");
			break;
		case "Avg":
			System.out.println(mjeseci[7] + " je imao 31 dan.");
			break;
		case "Sep":
			System.out.println(mjeseci[8] + " je imao 30 dana.");
			break;
		case "Okt":
			System.out.println(mjeseci[9] + " je imao 31 dan.");
			break;
		case "Nov":
			System.out.println(mjeseci[10] + " je imao 30 dana.");
			break;
		case "Dec":
			System.out.println(mjeseci[11] + " je imao 31 dan.");
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
