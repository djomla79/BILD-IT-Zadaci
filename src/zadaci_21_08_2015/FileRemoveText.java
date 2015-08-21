package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRemoveText {
	
	private static Scanner input;

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 Write a program that removes all the occurrences of a specified string from a text file.
		 For example, invoking java Exercise12_11 John filename removes the string John from the specified file.
		 Your program should get the arguments from the command line.
		 */
		
		input = new Scanner(System.in);
		
		System.out.print("Unesite ime fajla: ");

		String ime = input.next();               // unos imena fajla

		File file = new File(ime);               // kreiranje objekta File

		while(!file.exists()) {                  // dok unos (fajl) ne postoji
			System.out.println("Greska! File ne postoji!");
			System.out.print("Unesite ime fajla: ");
			ime = input.next();                  // ponovni unos imena fajla
			file = new File(ime);
		}
		
		System.out.print("Unesite rijec koju zelite izbrisati iz fajla: ");
		
		String strB = input.next();              // unos rijeci koju zelimo izbrisati iz texta
		
		String str = "", strN = "";
		
		input = new Scanner(file);
		
		System.out.println("\nText iz fajla: \n");
		
		while(input.hasNextLine()) {            // petlja radi dok ima recenica u fajlu
			
			str = input.nextLine();             // string str postaje string iz fajla
			
			System.out.println(str + " ");      // ispis recenica iz fajla
			
			str = str.replaceAll(strB, "");     // brisemo sva pojavljivanja rijeci u recenici
			
			strN += str + "\n";                 // ubacujemo string str u novi string strNovi
			
		}
		
		System.out.println("\nText iz fajla bez rijeci: " + strB + "\n");
		
		System.out.print(strN);                 // ispis novog stringa bez unesene rijeci
		
		input.close();
		
	}
}
