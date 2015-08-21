package zadaci_21_08_2015;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadCharsWordsLines {

	public static void main(String[] args) throws IOException {
		
		/*
		 Write a program that will count the number of characters, words, and lines in a file.
		 Words are separated by whitespace characters. The file name should be passed as a command-line argument
		 The program displays the number of characters, words, and lines in the given file.
		*/
		
		File file = new File("test1.txt"); // ucitavanje fajla, po zelji
		
		Scanner input = new Scanner(file);
		
		int wordsCount = 0, linesCount = 0, charsCount = 0;
		
		String chars, wordline;
		
		while(input.hasNext()) {           // petlja provjerava da li u fajlu postoje karakteri i broji ih
			chars = input.next();
			if(chars.length() == 1) {
			charsCount++;                  // brojac karaktera iz fajla
			}
		}
		
		input.close();
		input = new Scanner(file);
		
		while(input.hasNext()) {           // petlja provjerava da li u fajlu postoje rijeci i broji ih
			wordline = input.next();
			wordsCount++;                  // brojac rijeci iz fajla
		}
		
		input.close();
		input = new Scanner(file);
		
		while(input.hasNext()) {           // petlja provjerava da li u fajlu postoje recenice i broji ih
			wordline = input.nextLine();
			linesCount++;                  // brojac recenica iz fajla
			System.out.println(wordline + " "); // ispis texta iz fajla
		}
		                                   // ispis broja karaktera, rijeci i recenica iz fajla
		System.out.println("\nBroj karaktera fajla je: " + charsCount + "\nBroj rijeci u fajlu je: " + wordsCount + "\nBroj linija u fajlu je: " + linesCount);
		
		input.close();
	}

}
