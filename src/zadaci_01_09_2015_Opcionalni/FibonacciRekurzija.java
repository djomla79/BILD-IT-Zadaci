package zadaci_01_09_2015_Opcionalni;

import java.util.Scanner;

public class FibonacciRekurzija {

	public static void main(String[] args) {
		/*
		 Rewrite the fib method in Listing 18.2 using iterations.
		 Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2) and fib(n - 1) first.
		 Write a test program that prompts the user to enter an index and displays its Fibonacci number.
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesi broj index-a: ");
		
		int n = input.nextInt(); // unos broja
		
		while(n < 0) {           // petlja radi dok se uslov ne ispuni
			System.out.println("Unos ne moze biti negativan!");
			System.out.print("Unesi broj index-a: ");
			n = input.nextInt();
		}
		
		System.out.println("Fibonnacijev broj na index-u: " + n + " je: " + fib(n)); // pozivanje metode
		
		input.close();
	}
	/** Rekurzivna metoda fibonacijevog niza */
	public static long fib(long n) {
		
		if(n == 0) {                        // ako je broj 0
			return 0;                       // vraca vrijednost 0
		} else if(n == 1) {                 // ako je broj 1
			return 1;                       // vraca vrijednost 1
		} else {                            // ako je broj veci od 1
			return fib(n - 2) + fib(n - 1); // vraca vraca vrijednost po formuli (gdje metoda poziva samu sebe - rekurzivna metoda)
		}
	}
	
}
