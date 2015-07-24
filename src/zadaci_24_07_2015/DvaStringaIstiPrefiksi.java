package zadaci_24_07_2015;

import java.util.Scanner;

public class DvaStringaIstiPrefiksi {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese 2 stringa te ispisuje najve�i
		 zajedni�ki prefix za ta dva stringa, ukoliko isti postoji.
		 Na primjer, ukoliko korisnik unese sljede�a dva stringa "Dobrodo�li u Dubai"
		 i "Dobrodo�li u Vankuver" program treba da ispi�e:
		 Najve�i zajedni�ki prefix za dva stringa je "Dobrodo�li u".
		 */
		
		Scanner input = new Scanner(System.in);
		
		String noviStr = "";
		
		System.out.print("Unesite prvu rijec ili recenicu: ");
		// unos prve rijeci ili recenice
		String str1 = input.nextLine();
		
		System.out.print("Unesite drugu rijec ili recenicu: ");
		// unos druge rijeci ili recenice
		String str2 = input.nextLine();
		// ako je drugi string veci od prvog, mijenjamo im mjesta
		if(str2.length() > str1.length()) {
			String temp = str2;   // privremeni string uzima vrijednost drugog stringa
			str2 = str1;          // drugi koji je sad prazan uzima vrijednost prvog i postaje prvi
			str1 = temp;          // prvi koji je sad prazan uzima vrijednost privremenog tj. drugog i postaje drugi
		}
		// petlja koja prolazi kroz drugi string, manji string
		for(int i=0; i<str2.length(); i++) {
			if(str1.charAt(i) == str2.charAt(i)) { // ako stringovi imaju jednake nizove karaktera
				noviStr += str1.charAt(i);         // ubacujemo te karaktere u prazan string
			}
		}
		// ako je taj novi string prazan, onda stringovi nemaju zajednickih karaktera
		if(noviStr.length() == 0 ) {
			System.out.println("Stringovi nemaju zajednicki prefix!");
		} else {     // ako imaju onda se ispisuje u konzolu
		System.out.println("Najveci zajednicki prefix za dva stringa je: " + noviStr);
		}
		input.close();
	}

}
