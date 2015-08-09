package zadaci_09_08_2015;

public class MjerenjeVremena {

	public static void main(String[] args) {
		/*
		 Write a test program that measures the execution time
		 of sorting 100,000 numbers using selection sort.
		 */
	
		int[] brojevi = new int[100000];          // duzina niza
		int min, temp;
	
		for(int i=0; i<brojevi.length; i++) {     // za niz sa brojevima
			brojevi[i] = (int)(Math.random()*10); // ubacivanje brojeva od 0 do 9 u niz
		}
		
		Stopwatch pocetaKraj = new Stopwatch();   // kreiranje objekta (instance) stopwacth
		
		pocetaKraj.start();                       // pozivanje metode za start mjerenja vremena
		
		/** Koristimo selection sort za sortiranje elemenata niza */
		for(int i=0; i<brojevi.length-1; i++){    // za niz sa brojevima
			min = i;                              // odredjujemo prvi element u nizu kao min, najmanji
			for(int j=i+1; j<brojevi.length; j++){// za niz sa brojevima koji krece od drugog clana niza
				if(brojevi[j] < brojevi[min])     // ako je bilo koji broj u nizu manji od min,
				min = j;                          // taj broj postaje min i uzima njegov index
			}
			if(min != i){                         // ako je index novog min broja razlicit od pocetnog
				temp = brojevi[i];                // mijenjamo im mjesta
				brojevi[i] = brojevi[min];
				brojevi[min] = brojevi[temp];
			}
		}
		
		pocetaKraj.stop();                        // pozivanje metode za kraj mjerenja vremena
		                                          // ispis vremena za koliko je trebalo da se sortiranje izvrsi
		System.out.println("Za sortiranje " + brojevi.length + " brojeva je proslo: " + pocetaKraj.getElapsedTime() + " sekundi.");
		
	}
}
	
class Stopwatch {
	
	private long startTime;
	private long endTime;
	
	/** Geteri i seteri startTime, endTime */
	public long getStartTime() {
		return startTime;
	}
	
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	/** Konstruktor bez argumenata sa pocetnim vremenom */
	public Stopwatch() {
		this.startTime = System.currentTimeMillis();
	}

	/** Metoda koja pocinje da mjeri vrijeme, start */
	public void start() {
		this.startTime = System.currentTimeMillis();
	}

	/** Metoda koja mjeri kraj, zaustavljanje rada */
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}

	/** Metoda koja racuna proteklo vrijeme od pocetka do kraja */
	public long getElapsedTime() {
		return (this.endTime - this.startTime) / 1000;
	}
}
	