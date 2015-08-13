package zadaci_13_08_2015;

import java.util.GregorianCalendar;

public class MyDateTest {

	public static void main(String[] args) {
		/*
		 Design a class named MyDate. The class contains:
		 The data fields year, month, and day that represent a date. month is 0-based, i.e., 0 is for January.
		 A no-arg constructor that creates a MyDate object for the current date.
		 A constructor that constructs a MyDate object with a specified elapsed
		 time since midnight, January 1, 1970, in milliseconds.
		 A constructor that constructs a MyDate object with the specified year, month, and day.
		 Three getter methods for the data fields year, month, and day, respectively.
		 A method named setDate(long elapsedTime) that sets a new date for the object using the elapsed time.
		 
		 Write a test program that creates two MyDate objects (using new MyDate() and
		 new MyDate(34355555133101L)) and displays their year, month, and day.
		 (Hint: The first two constructors will extract the year, month, and day from the elapsed time.
		 For example, if the elapsed time is 561555550000 milliseconds, the year is 1987, the month is 9, and the day is 18. 
		 You may use the GregorianCalendar class.)
		 */
		/* kreiranje objekata MD i pozivanje metoda za ispis datuma u konzolu */
		MyDate d1 = new MyDate();
		System.out.println("Danasnji datum: "+ d1.getYear() + "/" + d1.getMonth() + "/" + d1.getDay());
		
		MyDate d2 = new MyDate(34355555133101L);
		System.out.println("Datum: " + d2.getYear() + "/" + d2.getMonth() + "/" + d2.getDay());
		
		MyDate d3 = new MyDate();
		d3.setDate(561555550000L);
		System.out.println("Datum: " + d3.getYear() + "/" + d3.getMonth() + "/" + d3.getDay());
		
		MyDate d4 = new MyDate(2015, 11, 11);
		System.out.println("Datum: " + d4.getYear() + "/" + d4.getMonth() + "/" + d4.getDay());
		
	}
}
/** Klasa MyDate */
class MyDate {
	
	 private int year;
	 private int month;
	 private int day;
	 /** Konstruktor sa GC klasom za danasnji datum */
	 MyDate() {
	  GregorianCalendar cal = new GregorianCalendar();    // kreiranje objekta GC
	  year = cal.get(GregorianCalendar.YEAR);             // pozivanje metode i dobijanje danasnje godine
	  month = cal.get(GregorianCalendar.MONTH);           // pozivanje metode i dobijanje danasnjeg mjeseca
	  day = cal.get(GregorianCalendar.DAY_OF_MONTH);      // pozivanje metode i dobijanje danasnjeg dana
	 }
	 /** Konstruktor sa parametrom elapsedTime */
	 MyDate(long elapsedTime) {
	  GregorianCalendar datumOd = new GregorianCalendar(1970, 1, 1);  
	  GregorianCalendar cal = new GregorianCalendar();     // kreiranje objekta GC

	  cal.setTimeInMillis(datumOd.getTimeInMillis() + elapsedTime);  // poziv metode i sabiranje unesenog vremena
                                                                     // i vremena od 1.1.1970 u milisekundama
	  year = cal.get(GregorianCalendar.YEAR);                        // parametar year dobija vrijednost godine za sabrane milisekunde
	  month = cal.get(GregorianCalendar.MONTH);                      // parametar month dobija vrijednost mjeseca za sabrane milisekunde
	  day = cal.get(GregorianCalendar.DAY_OF_MONTH);                 // parametar day dobija vrijednost dana za sabrane milisekunde
	 }
	 /** Konstruktor sa parametrima year, month i day */
	 MyDate(int year, int month, int day) {
	  this.year = year;
	  this.month = month;
	  this.day = day;
	 }
	 /** Geteri */
	 public int getYear() {
	  return year;
	 }
	 public int getMonth() {
	  return month;
	 }
	 public int getDay() {
	  return day;
	 }
	 /** Metoda za primanje argumenata proteklog vremena u
	  * milisekundama i racunanje datuma za uneseno vrijeme */
	 public void setDate(long elapsedTime) {  
	  GregorianCalendar cal = new GregorianCalendar();  // kreiranje objekta GC
	  cal.setTimeInMillis(elapsedTime);                 // pozivanje metode za racunanje unesenog broja u milisekundama

	  year = cal.get(GregorianCalendar.YEAR);           // pozivanje metode i dobijanje godine za uneseni broj u milisek.
	  month = cal.get(GregorianCalendar.MONTH);         // pozivanje metode i dobijanje mjeseca za uneseni broj u milisek.
	  day = cal.get(GregorianCalendar.DAY_OF_MONTH);    // pozivanje metode i dobijanje dana za uneseni broj u milisek.
	 }
}
