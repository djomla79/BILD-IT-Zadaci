package zadaci_21_08_2015;

import java.util.Scanner;

public class NumberException {

	public static void main(String[] args) {
		/*
		 Write the bin2Dec(String binaryString) method to convert a binary string into a decimal number.
		 Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string.
		 */
		
		Scanner input = new Scanner(System.in);
		
		boolean isOn = true;
		
		do {
			try {
			
				System.out.print("Unesite binarni broj: ");
			
				String binarni = input.next();              // unos broja
		                                                    // ispis dec. vrijed. broja u konzolu
				System.out.println("Decimalna vrijednost broja je: " + bin2Dec(binarni));
				
				isOn = false;                               // uslov ispunjen, prekid rada petlje
				
			} catch(NumberFormatException ex) {             // 'hvatanje' greske, ispis u konzolu
				
				System.out.println("Netacan unos!\nUnesite 1 ili 0 u string.");
				   input.nextLine();
				   
			}
			
		} while(isOn);                                      // petlja radi dok se uslov ne ispuni
		input.close();
		
	}

	/**  Metoda prima string kao argument i vraca decimalnu vrijednost
	 * binarnog broja, ako unos nije 1 ili 0, ispis greske, NumberFormatException */
	public static int bin2Dec(String binarni) {
		
		int suma = 0;
		
		for(int i=0; i<binarni.length(); i++) {
			if (binarni.charAt(i) != '0' && binarni.charAt(i) != '1') {
				throw new NumberFormatException();
			}
		}
		
		for(int i=0; i<binarni.length(); i++) {
			if(binarni.charAt(binarni.length()-i-1) == '1') {
				suma += Math.pow(2, i);
			}
		}
		return suma;
	}
}
