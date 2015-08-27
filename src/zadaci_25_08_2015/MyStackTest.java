package zadaci_25_08_2015;

import java.util.ArrayList;

public class MyStackTest {

	public static void main(String[] args) {
		/*
		 Rewrite the MyStack class in Listing 11.10
		 to perform a deep copy of the list field.
		 */
		
		MyStack myStack = new MyStack();        // kreiranje objekta MyStack
		
		myStack.push(new Square(7));          
		myStack.push(new Square(9));            // ubacivanje objekata u listu (stack)
		
		MyStack copyStack = MyStack.copy(myStack);   // pravljenje kopije liste (stack-a)
		
		myStack.push(new Square(5));
		myStack.push(new Square(11));           // ubacivanje novih objekata u listu
		
		System.out.println("Broj elemenata originalne liste: " + myStack.getSize());// ispis broja el. orig. liste
		System.out.println("Broj elemenata kopirane liste: " + copyStack.getSize());     // ispis broja el. kopi. liste
		
		/** Ispis elemenata liste i kopirane
		 * liste (stack-a) pozivanjem pop metode */
		System.out.println("\nOriginalna lista: ");
		while(!myStack.isEmpty()) { 
			
			System.out.println(myStack.pop().getClass());
		}
		
		System.out.println("\nKopija liste: ");
		while(!copyStack.isEmpty()) {
			
			System.out.println(copyStack.pop().getClass());
		}
		
	}
}
/** Klasa MyStack */
class MyStack {
	/** arraylista objekata Square */
	private ArrayList<Square> lista = new ArrayList<>();
	/** Prazan konstruktor */
	MyStack() {
	}
	/** Konstruktor sa parametrom */
	MyStack(ArrayList<Square> lista) {
		
		this.lista = lista;
	}
	/** Metoda koja provjerava da li je stack prazan */
	public boolean isEmpty() {
		
		return lista.isEmpty();
	}
	/** Metoda koja vraca velicinu liste (stack-a) */
	public int getSize() {
		
		return lista.size();
	}
	/** Metoda koja vraca zadnji element liste (stack-a) */
	public Object peek() {
		
		return lista.get(getSize()-1);
	}
	/** Metoda koja vraca objekte iz liste (stack-a) */
	public Object pop() {
		
		Object obj = lista.get(getSize()-1);
		lista.remove(getSize()-1);
		
		return obj;
	}
	/** Metoda koja ubacuje objekte u listu (stack) */
	public void push(Square obj) {
		
		lista.add(obj);
	}
	/** Overrajdana metoda toString */
	@Override
	public String toString() {
		
		return "Lista: " + lista.toString();
	}
	/** Metoda za kopiranje liste koja sadrzi objekte Square */
	public static MyStack copy(MyStack s){
		
		ArrayList<Square> copy = new ArrayList<>();
		
		for(int i=0; i<s.lista.size(); i++){
			copy.add(new Square(s.lista.get(i).side));
		}
		
		return new MyStack(copy);
	}

}
