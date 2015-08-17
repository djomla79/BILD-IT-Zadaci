package zadaci_17_08_2015;

import java.util.Date;

public class PersonTest {

	public static void main(String[] args) {
		/*
		 Design a class named Person and its two subclasses named Student and Employee.
		 Make Faculty and Staff subclasses of Employee. A person has a name, address, phone number, and email address.
		 A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant.
		 An employee has an office, salary, and date hired. Use the MyDate class to create an object for date hired.
		 A faculty member has office hours and a rank. A staff member has a title.
		 Override the toString method in each class to display the class name and the person’s name.
		 Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
		 */
		/** Kreiranje objekata person, student, employee, faculty i staff, i pozivanje njihove toString() metode */
		Person person = new Person("Mladen", "Petrovo", "066-865-975", "tm.djomla1@gmail.com");
		System.out.println(person.toString() + " ");
		
		Person student = new Student("Bojan", "Petrovo", "065-895-867", "ba.yonbe@gmail.com", "freshman");
		System.out.println(student.toString() + " ");
		
		Person employee = new Employee("Slavisa", "Petrovo", "066-895-853", "sm.alkalni@gmail.com");
		System.out.println(employee.toString() + " ");
		
		Person faculty = new Faculty("Ceca", "Kakmuz", "066-888-999", "sp.ceca@gmail.com");
		System.out.println(faculty.toString() + " ");
		
		Person staff = new Staff("Goran", "Kakmuz", "066-999-888", "ga.gogi@gmail.com");
		System.out.println(staff.toString() + " ");
		
	}
}
/** Klasa Person */
class Person {
	
	private String phone;
	private String name;
	private String address;
	private String email;
	
	/** prazan konstruktor */
	public Person(){
	}
	/** Konstruktor sa parametrima name, address, phone i email */
	public Person(String name, String address, String phone, String email) {
		super();
		this.phone = phone;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	/** Geteri i seteri */
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	/** Overrajdana metoda */
	public String toString(){
		return getClass() + " - ime: " + name;
	}
}
/** Klasa Student koja extenda klasu Person */
class Student extends Person {
	
	private final String STATUS;
	/** Konstrukor Student sa parametrima name , address, phone, email i status */
	Student(String name, String address, String phone, String email, String status) {
	   super(name, address, phone, email);
	   this.STATUS = status;
	}
	/***/
	Student(String status) {
		this.STATUS = status;
	}
	public String getStatus() {
		return STATUS;
	}
	@Override
	public String toString() {
		return getClass() + " - ime: " + super.getName();
	}
}
/** Klasa Employee extenda Klasu Person */
class Employee extends Person {
	
	private String office;
	private double salary;
	private Date dateCreated;
	
	/** prazan konstruktor */
	Employee() {
	}
	/** Konstruktor sa parametrima name, address, phone ,email */
	Employee(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}
	/** Konstruktor sa parametrima office, salary, dateCreated */
	Employee(String office, double salary, Date dateCreated) {
		this.office = office;
		this.salary = salary;
		this.dateCreated = dateCreated;
	}
	/** Geteri i seteri */
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	@Override
	/** Overrajdana metoda */
	public String toString(){
		return getClass() + " - ime: " + super.getName();
	}
}
/** Klasa Faculty extenda Klasu Employee */
class Faculty extends Employee {
	
	private String officeHours, rank;
	
	/** prazan konstruktor*/
	Faculty() {
	}
	/** Konstruktor sa parametrima name, address, phone, email */
	Faculty(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}
	/** Konstruktor sa parametrima officeHours, rank */
	Faculty(String officeHours, String rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}
	/** Geteri i seteri */
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	/** Overrajdana metoda */
	public String toString(){
		return getClass() + " - ime: " + super.getName();
	}
}
/** Klasa Staff extenda klasu Employee */
class Staff extends Employee {
	
	private String title;
	
	/** prazan konstruktor */
	Staff() {	
	}
	/** Konstruktor sa parametrima name, address, phone, email */
	Staff(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}
	/** Konstruktor sa parametrom title */
	Staff(String title) {
		this.title = title;
	}
	/** Geteri i seteri */
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	/** Overrajdana metoda */
	public String toString(){
		return getClass() + " - ime: " + super.getName();
	}
}