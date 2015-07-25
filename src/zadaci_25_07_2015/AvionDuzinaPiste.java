package zadaci_25_07_2015;

import java.util.Scanner;

public class AvionDuzinaPiste {

	public static void main(String[] args) {
		/*
		 Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlije�e v,
		 mo�emo izra�unati minimalnu du�inu piste potrebne
		 da avion uzleti koriste�i se sljede�om formulom: du�ina = v * v / 2a.
		 Napisati program koji pita korisnika da unese v u m/s i a u m/s*s
		 te ispisuje korisniku minimalnu du�inu piste.
		 (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje du�ina piste je 514.286)
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite brzinu uzlijetanja aviona: ");
		// unos brzine uzlijetanja aviona
		double v = input.nextDouble();
		
		System.out.print("Unesite ubrzanje aviona: ");
		// unos ubrzanja aviona
		double a = input.nextDouble();
		
		double duzinaPiste = (v * v)/(a + a);  // formula minimalne duzine piste
		                                       // potrebne za uzlijetanje aviona
		System.out.println("\nMinimalna duzina piste je: " + duzinaPiste); // ispis u konzolu
		
		input.close();
	}

}
