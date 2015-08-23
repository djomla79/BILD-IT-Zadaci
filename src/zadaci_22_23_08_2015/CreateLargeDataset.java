package zadaci_22_23_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class CreateLargeDataset {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 Create a data file with 1,000 lines.
		 Each line in the file consists of a faculty member’s first name, last name, rank, and salary.
		 The faculty member’s first name and last name for the i-th line are FirstName-i and LastName-i.
		 The rank is randomly generated as assistant, associate, and full.
		 The salary is randomly generated as a number with two digits after the decimal point.
		 The salary for an assistant professor should be in the range from 50,000 to 80,000,
		 for associate professor from 60,000 to 110,000, and for full professor from 75,000 to 130,000.
		 Save the file in Salary.txt. Here are some sample data:
		 
		 FirstName1 LastName1 assistant 60055.95
		 FirstName2 LastName2 associate 81112.45
		 . . .
		 FirstName1000 LastName1000 full 92255.21 
		 */
		
		String file = "Salary.txt";
		
		PrintWriter upis = new PrintWriter(file);
		
		int[] niz = new int[1000];
		String[] rank = {"assistant", "associate", "professor"};
		
		double salary = 0;
		
		Random random = new Random();
		int b50 = 50000, b60 = 60000, b75 = 75000, b80 = 80000, b110 = 110000, b130 = 130000;
		
		for(int i=0; i<niz.length; i++) {
				
			String s = "";
			
			upis.print("Ime" + (i+1) + " Prezime" + (i+1) + " " + (s = rank[(int)(Math.random()*3)]));
			
			if(s.matches("assistant")) {
				salary = (double)random.nextInt(b80-b50)+b50;
			} else if(s.matches("associate")) {
				salary = (double)random.nextInt(b110-b60)+b60;
			} else if(s.matches("professor")) {
				salary = (double)random.nextInt(b130-b75)+b75;
			}
			
			upis.print(" " + salary + "\n"); 
		
		}
		
		upis.close();
		
		File file1 = new File("Salary.txt");
		
		Scanner input = new Scanner(file1);
		
		String str = "";
		
		while(input.hasNextLine()) {
			
			str = input.nextLine();
			
			System.out.println(str);
			
		}
		
		input.close();
		
	}
	
}
