package zadaci_21_07_2015;

import java.util.Scanner;

public class BacanjeNovcicaMetod {

	public static void main(String[] args) {
		
		/*
		 Napisati metodu koja prima jedan argument te simulira bacanje novcica toliko puta.
		 Nakon sto se simulacija zavrsi, program ispisuje koliko je puta novcic pokazao
		 glavu a koliko je puta pokazao pismo.
		 */
        
		int bacanje = (int)(Math.random()*2); // nasumicno bacanje brojeva 0 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ukucajte broj bacanja novcica: ");
		
		int brojBacanja = input.nextInt(); // unos ukupnog broja bacanja
		
		bacanjeNovcica(brojBacanja, bacanje);  // pozivanje i ispis metode
		
		input.close();
		
	}
	/** Metoda bacanja novcica koja prima argumente ukupan broj bacanja i nasumicno bacanje*/
	public static void bacanjeNovcica(int brojBacanja, int bacanje) {
		
		int pismo = 0;
		int glava = 0;
		// petlja se izvrsava sve dok ukupan broj bacanja ne dodje do 0
		while (brojBacanja != 0) {
		   if (bacanje == 0) { // ako je nasumicno generisan broj 0 (pismo)
			 pismo++;          // brojac koliko puta je nas. gen. broj 0, 
		   } else {            // ako je nasumicno generisan broj 1 (glava)
			glava++;           // brojac koliko puta je nas. gen. broj 1
		   }
		    bacanje = (int)(Math.random()*2); // nasumicno generisanje brojeva 0 ili 1
		    brojBacanja--;  // posle svakog bacanja, smanjuje se ukupan broj bacanja za 1
		}
		// ispis koliko puta smo dobili broj 0 (pismo) a koliko broj 1 (glava)
		System.out.println("Pismo smo dobili " + pismo + " puta, a glavu smo dobili " + glava + " puta.");
	}
}
