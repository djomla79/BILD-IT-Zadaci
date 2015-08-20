package zadaci_20_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchException {

	public static void main(String[] args) {
		/*
		 Write a program that prompts the user to read two integers and displays their sum.
		 Your program should prompt the user to read the number again if the input is incorrect.
		 */

		Scanner input = new Scanner(System.in);
		
		boolean nastaviUnos = true;
		
		/** Ako unos nije cijeli broj,
		 * ispis greske i vrsi se unos ponovo */
		do {
			try {
				
			System.out.print("Unesite dva cijela broja: ");
			
			int suma = 0;
			int broj1 = input.nextInt();
			int broj2 = input.nextInt();         // unos brojeva 
			suma = broj1 + broj2;
			                                     // ispis sume
			System.out.println("Suma unesenih brojeva je: " + suma);
			
			nastaviUnos = false;                 // uslov ispunjen, prekid rada petlje
			
		    } catch(InputMismatchException ex) { // 'hvatanje' greske
		    	
			   System.out.println("Netacan unos!\nPokusajte ponovo, unesite cijeli broj.");
			   input.nextLine();
			   
		   }
			
		} while(nastaviUnos);                    // petlja radi dok se uslov ne ispuni
		input.close();
		
	}
}
