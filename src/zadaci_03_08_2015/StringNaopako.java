package zadaci_03_08_2015;

import java.util.Scanner;

public class StringNaopako {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese
		 neki string te mu vraæa taj isti string naopako.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite string: ");
		
		String str = input.nextLine();         // unos stringa 
		
		String strNaopako = "";
		
		for(int i=str.length()-1; i>=0; i--) { // petlja koja ide kroz string naopako
			strNaopako += str.charAt(i);       // unos karaktera iz stringa u novi prazan string
		}
		System.out.println("Uneseni string naopako: " + strNaopako); // ispis novog stringa u konzolu
		
		input.close();
	}
	
}
