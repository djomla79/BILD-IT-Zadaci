package zadaci_24_08_2015;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ProcessLargeDataset {
	
	private static Scanner input;

	public static void main(String[] args) throws IOException {
		/*
		 A university posts its employees’ salaries at http://cs.armstrong.edu/liang/data/Salary.txt.
		 Each line in the file consists of a faculty member’s first name, last name, rank, and salary.
		 Write a program to display the total salary for assistant professors, associate professors,
		 full professors, and all faculty, respectively, and display the average salary for assistant
		 professors, associate professors, full professors, and all faculty, respectively.
		 */
		
		String adresa = "http://cs.armstrong.edu/liang/data/Salary.txt";
		
		try {
			
			URL url = new URL(adresa);                  // kreiranje objekta url sa adresom
			
			input = new Scanner(url.openStream());
			
			long sumaAssist = 0, sumaAssoci = 0, sumaProf = 0, suma = 0;
			int brojacAssist = 0, brojacAssoci = 0, brojacProf = 0, brojac = 1000;
			
			while(input.hasNext()) {                    // petlja radi dok u fajlu ima space polja
				
				double brAssist = 0, brAssoci = 0, brProf = 0;
				
				input.next();
				input.next();
				String rank = input.next();             // string rank postaje treci string iz fajla (assist, assoc, professor)
				
				if(rank.matches("assistant")) {         // ako string rank odgovara odredjenom stringu
					brAssist = input.nextDouble();      // brAssist postaje broj double iz fajla
					brojacAssist++;                     // brojac se povecava za jedan
				} else if(rank.matches("associate")) {  // a ako string rank odgovara sledecem uslovu
					brAssoci = input.nextDouble();      // brAssoci postaje broj double iz fajla
					brojacAssoci++;                     // brojac se povecava za jedan
				} else if(rank.matches("full")) {       // a ako string rank odgovara trecem uslovu
					brProf = input.nextDouble();        // brProf postaje broj double iz fajla
					brojacProf++;                       // brojac se povecava za jedan
				}
				
				sumaAssist += brAssist;                 // suma svih brojeva za assistant uslov
				sumaAssoci += brAssoci;                 // suma svih brojeva za associate uslov
				sumaProf += brProf;                     // suma svih brojeva za professor uslov
				
				suma = (long)(sumaAssist + sumaAssoci + sumaProf); // ukupna suma za sve uslove
				
			}
			/* Ukupne prosjecne sume za sve uslove */
			double ukupno = suma/brojac, ukupnoProf = sumaProf/brojacProf,
			ukupnoAssoci = sumaAssoci/brojacAssoci, ukupnoAssist = sumaAssist/brojacAssist;
			
			/** Ispis svih uslova u konzolu */
			System.out.print("Ukupna plata za assistant prof: " + sumaAssist +
					         " $\nUkupna plata za associate prof: " + sumaAssoci +
					         " $\nUkupna plata za full prof: " + sumaProf);
			System.out.print(" $\nUkupna plata za sve profesore: " + suma);
			System.out.print(" $\n\nProsjecna plata za assistant prof: " + ukupnoAssist +
					         " $\nProsjecna plata za associate prof: " + ukupnoAssoci +
					         " $\nProsjecna plata za full prof: " + ukupnoProf +
					         " $\nProsjecna plata za sve profesore " + ukupno + " $");
			
		} catch(IOException ex) {                       // 'hvatanje' greske i ispis u konzolu
			
			System.out.println(ex.getMessage());
			
		}
		
	}
}
