package zadaci_03_08_2015;

import java.util.Scanner;

public class Skolarina {

	public static void main(String[] args) {
		/*
		 Pretpostavimo da �kolarina za godinu dana na fakultetu
		 ko�ta 10.000 i da se pove�ava za 5% svake godine.
		 Godinu dana od danas, �kolarina �e iznositi 10.500.
		 Napisati program koji izra�unava koliko �e �kolarina za godinu dana iznositi kroz 10 godina.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj godina: ");
		
		int broj = input.nextInt();      // unos godina, koliko ce skolarina za toliko godina iznositi
		
		double skolarina = 10000;        // skolarina
		int godina = 0;
		
		while (godina < broj) {          // dok je uneseni broj veci od broja godina
		skolarina = skolarina * 1.05;    // skolarina se uvecava za 5% za svaku iteraciju
		godina++;                        // brojac godina
		}
		                                 // ispis koliko godina i iznos skolarine za uneseni broj godina
		System.out.println("Skolarina za " + godina + " godina/e/u ce biti " + skolarina + " KM.");
	
		input.close();
		}
	}
