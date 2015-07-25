package zadaci_25_07_2015;

import java.util.Scanner;

public class BuducaVrijednostInvesticije {

	public static void main(String[] args) {
		/*
		 Napisati program koji u�itava iznos investicije, godi�nju interesnu stopu
		 i broj godina te vra�a budu�u vrijednost investicije koriste�i se sljede�om formulom:
		 buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12.
		 Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godi�nju interesnu stopu i 1
		 kao broj godina program vam vra�a 1032.98 kao buducu vrijednost investicije.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite iznos investicije: ");
		double iznos = input.nextDouble();               // unos iznosa investicije
		
		System.out.print("Unesite godisnju interesnu stopu: ");
		double interesnaStopa = input.nextDouble();      // unos godisnje interesne stope
		
		System.out.print("Unesite broj godina: ");
		int godina = input.nextInt();                    // unos godina
		
		double mjesecnaStopa = interesnaStopa/1200;      // formula mjesecne interesne stope
		
		double buducaVrijednost = iznos*Math.pow(1 + mjesecnaStopa, godina*12); // formula buduce vrijednosti inv.
		
		System.out.println("\nBuduca vrijednost investicije je: " + buducaVrijednost); // ispis u konzolu
		
		input.close();
	}

}
