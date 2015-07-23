package zadaci_23_07_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementiIznadIspodProsjeka {

	public static void main(String[] args) {
		/*
		 Napisati program koji uèitava neodreðeni broj cijelih brojeva
		 (nula prekida unos) te ispisuje koliko je brojeva bilo iznad ili
		 jednako prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod prosjeka.
		 Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
		 */
		
		Scanner input = new Scanner(System.in);
		
		int broj;
		int brojac = 0;
		int ispod = 0;
		int iznad = 0;
		double suma = 0;
		double average = 0;
		boolean isOn = true;
		ArrayList<Integer> lista = new ArrayList <>();
		
		System.out.print("Unesite brojeve (unos prekida sa 0): ");
		// petlja unosa brojeva
		do {
			broj = input.nextInt();
			if(broj == 0 || brojac == 100) { // ako je unos 0 ili vise od 100 brojeva
				isOn = false;                // unos se prekida
			} else {                         // u ostalim slucajevima
				lista.add(broj);             // brojeve ubacujemo u arraylistu
				brojac++;                    // brojac koji broji koliko je elemenata u listi
				suma += broj;                // sabiranje svih elemenata iz liste
			}
		} while(isOn);
		
		average = suma / (double) brojac;    // racunanje prosjeka svih unesenih brojeva
		
		for(int i=0; i<lista.size(); i++) { // petlja u kojoj provjeravamo 
			if(lista.get(i) < average) {    // da li je bilo koji elem. iz liste manji od ukupnog prosjeka
				ispod++;                    // brojac elemenata manjih od ukupnog prosjeka
			}
			if(lista.get(i) >= average) {   // da li je bilo koji elem. iz liste veci ili jednak ukupnom prosjeku
				iznad++;                    // brojac elemenata vecih od ukupnog prosjeka
			}                             
		}
		// ispis u konzolu, ukupan prosjek, broj elemenata ispod i iznad prosjeka
		System.out.println("Prosjek unesenih brojeva: " + average + "\nBrojevi ispod prosjeka: " + ispod + "\nBrojevi iznad prosjeka: " + iznad);
		input.close();
	}

}
