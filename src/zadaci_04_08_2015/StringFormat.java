package zadaci_04_08_2015;

import java.util.Scanner;

public class StringFormat {

	public static void main(String[] args) {
		/*
		 Napisati metodu sa sljedeæim headerom:
		 public static String format(int number, int width)
		 koja vraæa string broja sa prefiksom od jedne ili više nula.
		 Velièina stringa je width argument.
		 Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034,
		 ukoliko pozovemo format(34, 5) metoda vraæa 00034.
		 Ukoliko je uneseni broj veæi nego width argument, metoda vraæa samo string broja.
		 Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		
		int broj = input.nextInt();   // unos broja  
		
		System.out.print("Unesite duzinu stringa: ");
		
		int duzina = input.nextInt(); // unos duzine stringa
		
		format(broj, duzina);         // pozivanje metode
		
		input.close();
	}
	/** Metoda koja prima dva argumenta (int) i vraca string */
	public static String format(int num, int width) {
		
		String str = Integer.toString(num); // pretvaranje unesenog broja u string
		
		int duzina = str.length();          // duzina stringa unesenog broja
		
		String novi = "";
		
		String nule = "0";
		
		for(int i=duzina; i<width; i++) {   // petlja koja ide od broja duzine stringa do unesene duzine stringa
			novi += nule;                   // punimo prazan string novi sa nulama dok se petlja 'vrti'
		}
		for(int i=0; i<duzina; i++) {       // petlja koja kroz duzinu stringa za uneseni broj
			novi += str.charAt(i);          // i ubacuje sve karaktere (brojeve) iz stringa u string novi
		}
		
		if(duzina > width) {                // ako je duzina stringa (unesenog broja) veca od unesene duzine stringa
			System.out.println(str);        // stampa se taj string (uneseni broj)
		} else {                            // a ako nije stampa se string novi
			System.out.println("Broj sa prefiksima 0: " + novi);
		}
		return str;                         // vraca se vrijednost stringa
	}
}
