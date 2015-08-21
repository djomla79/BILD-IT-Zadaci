package zadaci_21_08_2015;

public class OutOfMemory {

	public static void main(String[] args) {
		/*
		 Write a program that causes the JVM to throw an
		 OutOfMemoryError and catches and handles this error.
		 */

		try{
			
			String x = "1";
			
			while (true){              // beskonacna petlja
			    x += x;                // za svaku iteraciju potrebna kolicina bajta se uduplava
			}
		
		} catch(OutOfMemoryError ex){  // 'hvatanje' greske, ispis u konzolu
			
			System.out.println("Sistem je ostao bez memorije!");
			
		}
		
	}
}
