package zadaci_20_08_2015;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		/*
		 Write a program that meets the following requirements:
		 Creates an array with 100 randomly chosen integers.
		 Prompts the user to enter the index of the array,
		 then displays the corresponding element value.
		 If the specified index is out of bounds, display the message Out of Bounds.
		 */

		Scanner input = new Scanner(System.in);
		
		boolean isOn = true;
		
		/** Ako je unos van granica niza,
		 * ispis greske i vrsi se unos ponovo */
		do {
			try{
				
				int[] niz = new int[100];
				int index = 0;
				
				for(int i=0; i<100; i++) {
					niz[i] = (int)(Math.random()*2);        // unos brojeva u niz
				}
				
				System.out.print("Unesite index niza: ");
				index = input.nextInt();                    // unos indexa
				                                            // ispis u konzolu
				System.out.println("Element niza sa index-om " + index + " je: " + niz[index]);
				
				isOn = false;                               // uslov ispunjen, prekid rada petlje
				
			} catch(ArrayIndexOutOfBoundsException ex) {    // 'hvatanje' greske
				System.out.println("Uneseni index je van granica!\nUnesite index ponovo.\n");
				input.nextLine();
			}
			
		} while(isOn);                                      // petlja radi dok se uslov ne ispuni
		input.close();
		
	}
	
}
