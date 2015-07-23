package zadaci_23_07_2015;

import java.util.Arrays;
import java.util.Scanner;

public class IspisSortiranihBrojeva {

	public static void main(String[] args) {
		/*
		 Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu:
		 public static void displaySortedNumbers(double num1, double num2, double num3).
		 Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu. 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite tri broja: ");
		// unos tri broja
		double br1 = input.nextDouble();
		double br2 = input.nextDouble();
		double br3 = input.nextDouble();
		
		displaySortedNumbers(br1, br2, br3);  // pozivanje metode
		
		input.close();
		
	}
	/** Metoda koja sortira brojeve u rastucem nizu */
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		double [] niz = {num1, num2, num3}; // ubacivanje argumenata u niz
		Arrays.sort(niz);                   // sortiranje niza
		System.out.print("Brojevi u rastucem redoslijedu: " + Arrays.toString(niz)); // ispis elemenata niza
	}
	
}
