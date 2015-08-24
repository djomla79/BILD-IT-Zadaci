package zadaci_24_08_2015;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OccurrencesOfEachLetter {

	private static Scanner input;

	public static void main(String[] args) throws IOException {
		/*
		 Write a program that prompts the user to enter a file name
		 and displays the occurrences of each letter in the file.
		 Letters are case-insensitive. Here is a sample run:
		 
		 Enter a filename: Lincoln.txt
		 Number of A's: 56
		 Number of B's: 134
		 ...
		 Number of Z's: 9
		 */

		input = new Scanner(System.in);
		
		System.out.print("Unesite ime filea: ");    // Linkoln.txt
		
		String ime = input.next();
		
		File file = new File(ime);
		
		char[] slova = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int [] brojac = new int[26];
		
		input = new Scanner(file);
		
		System.out.println();
		
		while(input.hasNext()) {                       // petlja radi dok ima space polja u fajlu
			
			String s = input.nextLine().toLowerCase(); // string s postaje recenica iz fajla
			
			for(int i=0; i<s.length(); i++) {          // za sve karaktere iz stringa s
				
				char slovo = s.charAt(i);              // karakter slovo postaje karakter iz stringa s
				
				for(int j=0; j<brojac.length; j++) {   // za citav niz brojac
				   
					if(slovo == slova[j]) {            // ako je karakter slovo isto sa karakterom iz niza slova
					    brojac[j]++;                   // niz brojac se povecava za jedan za svaku poziciju
				   }
					
				}	
			}
		}
		
		for(int i=0; i<slova.length; i++) {         // za sve karaktere iz niza slova
			                                        // ispis svih karaktera i broj njihovog pojavljivanja
			System.out.println("Broj karaktera '" + slova[i] + "' je: " + brojac[i]);
		}
	}
	
}
