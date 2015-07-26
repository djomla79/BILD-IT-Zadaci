package zadaci_26_07_2015;

import java.util.Scanner;

public class Suma3RandomBrojaGuess {

	public static void main(String[] args) {
		/*
		 Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir.
		 Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. 
		 Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom.
		 */
		
		Scanner input = new Scanner(System.in);
		
		boolean isOk = false;
		int odgovor;
		int broj1 = (int)(Math.random() * 10);
		int broj2 = (int)(Math.random() * 10);
		int broj3 = (int)(Math.random() * 10);
		
		while(!isOk){                   // petlja 'vrti' sve dok uslov nije istinit
			
		System.out.print("Koliko je " + broj1 + " + " + broj2 + " + " + broj3 + "? ");
		
		odgovor = input.nextInt();      // odgovor na pitanje koliki je zbir tri nasumicna broja
		
		if(odgovor != broj1 + broj2 + broj3) {                           // ako odgovor nije tacan
			System.out.println("Odgovor nije tacan, pokusajte ponovo!"); // program ispisuje poruku
			input.nextLine();                                            // i vraca petlju na pocetak
		} else {                                                         // a ako je odgovor tacan
			System.out.println("Cestitamo, vas odgovor je tacan!");      // program ispisuje poruku
			isOk = true;                                                 // uslov je zadovoljen (istinit)
		}	                                                             // i petlja zavrsava sa radom
		}
		input.close();
	}

}
