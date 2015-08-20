package zadaci_20_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		/*
		 Write a program that prompts the user to enter an integer
		 m and find the smallest integer n such that m * n is a perfect square.
		 (Hint: Store all smallest factors of m into an array list.
		 n is the product of the factors that appear an odd number of times in the array list.
		 For example, consider m = 90, store the factors 2, 3, 3, 5 in an array list.
		 2 and 5 appear an odd number of times in the array list. So, n is 10.)
		 
		 Enter an integer m: 1500
		 The smallest number n for m * n to be a perfect square is 15, m * n is 22500
		 
		 Enter an integer m: 63 
		 The smallest number n for m * n to be a perfect square is 7, m * n is 441
		 */
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> faktori = new ArrayList<>();
		ArrayList<Integer> faktor = new ArrayList<>();
		
		System.out.print("Unesite broj: ");
		
		int broj = input.nextInt();
		int m = broj;
		
		int n = 2, c;
		int brojac = 0;
		
		while(m % 2 == 0) {          // dok je broj m djeljiv sa 2 petlja se 'vrti'
			m /= n;                  // broj m dijelimo sa n (2)
			faktori.add(n);          // dodajemo n (2) u listu faktori
		}
		
		for(int l=1; l<m; l=l+2) {
			if(faktori.size() == l) {// ako je broj el. u listi faktori neparan
				faktor.add(n);       // dodaj sve brojeve liste faktori n u listu faktor
			}
		}
		faktori.clear();
		
		for(int i=3; i<=m; i=i+2) { // petlja koja ide od 3 do unesenog broja, do unesenog (neparni)
	        while(m % i == 0) {     // dok je broj djeljiv sa i petlja se 'vrti'
	        	m /= i;             // broj podijeli sa i
	            n = i;              // n postaje taj broj
	            faktori.add(n);     // dodajemo taj broj (n) u listu
	       }
		}
		
		for(int j=0; j<faktori.size(); j++) {          // petlja koja prolazi kroz citavu listu
			c = faktori.get(j);                        // elemente iz liste dodjeljujemo int c
			for(int k=0; k<faktori.size(); k++) {      // petlja prolazi kroz citavu listu
				if(c == faktori.get(k)) {              // ako je za svaki el. c jednak sa elementima iz liste  
					brojac++;                          // brojac se povecava za jedan
				}
			}
			if(brojac%2 != 0 && !faktor.contains(c)) { // ako brojac nije paran i ako lista faktor ne sadrzi brojeve c
				faktor.add(faktori.get(j));            // dodaj u listu faktor sve brojeve liste faktori
			}
		}
		
		int suma = 1, num;
		
		System.out.print("Brojevi neparnog ponavljanja u broju " + broj + " su: ");
		for(int j=0; j<faktor.size(); j++) {           // za sve el. liste faktor
			System.out.print(faktor.get(j) + " ");     // printaj sve el. liste
			num = faktor.get(j);                       // elemente iz liste dodjeljujemo broju num
			suma *= num;                               // ukupan proizvod svih brojeva num
		}
		                                               // ispis u konzolu
		System.out.println("\nNajmanji broj za perfect square je: " + suma + "\nPerfect square je: " + suma*broj);
		
		input.close();
	}

}
