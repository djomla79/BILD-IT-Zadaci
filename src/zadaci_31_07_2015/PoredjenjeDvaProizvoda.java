package zadaci_31_07_2015;

import java.util.Scanner;

public class PoredjenjeDvaProizvoda {

	public static void main(String[] args) {
		/*
		 Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita pakovanja.
		 Želimo napisati program koji uporeðuje cijene ta dva pakovanja.
		 Program pita korisnika da unese težinu i cijenu oba pakovanja te ispisuje koje pakovanje ima bolju cijenu.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite tezinu i cijenu prvog pakovanja: ");
		
		double tezina1 = input.nextDouble();							// unos prve tezine i cijene
		double cijena1 = input.nextDouble();
		
		double pakovanje1 = tezina1 / cijena1;						    // odnos tezine i cijene za prvo pakovanje
		
		System.out.println("Unesite tezinu i cijenu drugog pakovanja: ");
		
		double tezina2 = input.nextDouble();							// unos druge tezine i cijene
		double cijena2 = input.nextDouble();
		
		double pakovanje2 = tezina2 / cijena2;					        // odnos tezine i cijene za drugo pakovanje
		
		if (pakovanje1 > pakovanje2) {								    // odnosi cijena pakovanja
			System.out.println("Prvo pakovanje ima bolju cijenu.");	
		} else {
			System.out.println("Drugo pakovanje ima bolju cijenu.");
		}
		if (pakovanje1 == pakovanje2) {
			System.out.println("Pakovanja imaju iste cijene.");
		}
		input.close();
	}

}
