package zadaci_28_07_2015;

public class ParoviPrimarnihBrojeva {

	public static void main(String[] args) {
		/*
		 Twin prime brojevi su par prostih brojeva koji se razlikuju za 2.
		 Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin primes.
		 Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji.
		 */
		
		parPrimarni(10000);   // pozivanje metode
		
	}
	/** Metoda koja print parove primarnih brojeva */
    public static void parPrimarni(int broj) {
        
    	int brojac = 0;
    	
    	for (int i = 3; i <= broj; i++) {           // petlja koja ide od broja 3 do 10000
            if(primarni(i) && primarni(i+2)) {      // ako je broj koji pocinje od i, i svaki sledeci broj uvecan za 2, primaran
            	brojac++;                           // brojac se uvecava za jedan za svaki par primarnih brojeva 
            	if(brojac % 10 == 0) {              // kad brojac dodje do 10
            		System.out.println(" (" + i + " " + (i+2) + ") "); // vrsi ispis primarnih parova u sledeci red
            	} else {
            		System.out.print(" (" + i + " " + (i+2) + ") ");            		
            	}
            }
        }
    }
    /** Metoda koja vraca da li je broj primarni ili ne */
    public static boolean primarni(int broj) {
    	                         // petlja koja provjerava da li je broj primaran
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) { // ako je broj djeljiv sa i, tj sa 2, vraca false, nije primaran 
                return false;
            }
        }
        return true;             // ako nije djeljiv, vraca true, broj je primaran
    }
}
