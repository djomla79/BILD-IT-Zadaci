package zadaci_29_07_2015;

public class ProstiBrojeviOd2Do1000 {

	public static void main(String[] args) {
		/*
		 Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000.
		 Program treba da ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude jedan space.
		 */
		
		primarniBrojevi(1000);   // pozivanje metode
		
	}
	/** Metoda koja prima broj i racuna sve primarne brojeve u nizu do tog broja */
	public static void primarniBrojevi(int broj) {
		
		int brojac = 0;
		
		System.out.println("Primarni brojevi: ");
		for(int i = 2; i <= broj; i++) {   // petlja koji ide od 2 do uneseni broj
			if(primarni(i)) {         // ako je broj i, primaran
				brojac++;             // brojac broji koliko primarnih brojeva ima
				if(brojac % 8 == 0) { // kad brojac dodje do 8, prelazi u sledeci red
					System.out.println(i + " "); // ispis u konzolu
				} else {
					System.out.print(i + " ");
				}
			}
		}
	}
	 /** Metoda koja vraca da li je broj primarni ili ne */
    public static boolean primarni(int broj) {
    	
    	if(broj == 2) {          // vraca broj 2 kao primaran
    		return true;
    	}
    	                         // petlja koja provjerava da li je broj primaran
        for (int i = 2; i < broj; i++) {
            if (broj % i == 0) { // ako je broj djeljiv sa i, tj sa 2, vraca false, nije primaran 
                return false;
            }
        }
        return true;             // ako nije djeljiv, vraca true, broj je primaran
    }

}
