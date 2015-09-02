package zadaci_02_09_2015_Opcionalni;

import java.util.Scanner;

public class SumaBrojevaRekurzija {

	public static void main(String[] args) {
		/*
		 * (Sum the digits in an integer using recursion)
		 * Write a recursive method that computes the sum
		 * of the digits in an integer.
		 * Use the following method header:
		 * 
		 * public static int sumDigits(long n)
		 * 
		 * For example, sumDigits(234) returns 2 + 3 + 4 = 9.
		 * Write a test program that prompts the user
		 * to enter an integer and displays its sum.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Unesi broj: ");
		int n = input.nextInt();
		System.out.println("Suma cifara unesenog broja je: " + sumDigits(n));
		
		input.close();
	}
	
	public static int sumDigits(long n) {
		
		int broj = (int)Math.abs(n);
		int suma = 0;
		
		suma += broj % 10;
		
		if(broj > 0)
		suma += sumDigits(broj /= 10); 

		return suma;
		
	}
}
