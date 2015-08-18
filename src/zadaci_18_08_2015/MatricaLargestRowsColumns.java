package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class MatricaLargestRowsColumns {

	public static void main(String[] args) {
		/*
		 (Largest rows and columns) Write a program that randomly fills in 0s
		 and 1s into an n-by-n matrix, prints the matrix, and finds the rows and
		 columns with the most 1s.
		 (Hint: Use two ArrayLists to store the row and column indices with the most 1s.)
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite velicinu n x n matrice: ");
		int n = input.nextInt();                       // unos n x n matrice n = broj redova i kolona matrice

		int[][] matrix = new int[n][n];
		ArrayList<Integer> maxR = new ArrayList<>();
		ArrayList<Integer> maxK = new ArrayList<>();

		System.out.println("Matrica: ");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				matrix[i][j] = (int)(Math.random()*2); // punjenje matrice integerima 0 i 1
				System.out.print(matrix[i][j] + " ");  // ispis matrice u konzolu
			}
			System.out.println();
		}
		
		int sumaR = 0, sumaK = 0, totalSumaR, totalSumaK, nula = 0;
		
		for(int j=0; j<matrix[0].length; j++) {
			sumaR += matrix[0][j];                     // suma reda matrice
		}
		
		for(int i=0; i<matrix.length; i++) {
			sumaK += matrix[i][0];                     // suma kolona matrice
		}
		for(int i=0; i<matrix.length; i++) {           // za sve elemente matrice
			totalSumaR = 0;
			totalSumaK = 0;
			for(int j=0; j<matrix[i].length; j++) {
				totalSumaR += matrix[i][j];            // suma svih redova matrice
				totalSumaK += matrix[j][i];            // suma svih kolona matrice
				if(totalSumaR > sumaR) {               // ako bilo koji red matrice ima vecu sumu od sume prvog reda matrice
					sumaR = totalSumaR;                // taj red postaje red sa najvecom sumom
					maxR.clear();                      // brisu se stare pozicije redova sa najvecom sumom
					maxR.add(i);                       // ubacivanje broja indexa reda sa najvecom sumom u listu	
				} else if(totalSumaR == sumaR) {       // ako je ukupna suma zadnjeg reda jednak najvecoj sumi reda
					//maxR.clear(); brisu se ostale pozicije redova sa najvecom sumom u listi (ako trazimo samo zadnji red sa najvise 1)
					maxR.add(i);                       // dodaje se krajnja pozicija najvece sume reda u listi
				}
				if(totalSumaK > sumaK) {               // ako bilo koja kolona matrice ima vecu sumu od sume prve kolone matrice
					sumaK = totalSumaK;                // ta kolona postaje kolona sa najvecom sumom
					maxK.clear();                      // brisu se stare pozicije kolone sa najvecom sumom
					maxK.add(i);                       // ubacivanje broja indexa kolone sa najvecom sumom u listu
				} else if(totalSumaK == sumaK) {       // ako je ukupna suma zadnje kolone jednaka najvecoj sumi kolone
					//maxK.clear(); brisu se ostale pozicije kolona sa najvecom sumom u listi (ako trazimo samo zadnju kolonu sa najvise 1)
					maxK.add(i);                       // dodaje se krajnja pozicija najvece sume kolone u listi
				}
			}
		}
		if(maxR.isEmpty()) {                           // ako je lista prazna
			maxR.add(nula);                            // ubaci u listu 0
		}
		System.out.print("Redovi sa najvise jedinica su: ");
		for(int i=0; i<maxR.size(); i++) {
			System.out.print(maxR.get(i) + " ");       // ispis pozicija najvece sume redova iz liste
		}
		if(maxK.isEmpty()) {                           // ako je lista prazna
			maxK.add(nula);                            // ubaci u listu 0
		}
		System.out.print("\nKolone sa najvise jedinica su: ");
		for(int i=0; i<maxK.size(); i++) {
			System.out.print(maxK.get(i) + " ");       // ispis pozicija najvece sume kolona iz liste
		}
		
		input.close();
	}
	
}
