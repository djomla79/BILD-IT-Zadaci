package zadaci_28_07_2015;

public class BrojKombinacija {

	public static void main(String[] args) {
		/*
		 Napisati program koji ispisuje sve moguæe kombinacije za biranje dva broja u rasponu od 1 do 7.
		 Takoðer, program ispisuje broj svih moguæih kombinacija. 
		 Dakle, program treba da ispiše sve moguæe parove brojeva u datom rasponu,
		 krenuvši sa 1 2, 1 3, 1 4, itd. Broj moguæih kombinacija je 21. 
		 */
		int brojac = 0;
		
		System.out.println("  Sve kombinacije brojeva: ");
		
		for(int i=1; i<=7; i++) {			    // vanjska petlja koja ide od 1 do 7
			for(int j=1; j<i; j++) {			// unutrasnja petlja koja ide od 1 do i(krece od 1 i povecava za 1)
				brojac++;			            // brojac kombinacija
				if(brojac % 4 == 0) {           // ako brojac dodje do 4
					System.out.println(" (" + j + " " + i + ") ");  // ispis u konzolu i novi red
			    } else {
					System.out.print(" (" + j + " " + i + ") ");
				}
			}
		}
		System.out.println("\nUkupan broj kombinacija je: " + brojac); // ispis broja komb. u konzolu
	}
}
