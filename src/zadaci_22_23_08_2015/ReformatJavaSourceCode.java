package zadaci_22_23_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReformatJavaSourceCode {

	private static Scanner input;

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 Write a program that converts the Java source code from the
		 next-line brace style to the end-of-line brace style.
		 For example, the following Java source in (a) uses the next-line brace style.
		 Your program converts it to the end-of-line brace style in (b).
		 Your program can be invoked from the command line with the Java sourcecode file as the argument.
		 It converts the Java source code to a new format. 
		 */
		
		input = new Scanner(System.in);
		
		boolean isOn = true;
		
		do {
			try {
				
				System.out.print("Unesite ime fajla: ");
				
				String ime = input.next();           // unesite ime fajla
				
				File file = new File(ime);
				
				String str = "", str1 = "";
				
				input = new Scanner(file);
				
				while(input.hasNextLine()) {         // petlja radi dok ima recenica u fajlu
					
					str += input.nextLine();          // stringu str se dodjeljuju recenice iz fajla
					
				    /* str1 postaje string str kojem su izmjenjeni odredjeni 
				     * dijelovi stringa sa unesenim zeljenim dijelom stringa */
					str1 = str.replaceAll("\\)\\s*\\{", ") {");
					
					str1 = str.replaceAll("\\s*\\{", " {");
					
				}
				
				System.out.println("Izmjenjeni text iz fajla: ");
				System.out.println(str1);           // ispis izmjenjenog texta iz fajla
				
				System.out.println("Uneseni fajl je uspjesno izmjenjen.");
				
				input.close();
				
				PrintWriter upis = new PrintWriter(file);
				
				upis.print(str1);                   // upis stringa str1 sa izmjenjenim dijelovima stringa u fajl 
				        
				upis.close();
				
				isOn = false;
				
				} catch(FileNotFoundException ex) {
					
					System.out.println("File ne postoji! Pokusajte ponovo.");
					input.nextLine();
				}
			
		} while(isOn);
	}
	
}
