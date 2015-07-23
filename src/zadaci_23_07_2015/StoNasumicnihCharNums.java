package zadaci_23_07_2015;

public class StoNasumicnihCharNums {

	public static void main(String[] args) {
		/*
		 Napisati metodu koja printa 100 nasumiènih uppercase
		 karaktera i 100 nasumiènih brojeva, 10 po liniji.
		 */
		
		stoNasumicnihChar();   // pozivanje metode nasumicnih karaktera
		System.out.println();  
		stoNasumicnihNums();   // pozivanje metode nasumicnih brojeva
	}
	/** Metoda ispisa nasumicnih karaktera */
	public static void stoNasumicnihChar() {	
		
		String niz = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // string sa svim karakterima alfabeta
		for(int i = 0; i < 100; i++) {             // petlja koja vrsi iteraciju 100x
			if(i % 10 == 0) {                      // kad se ponovi 10x prelazi stampanje u novi red
				System.out.println();
			}
			char ch = niz.charAt((char)(Math.random()*26));  // karakteri iz niza se nasumicno generisu
			System.out.print(ch + " ");                      // ispis karaktera
		}
	}
	/** Metoda ispisa nasumicnih brojeva */
	public static void stoNasumicnihNums() {	
		
		for(int i = 0; i < 100; i++) {  // petlja koja vrsi iteraciju 100x
			if(i % 10 == 0) {           // kad se ponovi 10x prelazi stampanje u novi red
				System.out.println();
			}
			int broj = (int)(Math.random()*10);            // nasumicno generisanje brojeva
			System.out.print(broj + " ");                  // ispis brojeva
		}
	}
}
