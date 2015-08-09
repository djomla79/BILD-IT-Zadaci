package zadaci_08_08_2015;

import java.util.Arrays;

public class MatricaEmployee {

	public static void main(String[] args) {
		/*
		 (Compute the weekly hours for each employee) Suppose the weekly hours for all
		 employees are stored in a two-dimensional array. Each row records an employee’s
		 seven-day work hours with seven columns. For example, the following
		 array stores the work hours for eight employees. Write a program that displays
		 employees and their total hours in decreasing order of the total hours.
		 */
		

        int[][] sati = new int[][]{                          // matrica sa satima radnika
        		{ 2, 4, 3, 4, 5, 8, 8},      
        		{ 7, 3, 4, 3, 3, 4, 4},      
        		{ 3, 3, 4, 3, 3, 2, 2},      
        		{ 9, 3, 4, 7, 3, 4, 1},      
        		{ 3, 5, 4, 3, 6, 3, 8},      
        		{ 3, 4, 4, 6, 3, 4, 4},      
        		{ 3, 7, 4, 8, 3, 8, 4},      
        		{ 6, 3, 5, 9, 2, 7, 9}};  

        int [] ukupnoSati = new int[8];                     // niz integera u koji storujemo ukupne sate radnika
        
        System.out.print("Broj sati svih zaposlenika: \n");
        System.out.println("\tDani: M  T  W  Th F  Sa Su");
        for (int i=0; i<sati.length; i++) {
        	System.out.print("Zaposlenik " + (i+1) + ": ");
            for (int j=0; j<sati[i].length; j++) {  
            	ukupnoSati[i] += sati[i][j];                // unos ukupnih sati radnika u niz
            	System.out.print(sati[i][j] + "  ");        // ispis matrice sa satima radnika
             }
            System.out.println();
        }
             
        Arrays.sort(ukupnoSati);                            // sortiranje niza sa ukupnim satima radnika
        
        System.out.print("\nUkupni sati zaposlenih \nod najvise do najnize: ");
        for (int i=ukupnoSati.length-1; i>=0; i--) {        // ispis sortiranog niza u opadajucem nizu   
        	System.out.print(ukupnoSati[i] + " ");
        }
                 
	}
	
}
