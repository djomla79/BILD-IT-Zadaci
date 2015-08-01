package zadaci_01_08_2015;

public class SumaBrojeva {

	public static void main(String[] args) {
		/*
		 Napisati program koji sabira sljedeæu seriju
		 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
		 */
		
		double suma = 0.0;
		
		for(int i=1; i<100; i = i+2) {  // petlja koja ide od 1, 3, 5,..,99 (neparni)
			suma += (double)i / (i+2);  // suma brojeva i / i+2, 1/3, 3/5,...,97/99
		}
		System.out.println(suma);       // ispis ukupne sume
	}

}
