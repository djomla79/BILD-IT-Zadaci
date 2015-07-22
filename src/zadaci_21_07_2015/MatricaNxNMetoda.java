package zadaci_21_07_2015;

import java.util.Scanner;

public class MatricaNxNMetoda {

	public static void main(String[] args) {
		
		/*
		 Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
		 public static void printMatrix(int n)
		 Svaki element u matrici je ili 0 ili 1, generisan nasumièno.
		 Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.
		 */
		
		Scanner input = new Scanner(System.in);
		
        System.out.println("Unesite broj: ");
    
        int broj = input.nextInt(); // unos argumenta
    
	    ispisMatrice(broj);  // pozivanje i ispis metode
	    
	    input.close();
	
	}
	/** Metoda n x n matrice*/
	public static void ispisMatrice(int n) {
		
		int [][] matrix = new int [n][n]; // prosledjivanje argumenta u matricu kojim odredjujemo
		                                  // broj redova i kolona u matrici
		System.out.print("Matrica:" + "\n"); 
		for (int i=0; i<matrix.length; i++) {  // petlja za ispis matrice u konzolu
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*2); // punjenje redova i kolona matrice nasumicno gen. brojevima 0 i 1
				System.out.print(matrix[i][j] + " "); // ispis 
	        }
        System.out.println(); // prebacivanje u sledeci red
		}
	}

}