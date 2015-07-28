package zadaci_28_07_2015;

import java.util.Scanner;

public class BrojacKarakteraUStringu {

	public static void main(String[] args) {
		/*
		 Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu.
		 Metoda treba da koristi sljedeæi header: public static int count(String str, char a).
		 Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2.
		 Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji u datom
		 stringu te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite rijec: ");
		// unos rijeci
		String rijec = input.next();
		
		System.out.print("Unesite slovo: ");
		// unos slova
		char slovo = input.next().charAt(0);
		// pozivanje metode
		System.out.println("Slovo " + slovo + " se u unesenoj rijeci ponavlja " + count(rijec, slovo) + " puta.");
		
		input.close();
	}
	/** Metoda koja vraca broj ponavljanja karaktera u stringu */
	public static int count(String str, char a) {
		
		int brojac = 0;
		    // petlja koja prolazi kroz uneseni string
		for(int i=0; i<str.length(); i++) {
			// ako je bilo koji karakter u unesenom stringu jednak trazenom karakteru
			if(Character.toString(str.charAt(i)).contains(Character.toString(a))) {
				brojac++;  // onda brojac broji koliko se trazeni karakter puta nalazi u stringu
			}
		}
		return brojac;     // vraca se ukupan broj ponavljanja trazenog karaktera u stringu
	}
	
}
