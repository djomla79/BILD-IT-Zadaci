package zadaci_29_07_2015;

import java.util.Scanner;

public class ZbirProsjekPozNegBrojevi {

	public static void main(String[] args) {
		/*
		 Napisati program koji ucitava neodredjen broj cijelih brojeva,
		 odredjuje koliko je pozitivnih brojeva uneseno, koliko je 
		 negativnih brojeva uneseno i izracunava sumu i prosjek svih 
		 unesenih brojeva. Program prekida sa radom kada korisnik unese 0.
         
         Na primjer, ukoliko korisnik unese 1 2 -1 3 0
         program treba da ispiše da je broj pozitivnih brojeva 3,
         negativnih brojeva 1, suma ili zbir su 5.0
         a prosjek svih brojeva je 1.25.
		 */
		
		Scanner input = new Scanner(System.in);
		
		int suma = 0, brojac = 0, broj = 1;
		int pozitivni = 0, negativni = 0;
		
		System.out.print("Unesite brojeve (unos prekida sa 0): ");
		
		while (broj != 0) {         // petlja se 'vrti' do se ne unese 0
			broj = input.nextInt(); // unos brojeva
			suma += broj;           // suma unesenih brojeva 
			brojac++;               // brojac, broj unesenih brojeva
		    if (broj > 0) {         // ako je uneseni broj veci od 0
				pozitivni++;        // brojac koji broji te brojeve
			}
			if (broj < 0) {         // ako je uneseni broj manji od 0
				negativni++;        // brojac broji te brojeve
		    }
        }
		    double prosjek = suma / (double)brojac;                             // prosjek svih unesenih brojeva
			
		    System.out.println("Ukupan zbir svih brojeva je: " + suma);         // ispis ukupnog zbira
			
			System.out.println("Prosjek svih unesenih brojeva je: " + prosjek); // ispis prosjeka
			
			System.out.println("Broj pozitivnih brojeva je: " + pozitivni);     // ispis svih pozitinih unesenih br.
	
			System.out.println("Broj negativnih brojeva je: " + negativni);     // ispis svih negativnih unesenih br.
	    
			input.close();   
	}
}
