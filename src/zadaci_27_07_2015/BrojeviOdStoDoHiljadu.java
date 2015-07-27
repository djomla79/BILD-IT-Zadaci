package zadaci_27_07_2015;

public class BrojeviOdStoDoHiljadu {

	public static void main(String[] args) {
		/* 
		 Napišite program koji ispisuje sve brojeve, od 100 do 1000,
		 10 brojeva po liniji, koji su djeljivi i sa 5 i sa 6.
		 Razmak izmeðu brojeva treba biti taèno jedan space. 
        */
		
		int brojac = 0;
		
		for (int i = 100; i <= 1000; i++){      // petlja brojeva od 100 do 1000
			if (i % 5 == 0 && i % 6 == 0) {     // ako su ti brojevi djeljivi i sa 5 i sa 6
				brojac++;                       // brojac broji koliko ima tih brojeva
				if(brojac % 10 == 0) {          // kad brojac dodje do 10
				System.out.println(i + " ");    // ispis se vrsi u sledeci red
				} else {
					System.out.print(i + " ");					
				}
			}
			
		}
		
		
	}

}
