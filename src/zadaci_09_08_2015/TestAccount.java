package zadaci_09_08_2015;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		/*
		 Write a test program that creates an Account object with an account ID of 1122,
		 a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
		 method to withdraw $2,500, use the deposit method to deposit $3,000, and print
		 the balance, the monthly interest, and the date when this account was created.
		 */
		
		Scanner input = new Scanner(System.in);
		
		double amountWithdraw, amountDeposit;
		
		Account account1 = new Account(1122, 20000, 4.5);            // kreiranje instance, objekta account1
		                                                             // ispis stanja na racunu, mjesecne dobiti i datuma
		System.out.println("Stanje na racunu: " + account1.getBalance() +
				           "\nMjesecna kamatna stopa: " + account1.getMonthlyInterest() +
				           "\nDatum: " + account1.getDateCreated());
		
		System.out.print("\nUnesite sumu koju zelite da podignete sa racuna: ");
		amountWithdraw = input.nextDouble();                         // unos sume za podizanje novca sa racuna
		
		account1.withdraw(amountWithdraw);                           // pozivanje metode za podizanje novca sa racuna
		
		System.out.print("\nUnesite sumu koju zelite unijeti na racun: ");
		amountDeposit = input.nextDouble();                          // unos sume za ubacivanje novca na racun
		
		account1.deposit(amountDeposit);                             // pozivanje metode za ubacivanje novca na racun
		
		input.close();
	}	
}
/** Klasa Account */
class Account {
	
	/** Privatna polja sa podacima */
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	/** Prazan konstruktor */
	Account() {
	}
	/** Konstruktor sa parametrima */
	Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new java.util.Date();
	}
	/** Geteri i Seteri za polja id, balance, annualInterestRate i Date */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	/** Metoda za izracunavanje i dobijanje mjesecne dobiti za unesenu stopu */
	public double getMonthlyInterest() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyInterest = balance * monthlyInterestRate;
		return monthlyInterest;
	}
	/** Metoda za skidanje novca sa racuna */
	public void withdraw(double amount) {
		double withd = getBalance() - amount;
	    System.out.print("Ukupna suma umanjena za " + amount + " iznosi: " + withd + "\n");
	    this.balance = withd;
	}
	/** Metoda za ubacivanje novca na racun */
	public void deposit(double amount) {
		double depo = getBalance() + amount;
		System.out.print("Ukupna suma uvecana za " + amount + " iznosi: " + depo + "\n");
		this.balance = depo;
	}
}
