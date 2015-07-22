package zadaci_21_07_2015;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadCharsWordsLines {

	public static void main(String[] args) throws IOException {
		
		/*
		 Napišite program koji æe brojati broj karaktera, rijeèi i linija teksta u nekom fileu.
		 Rijeèi trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u vaš program.
		*/
		
		File file = new File("test1.txt"); // ucitavanje fajla, po zelji ubaciti fajl :)
		
		Scanner input = new Scanner(file);
		
		int wordsCount = 0;
		int linesCount = 0;
		int charsCount = 0;
		String chars, wordline;
		// petlja provjerava da li u fajlu postoje karakteri i broji ih
		while(input.hasNext()) {
			chars = input.next();
			if(chars.length()==1) {
			charsCount++; // brojac karaktera iz fajla
			}
		}
		
		input.close();
		input = new Scanner(file);
		// petlja provjerava da li u fajlu postoje rijeci i broji ih
		while(input.hasNext()) {
			wordline = input.next();
			wordsCount++; // brojac rijeci iz fajla
		}
		
		input.close();
		input = new Scanner(file);
		// petlja provjerava da li u fajlu postoje recenice i broji ih
		while(input.hasNext()) {
			wordline = input.nextLine();
			linesCount++; // brojac recenica iz fajla
			System.out.println(wordline + " "); // ispis texta iz fajla
		}
		// ispis broja karaktera, rijeci i recenica iz fajla
		 System.out.println("\nBroj karaktera fajla je: " + charsCount + "\nBroj rijeci u fajlu je: " + wordsCount + "\nBroj linija u fajlu je: " + linesCount);
		input.close();
	}

}
