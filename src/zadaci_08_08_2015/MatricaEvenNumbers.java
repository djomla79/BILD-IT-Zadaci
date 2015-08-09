package zadaci_08_08_2015;

public class MatricaEvenNumbers {

	public static void main(String[] args) {
		/*
		 (Even number of 1s)
		 Write a program that generates a 6-by-6 two-dimensional matrix filled with 0s and 1s,
		 displays the matrix, and checks if every row and every column have an even number of 1s.
		 */
		
		int [][] matrix = new int [6][6];
		int sumaR = 0, sumaK = 0;
		boolean parni = true;
		
		System.out.print("Matrica:" + "\n"); 
		for(int i=0; i<matrix.length; i++) {          // petlja za ispis matrice u konzolu
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random()*2); // punjenje redova i kolona matrice nasumicno gen. brojevima 0 i 1
				System.out.print(matrix[i][j] + " ");  // ispis 
	        }
        System.out.println();                          // prebacivanje u sledeci red
		}
		
		System.out.println();
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				sumaR += matrix[i][j];					// suma redova matrice
				sumaK += matrix[j][i];					// suma kolona matrice
			}
			if(sumaR % 2 == 0 && sumaK % 2 == 0) {      // ako su sume redova i kolona djeljive sa 2 (parne)
				parni = true;                           // vraca true
				continue;
			} else {                                    // ako nisu
				parni = false;                          // vraca false
				break;
			}

		}
		if(parni) {                                     // ako je uslov ispunjen, true
			System.out.println("Svi redovi i kolone u matrici su parni.");   // ispis u konzolu
		} else {                                        // ako uslov nije ispunjem, false
			System.out.println("Svi redovi i kolone u matrici nisu parni."); // ispis u konzolu
		}
	}
}
