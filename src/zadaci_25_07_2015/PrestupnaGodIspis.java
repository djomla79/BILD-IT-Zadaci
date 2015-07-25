package zadaci_25_07_2015;

import java.util.Scanner;

public class PrestupnaGodIspis {

	public static void main(String[] args) {
		
		/*
		  Napisati program koji ispisuje sve prijestupne godine, 10 po liniji,
		  u rasponu godina koje korisnik unese. Program pita korisnika da unese
		  poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
		  Razmak izmeðu godina treba biti jedan space. 
		 */
		
		Scanner input = new Scanner(System.in);
		int brojac = 0;

		System.out.print("Unesite prvu i zadnju godinu: ");
		// unos od koje do koje godine racunamo prestupne godine
		int prva = input.nextInt();
		int zadnja = input.nextInt();
		// ispis u konzolu
		System.out.println("Prestupne godine, od " + prva + ". do " + zadnja + ". godine su: \n");
		for (int i=prva; i<=zadnja; i++) {    
		   if (i%400==0 || (i%4==0 && i%100!=0)){  // po formuli uslov ako je godina prestupna
			  brojac++;                            // brojac prestupnih godina
			  if (brojac % 10 == 0) {              // kad dodje do 10 ispisuje gog. u sledeci red
					System.out.println(i + " ");
			   } else {
					System.out.print(i + " ");
			   }
		   } 
	    }
		input.close();
	}
}
