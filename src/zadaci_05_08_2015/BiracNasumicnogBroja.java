package zadaci_05_08_2015;

public class BiracNasumicnogBroja {

	public static void main(String[] args) {
		/*
		(Random number chooser) Write a method that returns a random number between
		1 and 54, excluding the numbers passed in the argument. The method header is
		specified as follows:
		public static int getRandom(int... numbers)
        */
		
		int [] numbers = {5, 8, 12, 1, 3, 9, 2, 13, 45, 36}; // proizvoljan niz brojeva
		
		getRandom(numbers);             // pozivanje metode
		
	}
	/** Metoda koja prima niz brojeva i vraca nasumicni broj */
	public static int getRandom(int...numbers) {
		
		boolean isOn = true;
		int number = 0;
			
		while(isOn) {
		
			int nasumicni = (int)(Math.random()*54+1); // nasumican broj izmedju 1 i 54
		
			for (int i=0; i<numbers.length; i++) {      // za sve elemente niza
				
				if (numbers[i] == nasumicni) {   // ako je neki od brojeva iz niza isti sa nasumicnim
					isOn = true;                 // glavna petlja nastavlja sa radom
					break;                       // prekid for petlje
				} else {                         // ako nema isti zajednicki broj
					number = nasumicni;          // number postaje nasumicni broj
					isOn = false;                // glavna petlja prestaje sa radom
				}
			}
		}
		                                // i vrsimo njegov ispis u konzolu
		System.out.println("Nasumicni broj je: " + number);
		return number;
		}
	}
