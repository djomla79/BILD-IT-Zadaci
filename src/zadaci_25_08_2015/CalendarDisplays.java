package zadaci_25_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalendarDisplays {

	private static Scanner input;
	
	public static void main(String[] args) throws IOException {
		/*
		 Rewrite the PrintCalendar to display a calendar for a specified
		 month using the Calendar and GregorianCalendar classes.
		 Your program receives the month and year from the command line.
		 You also can run the program without the year. In this case, the year is the current year.
		 If you run the program without specifying a month and a year, the month is the current month.
		 */
		
		input = new Scanner(System.in);
		
		ucitajPodsjetnik();     // pozivanje metode za ucitavanje podsjetnika iz fajla
		
		unosMjesecGodina();     // pozivanje metode za unos mjeseca i godine
		
		ispisMenu();            // pozivanje metode za ispis menija
		
	}
	/** Ispis menu-ija za unos novog mjeseca i godine,
	 * novog podsjetnika, pregled starog i izlaz	*/
	public static void ispisMenu() throws IOException {
		
		boolean isOn = true;
		
		do {   
			System.out.println("\n\t1. Novi unos mjeseca i godine");
			System.out.println("\t2. Unos novog podsjetnika");
			System.out.println("\t3. Pregled zadnjeg podsjetnika");
			System.out.println("\t4. Izlaz\n");
			System.out.print("\tUnesite jednu od opcija: ");
		try {
			int opcija = input.nextInt();
			while(opcija < 0 || opcija > 4) {
				System.out.print("\tPogresan unos, unesite broj 1, 2, 3 ili 4.");
				opcija = input.nextInt(); // unos opcija
			}
		switch(opcija) {
		case 1:
			System.out.println();
			unosMjesecGodina();           // prva opcija, za novi unos mjeseca i godine (ispis kalendara)
			break;
		case 2:
			dodajPodsjetnik();            // druga opcija, pozivanje metode za unos novog podsjetnika
			break;
		case 3:
			pregledPodsjetnika();         // treca opcija, za pregled zadnje unesenog podsjetnika
			break;
		case 4:
			System.out.println("\tHvala, dovidjenja!"); // cetvrta opcija, izlaz iz programa
			isOn = false;
			System.exit(1);
			break;
		}
		snimiPodsjetnik();                // snimanje novo-unesenog podsjetnika u fajl
		
		} catch(NoSuchElementException e) {
			System.out.println("\tPogresan unos, Unesite broj!");
			input.nextLine();
		}
	 } while(isOn);                       // petlja se 'vrti' dok se uslov ne ispuni
		
	}
	/** Metoda za unos mjeseca i godine */
	public static void unosMjesecGodina() {
		
		input = new Scanner(System.in);
		boolean isOn = false;
		int mjesec, godina;
		
		GregorianCalendar cal = new GregorianCalendar();
		int year = cal.get(GregorianCalendar.YEAR);   // dobijanje trenutne godine greg. kalendara
		int month = cal.get(GregorianCalendar.MONTH); // dobijanje trenutnog mjeseca greg. kalendara
		
	do {
		try {
			
		System.out.print("\tUnesite mjesec (1-12): ");
		mjesec = input.nextInt();            // unos mjeseca  
		System.out.print("\tUnesite godinu: ");
		godina = input.nextInt();            // unos godine
		
		isOn = false;                        // uslov ispunjen, prekid rada petlje
		/** Uslovi za ispis tijela kalendara */
		if(mjesec <= 0 || mjesec > 12 && godina < 1800) {        // ako unos mjeseca i godine ne odgovara
			ispisBody(month+1, year);                            // vrsi se ispis trenutne godine i mjeseca
		} else if(mjesec <= 0 || mjesec > 12 && godina > 1800) { // ako unos mjeseca ne odgovara
			ispisBody(month+1, godina);                          // vrsi se ispis trenutnog mjeseca i unesene godine
		} else if(godina < 1800) {                               // ako unos godine ne odgovara
			ispisBody(mjesec, year);                             // vrsi se ispis unesenog mjeseca i trenutne godine
		} else {                                                 // ako su unosi ispravni
			ispisBody(mjesec, godina);                           // vrsi se ispis unesenog mjeseca i godine
		}
		
		} catch(InputMismatchException e) {                      // 'hvatanje' i ispis greske
			System.out.println("\tPogresan unos, Unesite broj!");
			input.nextLine();
		}
		
	} while(isOn);
	}
	/** Metoda za ispis body-ja kalendara u konzolu */
	public static void ispisBody(int mjesec, int godina) {

		/* niz stringova sa svih 12 mjeseci u godini */
		String [] mjeseci = {"January", "February", "March", "April", "May", "Jun", "July", "August", "Septembar", "Oktombar", "Novembar", "Decembar"};
		String [] dani = {"Mon", "Tue", "Wen", "Thu", "Fri", "Sat", "Sun"};
		for(int i=0; i<mjeseci.length-1; i++) {  // petlja koja prolazi kroz niz sa mjesecima
		}
		System.out.println();
		System.out.println("\t\t\t   " + mjeseci[mjesec-1] + " " + godina + "\t\t\t"); // ispis unesenog mjeseca i godine u konzolu
		System.out.println("\t___________________________________________________");
		for(int i=0; i<dani.length; i++) {       // petlja koja prolazi kroz string sa svim danima u sedmici
			System.out.print("\t" + dani[i]);    // ispis svih dana u konzolu
		}
		int i = 0;
		System.out.println();
		for (i = 0; i < pocetniDan(mjesec, godina); i++) {    // petlja koja ide od pocetka body-ja do pocetnog dana za uneseni mjesec i godinu
			System.out.print("\t");                           // ispis praznih polja do pocetnog dana u body-ju kalendara
		}
		for (i = 1; i <= daniUMjesecu(mjesec, godina); i++) { // petlja koja prolazi kroz ukupan broj dana u mjesecu za unesenu godinu i mjesec
			System.out.print("\t" + i);                       // printa prazna polja i dane (pocevsi od 1. u mjesecu)
			if ((i + pocetniDan(mjesec, godina)) % 7 == 0) {  // kad printanje dana dodje do 7 (kraja sedmice) printa se u sledeci red
			System.out.println();
			}
		}
		System.out.println();
	}
	/** Metoda koja vraca pocetni dan unesenog mjeseca, unesene godine */
	public static int pocetniDan(int mjesec, int godina) {

		GregorianCalendar cal = new GregorianCalendar();
		
		/* Godina i mjesec za unesene parametre */
		cal.set(godina, mjesec-1, 1); 
       
        /* Dobijanje prvog dana u mjesecu */
        int pocetni = cal.get(GregorianCalendar.DAY_OF_MONTH)-1;
		
		/* formula za izracunavanje pocetnog dana za uneseni mjesec i godinu */
		return (daniGodina(mjesec, godina) + pocetni) % 7;
		
	}
	/** Metoda koja vraca ukupno dana do unesenog broja godina */
	public static int daniGodina(int mjesec, int godina) {
		
		int suma = 0;
		
		for(int i = 1800; i < godina; i++) { // petlja koja ide od 1800 godine do unosa godine
			if(prestupna(i)) {               // ako je godina prestupna
				suma += 366;				 // sabira u ukupnu sumu 366
			} else {                         // ako godina nije prestupna
				suma += 365;                 // sabira u ukupnu sumu 365
			}
		}
		for(int i = 1; i < mjesec; i++) {    // petlja koja ide od prvog do unesenog mjeseca
			suma += daniUMjesecu(i, godina); // sabira u ukupnu sumu izracunate dane u mjesecu za unesenu godinu
		}
		return suma;                         // vraca ukupnu sumu dana od 1800 godine do unesene godine i uneseni mjesec
	}
	/** Metoda koja vraca broj dana unesenog mjeseca, unesene godine */
	public static int daniUMjesecu(int mjesec, int godina) {
		
		GregorianCalendar calendar = new GregorianCalendar();
		
		/* Godina i mjesec za unesene parametre */
		calendar.set(godina, mjesec-1, 1); 
		 /* Dobijanje ukupno dana u mjesecu */
        int dani = calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        
        return dani;
	}
	/** Metod koji provjerava da li je godina prestupna ili nije */
	public static boolean prestupna(int godina) {
		
		if (godina%400==0 || (godina%4==0 && godina%100!=0)) { // po formuli ako je godina prestupna
			return true;                                       // vraca true, istinito
		} else {                                               // ako nije prestupna
			return false;                                      // vraca false, neistinito
		}
	}

	public static File file = new File("kalendar.txt");             // fajl sa podsjetnicima
		
	public static ArrayList<String> podsjetnik = new ArrayList<>(); // arraylista u koju smjestamo podsjetnike
	
	/** Metoda koja ispisuje podsjetnik iz arrayliste */
	public static void pregledPodsjetnika() {
		
		System.out.println("\tPodsjetnik: ");
		for(int i=0; i< podsjetnik.size(); i++) {
			System.out.println("\t" + podsjetnik.get(i));  // ispis podsjetnika iz arrayliste
		}
		
	}
	/** Metoda koja load-uje podsjetnik sa fajla */
	public static void ucitajPodsjetnik() {	 
	 
		try {
		 
		 input = new Scanner(file);
		 
		 while (input.hasNextLine()) {         // dok ima recenica u fajlu
			 podsjetnik.add(input.nextLine()); // ispis i ubacivanje u arraylistu
		 }
		 
		 } catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
		 }

	}
	/** Metoda koja unosi novi podsjetnik u arraylistu */
	public static void dodajPodsjetnik(){
			
		input = new Scanner(System.in);
		podsjetnik.clear();                          // brisanje starog podsjetnika iz arrayliste
		System.out.print("\tUnesite podsjetnik: ");  // ispis texta u konzolu
		podsjetnik.add(input.nextLine());            // ubacivanje novog texta u arraylistu
			
	}
	/** Metoda koja snima podsjetnike u fajl */
	public static void snimiPodsjetnik() throws IOException {
		
		try {
			
			File file = new File("kalendar.txt");            // za trazeni fajl sa podsjetnicima
			FileWriter writer = new FileWriter(file, false);
			
			for(String s: podsjetnik) {
				writer.write(s + " ");                       // iz arrayliste upisujemo podatke u taj fajl
			}
			
			writer.close();
		    } catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

