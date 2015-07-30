package zadaci_30_07_2015;

import java.util.Scanner;

public class RegistarskaTablica {

	public static void main(String[] args) {
		/*
		 Pretpostavimo da se registarska tablica za auto sastoji
		 od tri uppercase karaktera i 4 broja u sljedeæem formatu AAA-1234.
		 Napisati program koji nasumièno generiše tablicu.
		 */
		
		Scanner input = new Scanner(System.in);
		
		String regTab = "";     // deklarisanje praznih stringova za registarsku tablicu, karaktere i brojeve
		String karakteri = "";
		String brojevi = "";
		
		String slova = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // string sa svim slovima alfabeta
		
		for(int i=0; i<3; i++) {                     // petlja koja se vrti 3 puta
			char ch = slova.charAt((char)(Math.random()*26)); // nasumicno generisanje karaktera iz stringa slova u petlji
			karakteri += ch;                         // upis 3 nasumicno generisana karaktera iz stringa slova u prazan string karakteri
		}
		
		for(int i=0; i<4; i++) {                     // petlja koja se vrti 4 puta
			int broj = (int)(Math.random()*10);      // generisanje 4 nasumicna broja od 0 do 9
			brojevi += broj;                         // upis 4 nasumicno generisana broja u prazan string brojevi
		}
		regTab = karakteri + "-" + brojevi;          // upis stringa karakteri plus znak - i stringa brojevi u prazan string regTab
		
		System.out.println("Registarska tablica: " + regTab); //  ispis stringa regTab u konzolu
		input.close();
	}

}
