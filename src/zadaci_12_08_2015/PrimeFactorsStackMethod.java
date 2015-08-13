package zadaci_12_08_2015;

import java.util.Scanner;
import java.util.Stack;

public class PrimeFactorsStackMethod {

	public static void main(String[] args) {
		/*
		 (Displaying the prime factors) Write a program that prompts the user to enter
		 a positive integer and displays all its smallest factors in decreasing order.
		 For example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2.
		 Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5)
		 and retrieve and display them in reverse order.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite broj (120): ");
		
		int broj = input.nextInt();            // unos broja
		
		Stack<Integer> faktori = new Stack<>();
		
		int n = 2;
		
		while(broj % 2 == 0) { // dok je broj djeljiv sa 2 petlja se 'vrti'
			broj /= n;         // broj dijelimo sa n (2)
			faktori.add(n);    // dodajemo n (2) u listu
		}
		for(int i=3; i<=broj; i=i+2){ // petlja koja ide od 3 do unesenog broja, svaki drugi (bez 2)
	        while(broj % i == 0){     // dok je broj djeljiv sa i petlja se 'vrti'
	        	broj /= i;            // broj podijeli sa i
	            n = i;                // n postaje taj broj
	            faktori.add(n);       // dodajemo taj broj (n) u listu
	        }
	    }
		
		System.out.println("Faktori od najviseg broja ka najmanjem su: ");
		
		for (int i=faktori.size()-1; i>=0; i--) {  // petlja koja ide kroz listu faktori od kraja prema naprijed
			System.out.print(faktori.get(i) + " ");// ispis svih brojeva iz liste u konzolu
		}
		
		input.close();
	}
}