package zadaci_29_07_2015;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeMillis {

	public static void main(String[] args) {
		/*
		 Ako pozovemo metodu System.currentTimeMillis() dobijemo broj
		 milisekundi od 1. januara 1970 do trenutka pozivanja metode.
		 Napisati program koji ispisuje trenutaèni datum i vrijeme u formatu
		 "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
		 */
		
		long milisekunde = System.currentTimeMillis();                
		Date datum = new Date(milisekunde);                                               // klasa Date sadrzi trenutni datum i vrijeme
		SimpleDateFormat trenutniDatum = new SimpleDateFormat("dd. MMM, yyyy HH:mm:ss");  // odredjivanje formata trenutnog vremena
		System.out.println("Trenutni datum i vrijeme: " + trenutniDatum.format(datum));   // ispis trenutnog vremena u odredjenom formatu
		
	}

}
