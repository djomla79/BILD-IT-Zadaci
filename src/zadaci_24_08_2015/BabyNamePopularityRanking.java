package zadaci_24_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BabyNamePopularityRanking {

	private static Scanner input;

	public static void main(String[] args) throws Exception {
		/*
		 The popularity ranking of baby names from years 2001 to 2010 is downloaded from
		 www.ssa.gov/oact/babynames and stored in files named
		 babynameranking2001.txt, babynameranking2002.txt ,..., babynameranking2010.txt.
		 Each file contains one thousand lines. Each line contains a ranking, a boy’s name,
		 number for the boy’s name, a girl’s name, and number for the girl’s name.
		 For example, the first two lines in the file babynameranking2010.txt are as follows:
		 1 Jacob 21,875 Isabella 22,731
		 2 Ethan 17,866 Sophia 20,477
		 So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s name Ethan
		 and girl’s name Sophia are ranked #2. 21,875 boys are named Jacob and 22,731 girls are named Isabella.
		 Write a program that prompts the user to enter the year, gender, and followed by a name,
		 and displays the ranking of the name for the year. Here is a sample run:
		 
		 Enter the year: 2010
		 Enter the gender: M
		 Enter the name: Javier
		 Javier is ranked #190 in year 2010
		 
		 Enter the year: 2010
		 Enter the gender: F
		 Enter the name: ABC
		 The name ABC is not ranked in year 2010
		 */
		
		input = new Scanner(System.in);
		
		boolean isOn = true;
		
		int godina = 0;
		
		do {
			
			try {
				
				System.out.print("Unesite godinu (2001-2010): ");
				
				godina = input.nextInt();           // unesite godinu
				
				/* Dok je unos pogresan, unos se vrsi ponovo */
				while(godina<2001 || godina > 2010) {
					System.out.println("Unos pogresan!");
					System.out.print("\nUnesite godinu ponovo (2001-2010): ");
					godina = input.nextInt();
				}
				
				String boy = "", girl = "";
				int broj = 0;
				
				System.out.print("Unesite pol (M - musko, F - zensko): ");
				char pol = input.next().charAt(0);  // unos pola
				
				/* Dok je unos pogresan, unos se vrsi ponovo */
				while(pol != 'M' && pol != 'F' && pol != 'm' && pol != 'f') {
					System.out.println("Pogresan unos!");
					System.out.print("Unesite pol ponovo (M ili F): ");
					pol = input.next().charAt(0);
				}
				
				System.out.print("Unesite ime: ");  // unos imena
				String ime = input.next();
				
				File file = new File("babynameranking" + godina + ".txt"); // kreiranje objekta file
				
				input = new Scanner(file);
				
				while(input.hasNext()) {            // petlja radi dok ima space polja u fajlu
					
					broj = input.nextInt();         // int broj se dodjeljuje broj iz fajla
					
					boy = input.next();             // stringu boy se dodjeljuju ime iz fajla
				
					input.nextInt();
					
					girl = input.next();            // stringu girl se dodjeljuje ime iz fajl
					
					input.nextInt();
					
					/** Ako unos pola i imena odgovara imenu iz fajla, vrsi se ispis
					 * tog imena iz fajla i broja na kome se nalazi za unesenu godinu */
					if(Character.toUpperCase(pol) == 'M' && ime.equalsIgnoreCase(boy)) {
						
						System.out.println(boy + " je broj: " + broj + " u godini " + godina);
						break;
						
					} else if(Character.toUpperCase(pol) == 'F' && ime.equalsIgnoreCase(girl)) {
						
						System.out.println(girl + " je broj: " + broj + " u godini " + godina);
						break;
						
					} 
					
				}
				
				if(ime.length() == 0) {             // ako imena nema, ispis u konzolu
					
					System.out.println("Ime " + ime + " nije nadjeno u godini " + godina);							
				}
				
				isOn = false;                       // uslov ispunjen, petlja prekida sa radom
				
				/** Hvatanje gresaka i ispis u konzolu */
				} catch(FileNotFoundException ex) {
					
					System.out.println("File ne postoji! Pokusajte ponovo.");
					input.nextLine();
					
				} catch(InputMismatchException ex) {
					
					System.out.println("Pogresan unos! Pokusajte ponovo.");
					input.nextLine();
					   
				} 
			
		} while(isOn);                              // petlja radi dok se uslov ne ispuni
	}
	
}
