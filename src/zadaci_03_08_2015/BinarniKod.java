package zadaci_03_08_2015;

import java.util.Scanner;

public class BinarniKod {

	public static void main(String[] args) {
		/*
		  Napišite program koji pita korisnika da unese
		  cijeli broj i ispiše njegov ekvivalent u binarnom kodu.
		  Za ovaj program NE smijemo koristiti Integer.toBinaryString(int) metodu.
		 */
		Scanner input = new Scanner(System.in);
        
		System.out.print("Unesite broj: ");
        int n = input.nextInt();        // unos broja
        
        int ostatak;
        int broj = n; 
        
        String str = "";
        String binarni = "";
        
        while(broj > 0) {               // dok je broj veci od 0 petlja se 'vrti'
            ostatak = broj % 2;         // dobijamo broj ostatak kad uneseni broj moduliramo sa 2
            str += ostatak;             // unosimo dobijeni broj u prazan str string
            broj = broj / 2;            // broj dijelimo sa dva
        }
        for(int i=str.length()-1; i>=0; i--) {
        	binarni += str.charAt(i);   // obrcemo string str i unosimo ga u prazan string binarni
        }
                                        // ispis stringa binarni u konzolu
        System.out.println("Binarni broj za broj " + n + " je: " + binarni);
        //System.out.println(Integer.toBinaryString(n));
        input.close();
	}

}
