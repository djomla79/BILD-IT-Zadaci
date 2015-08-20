package zadaci_20_08_2015;

import java.util.Scanner;
/** Klasa LoanException */
public class LoanException {
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	/** Prazan konstruktor */
	LoanException() throws IllegalArgumentException {
	}
	/** Konstruktor sa parametrima */
	LoanException(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException {
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
			loanDate = new java.util.Date();
	}
	/** Geteri i seteri */
	public double getAnnualInterestRate() {
			return annualInterestRate;
	}
	/** Ako je unos stope manji ili jednak nuli, vrsi se 'bacanje' gresek IAE */
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
		if (annualInterestRate <= 0)
			throw new IllegalArgumentException();
		else {
			this.annualInterestRate = annualInterestRate;
		}
	}		
	public int getNumberOfYears() {
		return numberOfYears;
	}
	/** Ako je unos godina manji ili jednak nuli, vrsi se 'bacanje' gresek IAE */		
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
		if (numberOfYears <= 0)
			throw new IllegalArgumentException();
		else {
			this.numberOfYears = numberOfYears;
		}
	}		
	public double getLoanAmount() {
		return loanAmount;
	}
	/** Ako je unos novca manji ili jednak nuli, vrsi se 'bacanje' gresek IAE */
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		if (loanAmount <= 0)
			throw new IllegalArgumentException();
		else {
			this.loanAmount = loanAmount;
	    }
    }
	/** Metoda koja vraca mjesecnu stopu */	
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	/** Metoda koja vraca ukupnu sumu */	
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	public java.util.Date getLoanDate() {
		return loanDate;
	}
	/** Main metoda */
	public static void main(String[] args) {
		/*
		 Modify the Loan class in Listing 10.2 to throw IllegalArgumentException
		 if the loan amount, interest rate, or number of years is less than or equal to zero.
		 */
		
		Scanner input = new Scanner(System.in);
		
		boolean isOn = true;  
		
		/** Ako je unos parametara manji ili jednak 0,
		 * ispis greske, i vrsi se ponovni unos parametara */
		do {
			try {
				
				System.out.print("Unesite stopu rasta: ");
				double annualInterestRate = input.nextDouble();
				
				System.out.print("Unesite broj godina: ");
				int numberOfYears = input.nextInt();
				
				System.out.print("Unesite iznos novca: ");
				double loanAmount = input.nextDouble(); // unos parametara
				
				LoanException loan = new LoanException(annualInterestRate, numberOfYears, loanAmount); // kreiranje objekta LExc sa param.
				
				System.out.println("Datum: " + loan.getLoanDate().toString()
						         + "\nMjesecni iznos: " + loan.getMonthlyPayment()
						         + "\nUkupni iznos: " + loan.getTotalPayment());
				isOn = false;                           // uslov ispunjen, prekid rada petlje
				
			} catch (IllegalArgumentException ex) {     // 'hvatanje' greske
				
				System.out.println("Greska, unos ne moze biti manji ili jednak 0!");
				input.nextLine();
			}
			
		} while(isOn);                                  // petlja radi dok se uslov ne ispuni
		
		input.close();
	}
	
}
