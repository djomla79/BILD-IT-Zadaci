package zadaci_12_08_2015;

public class TimeTest {

	public static void main(String[] args) {
		/*
		 Write a test program that creates two Time objects (using new Time()
		 and new Time(555550000)) and displays their hour, minute, and second
		 in the format hour:minute:second.
		 The first two constructors will extract the hour, minute, and second
		 from the elapsed time. For the no-arg constructor, the current time can be
		 obtained using System.currentTimeMillis()
		 */
		 Time time1 = new Time();            // Kreiranje objekata Time: prvi (default sa trenutnim vremenom)

		 Time time2 = new Time(555550000l);  // drugi objekat sa parametrom za long milisekunde
		 
		 Time time3 = new Time(11, 11, 11);  // treci sa parametrima za sat, minute i sekunde
		                                     // pozivanje metoda za sate, minute i sekunde za objekte i ispis u konzolu
		 System.out.println("Vrijeme: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
    
		 System.out.println("Vrijeme: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
		
		 System.out.println("Vrijeme: " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
		 
	}
	
}
/** Klasa Time */
class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	/** Konstruktor po default-u, trenutno vrijeme */
	Time() {
		
		long milisekunde = System.currentTimeMillis(); // metoda za dobijanje trenutnog vremena
		
		long ukupnoSek = milisekunde / 1000;           // Ukupno sekundi od 1.1.1970
	
		this.second = (int)(ukupnoSek % 60);           // dobijanje sekundi
	
		long ukupnoMin = ukupnoSek / 60;               // ukupno minuta
	
		this.minute = (int)(ukupnoMin % 60);           // dobijanje minuta   
	
		long ukupnoSat = ukupnoMin / 60;               // ukupno sati
		        
		this.hour = (int)(ukupnoSat % 24);             // dobijanje sati
	
	}	 
	/** Konstruktor sa parametrom za milisekunde */
	Time(long milisekunde) {       
	
		setTime(milisekunde);       // pozivanje metode za racunanje proteklog vremena
	  
	}
	/** Konstruktor sa parametrima sat, minuti i sekunde */
	Time(int hour, int minute, int second) {
	  
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	 
  }
	/** Geteri */	    
	public int getHour() {
	return hour;
	}
	public int getMinute() {
	return minute;
	}
	public int getSecond() {
	return second;
	}
	/** Metoda koja prima proteklo vrijeme u milisekundama
	 * i racuna sat, minut i sekunde za to proteklo vrijeme */
	public void setTime(long elapseTime) {
		
		long ukupnoSek = elapseTime / 1000;  // Ukupno sekundi od 1.1.1970
		  
		this.second = (int)(ukupnoSek % 60); // dobijanje sekundi
		 
		long ukupnoMin = ukupnoSek / 60;     // ukupno minuta
		  
		this.minute = (int)(ukupnoMin % 60); // dobijanje minuta   
		  
		long ukupnoSat = ukupnoMin / 60;     // ukupno sati	        
		  
		this.hour = (int)(ukupnoSat % 24);   // dobijanje sati
		  
	}
}
