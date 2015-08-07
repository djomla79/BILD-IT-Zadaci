package zadaci_05_08_2015;

public class BiracNasumicnogBroja {

	public static void main(String[] args) {
		/*
		(Random number chooser) Write a method that returns a random number between
		1 and 54, excluding the numbers passed in the argument. The method header is
		specified as follows:
		public static int getRandom(int... numbers)
        */
		
		int [] numbers = {5, 8, 12, 1, 3, 9, 2, 13, 45, 36};
		
		getRandom(numbers);
		
	}
	
	public static int getRandom(int...numbers) {
			
		int nasumicni = (int)(Math.random()*54+1);
		int number = 0;
		    
		for (int n: numbers) {
			if (n != nasumicni) {
				number = nasumicni;
			}
		}
		System.out.println("Nasumicni broj je: " + number);
		return number;
	}
}
