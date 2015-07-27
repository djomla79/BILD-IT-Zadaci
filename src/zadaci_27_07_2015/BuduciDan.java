package zadaci_27_07_2015;

import java.util.Scanner;

public class BuduciDan {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese cijeli broj za dana�nji dan u sedmici
		 (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon dana�njeg dana
		 te mu ispi�e koji je to dan u budu�nosti.
		 (Primjer: ako korisnik unese 1 kao dana�nji dan a 3 kao dan u budu�nosti
		 program mu ispisuje da je danas utorak a dan u budu�nosti je petak.) 
		 */
		
		Scanner input = new Scanner(System.in);
		                                                          // niz stringova svih dana u sedmici
        String [] sedmica = {"Ponedeljak.", "Utorak.", "Srijeda.", "Cetvrtak.", "Petak.", "Subota.", "Nedelja."};
		
		System.out.print("Unesite broj danasnjeg dana: " + "\n(Po pravilu: pon=1,..., ned=7) ");
		int dan = input.nextInt();                                // unos danasnjeg dana
		
		for (int i=0; i<sedmica.length-1; i++) {                  // petlja koja ide kroz niz svih dana u sedmici
		}
		
		System.out.println("Danasnji dan je " + sedmica[dan-1]);  // ispis danasnjeg dana
		
		System.out.print("Unesite broj zeljenog buduceg dana: "); 
		int buduciDan = input.nextInt();                          // unos zeljenog buduceg dana
		
		int rezultat = (dan + buduciDan)%7;                       // formula za buduci dan
		
		System.out.println(buduciDan + ". dan od danasnjeg dana je: " + sedmica[rezultat-1]); // ispis buduceg dana
		
		input.close();
		
	}

}
