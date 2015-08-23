package zadaci_22_23_08_2015;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class CountWordsFromAddress {
	
	private static Scanner input;

	public static void main(String[] args) {
		/*
		 Write a program that counts the number of words in President Abraham Lincoln’s
		 Gettysburg address from http://cs.armstrong.edu/liang/data/ Lincoln.txt.
		 */
		
		String adresa = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		
		try {
			
			URL url = new URL(adresa);                // kreiranje objekta url sa adresom
			
			input = new Scanner(url.openStream());
			
			int brojac = 0;
			
			while(input.hasNext()) {                  // petlja radi dok u fajlu ima space polja
				
				String rijeci = input.next();         // rijeci iz texta postaju string rijeci
				brojac++;                             // brojac rijeci u textu fajla
				                                      // ispis rijeci u konzolu
				System.out.print("Rijeci iz texta: " + rijeci);
				
			}
			                                          // broj rijeci u textu fajla
			System.out.println("Broj rijeci u textu je: " + brojac);
			
		} catch(IOException ex) {                     // 'hvatanje' i ispis greske
			
			System.out.println(ex.getMessage());
			
		}
		
	}
	
}
