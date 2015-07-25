package zadaci_25_07_2015;

import java.util.Scanner;

public class StringIzuzetiNeparni {

	public static void main(String[] args) {
		/*
		 Napisati program koji pita korisnika da unese neki string te mu
		 ispisuje sve karaktere koji se nalaze na neparnim pozicijama.
		 Na primjer, ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite rijec ili recenicu: ");
		// unos rijeci ili recenice
		String rijec = input.nextLine();
		
		String suma = "";
		// petlja koja prolazi kroz uneseni string
		for(int i=0; i<rijec.length(); i=i+2) { // na svaki drugi karakter stringa
			suma += rijec.charAt(i);// unos karaktera na neparnim pozicijama stringa u novi prazan string
		}
		// ispis u konzolu
		System.out.println("Karakteri na neparnim pozicijama stringa su: " + suma);
		input.close();
		
	}

}
