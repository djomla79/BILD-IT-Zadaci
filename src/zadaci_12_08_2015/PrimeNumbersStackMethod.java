package zadaci_12_08_2015;

import java.util.Scanner;
import java.util.Stack;

public class PrimeNumbersStackMethod {

	public static void main(String[] args) {
		/*
		 (Displaying the prime numbers)
		 Write a program that displays all the prime numbers less than 120 in decreasing order.
		 Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...)
		 and retrieve and display them in reverse order.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj (120): ");
		
		int broj = input.nextInt();      // unos broja

		Stack<Integer> primarni = new Stack<>();

		for (int i = 2; i < broj; i++) { // petlja koja ide od 2 do unesenog broja
			if (isPrime(i)) {            // ako su brojevi primarni
				primarni.add(i);         // ubaci ih u listu (stack)
			}
		}
		System.out.println("Prosti brojevi od najviseg broja ka najmanjem su: ");
		
		for (int i=primarni.size()-1; i>=0; i--) {  // petlja koja ide kroz listu primarni od kraja prema naprijed
			System.out.print(primarni.get(i) + " ");// ispis svih brojeva iz liste u konzolu
		}
		
		input.close();
	}
    /** Metoda koja vraca da li je broj primarni ili ne */
    public static boolean isPrime(int broj) {
    	                         
        for (int i = 2; i < broj; i++) { // petlja koja provjerava da li je broj primaran
            if (broj % i == 0) {         // ako je broj nije primaran 
                return false;            // vrati false
            }
        }
        return true;                     // ako je primaran, vraca true
    }
}	