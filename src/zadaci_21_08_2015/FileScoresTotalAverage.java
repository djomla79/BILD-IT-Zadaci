package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScoresTotalAverage {

	private static Scanner input;

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 Suppose that a text file contains an unspecified number of scores separated by blanks.
		 Write a program that prompts the user to enter the file, reads the scores from the file,
		 and displays their total and average.
		 */
		
		input = new Scanner(System.in);
		
		System.out.print("Unesite ime fajla: ");

		String ime = input.next();              // unos imena fajla

		File file = new File(ime);

		while(!file.exists()) {                 // dok unos (fajl) ne postoji
			System.out.println("File ne postoji!");
			System.out.print("Unesite ime fajla: ");
			ime = input.next();                 // ponovni unos imena fajla
			file = new File(ime);
		}

		input = new Scanner(file);

		int suma = 0, broj = 0, brojac = 0;;
		
		while(input.hasNext()) {                // petlja radi dok u fajlu postoji prazno polje izmedju elem.

			broj = input.nextInt();             // int broj postaje int iz fajla
			suma += broj;                       // suma svih integera iz fajla
			brojac++;                           // brojac integera iz fajla

			System.out.print(broj + " ");       // ispis brojeva iz fajla
		}
		
		double prosjek = (double)suma / brojac; // prosjek ukupne sume za sve brojeve
                                                // ispis ukupne sume i njegovog prosjeka
		System.out.println("\nUkupna suma svih brojeva je: " + suma + "\nProsjek sume svih brojeva je: " + prosjek);
		
		input.close();

	}
	
}
