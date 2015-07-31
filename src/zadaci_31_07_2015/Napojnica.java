package zadaci_31_07_2015;

import java.util.Scanner;

public class Napojnica {

	public static void main(String[] args) {
		/*
		 (Izra�unavanje napojnice)
		 Napisati program koji u�itava ukupan iznos ra�una koji treba uplatiti kao i procenat
		 tog ra�una kojeg �elimo platiti kao napojnicu te izra�unava ukupan ra�un i napojnicu.
		 Na primjer, ukoliko korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu
		 program treba da ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite racun: ");
		
		double racun = input.nextDouble();      // unos racuna
		
		System.out.print("Unesite procenat napojnice: ");
		
		double unosNap = input.nextDouble();    // unos napojnice
		
		double procenatNap = unosNap / 100;     // dobijanje procenta napojnice
		
		double napojnica = racun*procenatNap;   // izracunavanje ukupne napojnice
		
		double ukupanRacun = racun + napojnica; // izracunavanje ukupnog racuna
		                                        // ispis ukupnog racuna i napojnice u konzolu
		System.out.println("Ukupan racun je: " + ukupanRacun + "\nNapojnica je: " + napojnica);
		
		input.close();
	}

}
