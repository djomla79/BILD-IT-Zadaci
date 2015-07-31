package zadaci_31_07_2015;

import java.util.Scanner;

public class Napojnica {

	public static void main(String[] args) {
		/*
		 (Izraèunavanje napojnice)
		 Napisati program koji uèitava ukupan iznos raèuna koji treba uplatiti kao i procenat
		 tog raèuna kojeg želimo platiti kao napojnicu te izraèunava ukupan raèun i napojnicu.
		 Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu
		 program treba da ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5.
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
