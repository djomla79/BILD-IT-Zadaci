package zadaci_02_08_2015;

import java.util.Calendar;

public class TrenutnoVrijemeIDatum {

	public static void main(String[] args) {
		/*
		 Napisati metodu koja vraæa datum i trenutaèno vrijeme.
		 */
		
		Calendar cal = Calendar.getInstance();                            // klasa Calendar
		System.out.println("Trenutni datum i vrijeme: " + cal.getTime()); // instancom cal pozivamo metodu koja racuna trenutni datum i vrijeme
		
	}
	
}
