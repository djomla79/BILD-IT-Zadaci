package zadaci_24_07_2015;

import java.util.Scanner;

public class MjesecniIznosStednje {

	public static void main(String[] args) {
		
		/*
		Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu stopu od 5%.
		Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417.
		Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) = 100.417.
		Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252.
		Nakon treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje.
		Napisati program koji pita korisnika da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje raèuna. 
		*/
		
		Scanner input = new Scanner(System.in);
		
		double mjesecnaStopa = 5.0 / 1200;                  // mjesecna stopa rasta, interesna stopa
		
		System.out.print("Unesite vas iznos: ");
		double iznos = input.nextDouble();
		// iznos novca koji unosimo svaki mjesec
		double suma = 0;
		System.out.print("Unesite broj mjeseci: ");
		int mjesec = input.nextInt();                       // unos broja mjeseci kojim provjeravamo stanje racuna
		// petlja izracunavaja ukupne sume novca na racunu za uneseni mjesec
		while(mjesec > 0) {                                 // petlja se 'vrti' dok mjesec ne dodje do nule
				suma = (iznos + suma)*(1 + mjesecnaStopa);  // formula izracunavanje ukupne sume
				mjesec--;                                   // za svaku iteraciju broj mjeseci se smanjuje za jedan                        
		}
		System.out.println("Stanje na vasem racunu je: " + suma);  // ispis u konzolu
		input.close();
	}

}
