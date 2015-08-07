package zadaci_05_08_2015;

public class NasumicniBrojevi100Ponavljanja {

	public static void main(String[] args) {
		
		/*
		 Write a program that generates 100 random integers between
		 0 and 9 and displays the count for each number.
		 (Hint: Use an array of ten integers, say counts,
		 to store the counts for the number of 0s, 1s, . . . , 9s.)
		 */
		int[] niz = new int[10];
		
		for(int i=1; i<=100; i++) { // petlja koja ubacuje 100 nasumicnih brojeva
			int broj = (int)(Math.random()*10);
				niz[broj]++;        // u niz od 0 do 9 i broji koliko se koji puta broj ponovio
			}
		
		for(int i=0; i<niz.length; i++) { // petlja koja vrsi ispis brojeva i broj njihovih ponavljanja
		System.out.println("Broj " + i + " se ponovio " + niz[i] + " puta.");
		}
	}	
}