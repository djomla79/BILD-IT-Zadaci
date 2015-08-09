package zadaci_08_08_2015;

public class MatricaNajvise1uReduKoloni {

	public static void main(String[] args) {
		/*
		 (Largest row and column) Write a program that randomly fills in 0s and 1s into
		 a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
		 most 1s. Here is a sample run of the program:
		 0011
		 0011
		 1101
		 1010
		 The largest row index: 2
		 The largest column index: 2
		 */
		
		int [][] matrix = new int [4][4];
		
		System.out.print("Matrica:" + "\n"); 
		for(int i=0; i<matrix.length; i++) {          // petlja za ispis matrice u konzolu
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*2); // punjenje redova i kolona matrice nasumicno gen. brojevima 0 i 1
				System.out.print(matrix[i][j] + " ");  // ispis 
	        }
        System.out.println();                          // prebacivanje u sledeci red
		}
		
		System.out.println();
		
		int sumaR = 0, sumaK = 0, totalSumaR, totalSumaK, indexR = 0, indexK = 0;
		
		for(int j=0; j<matrix[0].length; j++) {
			sumaR += matrix[0][j];                     // suma reda matrice
		}
		
		for(int i=0; i<matrix.length; i++) {
			sumaK += matrix[i][0];                     // suma kolona matrice
		}
		
		for(int i=1; i<matrix.length; i++) {
			totalSumaR = 0;
			totalSumaK = 0;
			for(int j=0; j<matrix[i].length; j++) {
				totalSumaR += matrix[i][j];            // suma svih redova matrice
				totalSumaK += matrix[i][j];            // suma svih kolona matrice
				if(totalSumaR > sumaR) {               // ako bilo koji red matrice ima vecu sumu od sume prvog reda matrice
					sumaR = totalSumaR;                // taj red postaje red sa najvecom sumom
					indexR = i;                        // index na kome se nalazi taj red matrice
				}
				if(totalSumaK > sumaK) {               // ako bilo koja kolona matrice ima vecu sumu od sume prve kolone matrice
					sumaK = totalSumaK;                // ta kolona postaje kolona sa najvecom sumom
					indexK = i;                        // index na kome se nalazi ta kolona matrice
				}
			}
		}                                              // ispis indexa reda i kolone sa najvecom sumom u matrici
		System.out.println("Najveci index reda je: " + indexR + "\nNajveci index kolone je: " + indexK);
	}	
}
