package zadaci_20_07_2015;

import java.util.Scanner;

public class SuglSamogBrojac {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese string
		 te mu ispište broj samoglasnika i suglasnika u datom stringu.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite rijec ili recenicu: ");
		
		String rec = input.nextLine();
		String samoglasnici = "AaEeIiOoUu";
		String suglasnici = "BbCcDdFfGgHhJjKkLlMmNnPpRrSsTtVvXxYyZz";
		int samog = 0;
		int sugla = 0;
		// petlja kojom nalazimo samoglasnike u unesenoj rijeci/recenici
		for(int i=0; i<rec.length(); i++){
			for(int j=0; j<samoglasnici.length(); j++){
				
				char samoglasnik = samoglasnici.charAt(j);
				
				char znak = rec.charAt(i);
				
				if(znak == samoglasnik){
					samog++; // brojac koji broji koliko se puta samoglasnici ponavljaju u rijeci/recenici
				} 
			}	
		}
		// petlja kojom nalazimo suglasnike u unesenoj rijeci/recenici
		for(int i=0; i<rec.length(); i++){
			for(int j=0; j<suglasnici.length(); j++){
				
				char suglasnik = suglasnici.charAt(j);
				
				char znak = rec.charAt(i);
				
				if(znak == suglasnik){
					sugla++; // brojac koji broji koliko se puta suglasnici ponavljaju u rijeci/recenici
				} 
			}	
		}
		// ispis
		System.out.println("\nBrojevi samoglasnika: " + samog + "\nBrojevi suglasnika: " + sugla);
		input.close();
		
	}

}
