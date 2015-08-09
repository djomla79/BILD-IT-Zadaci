package zadaci_08_08_2015;

public class SortiranjeMatrice {

	public static void main(String[] args) {
		/*
		 (Sort two-dimensional array) Write a method to sort a two-dimensional array
		 using the following header:
		 
		 public static void sort(int m[][])
		 
		 The method performs a primary sort on rows and a secondary sort on columns.
		 For example, the following array
		 {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
		 will be sorted to
		 {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
		 */
		int[][] sati = new int[][]{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
		
		System.out.println("Matrica: \n");
		for (int i=0; i<sati.length; i++) {
			for(int j=0; j<sati[i].length; j++) {
			System.out.print(sati[i][j] + " ");  // ispis matrice 
			}
			System.out.println();
		}
		System.out.println();
		
		sort(sati);                             // pozivanje metode
		
	}
	/** Metoda koja prima argument matricu, sortira je i ispisuje */
	public static void sort(int[][] m) {
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m.length-1; j++) {
	    	  if(m[j][0] > m[j+1][0]) {      // ako je prvi red matrice veci od sledeceg (prvi index veci od drugog)
	    		  int temp = m[j][0];
	    		  int temp1 = m[j][1];
	    		  m[j][0]= m[j+1][0];        // mijenjamo im mjesta
	    		  m[j][1]= m[j+1][1];
	    		  m[j+1][0] = temp;
	    		  m[j+1][1] = temp1;
	    	  }
	    	  if(m[j][0] == m[j+1][0]) {     // ako prvi i drugi red matrice imaju iste pocetne indexe
	    		  if(m[j][1] > m[j+1][1]) {  // i ako je sledeci red veci od reda posle njega 
	    			  int temp3 = m[j][1];
	    			  m[j][1] = m[j+1][1];   // mijenjamo im mjesta
	    			  m[j+1][1] = temp3;
	    		  }
	    	  }
			}
		}
		System.out.println("Sortirana matrica: \n");
		for(int i=0; i<m.length; i++) {          
			for (int j =0;j<m[i].length;j++) {
				System.out.print(m[i][j] + " "); // ispis sortirane matrice u konzolu
			}
			System.out.println();
		}
	}
}
