package zadaci_22_23_08_2015;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class FileProcessScoresOnTheWeb {
	
	private static Scanner input;

	public static void main(String[] args) {
		/*
		 Suppose that the text file on the Web http://cs.armstrong.edu/liang/data/Scores.txt
		 contains an unspecified number of scores.
		 Write a program that reads the scores from the file and displays their total and average.
		 Scores are separated by blanks. 
		 */
		
		String adresa = "http://cs.armstrong.edu/liang/data/Scores.txt";
		
		try {
			
			URL url = new URL(adresa);               // kreiramo objekat url sa adresom
			
			input = new Scanner(url.openStream());
			
			int suma = 0, broj = 0, brojac = 0;
			
			while(input.hasNext()) {                 // petlja radi dok u fajlu ima space polja
				
				broj = input.nextInt();              // int iz fajla postaje int broj
				suma += broj;                        // suma svih brojeva iz fajla
				brojac++;                            // brojac svih brojeva iz fajla
				
				System.out.print(broj + " ");        // ispis brojeva iz fajla
				
			}
			
			double prosjek = (double)suma / brojac;  // prosjek ukupne sume za sve brojeve
                                                     // ispis ukupne sume i njegovog prosjeka
			System.out.println("\nUkupna suma svih brojeva je: " + suma + "\nProsjek sume svih brojeva je: " + prosjek);
			
		} catch(IOException ex) {                    // 'hvatanje' greske i ispis
			
			System.out.println(ex.getMessage());
			
		}
		
	}
	
}
