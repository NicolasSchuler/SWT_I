package de.nicolasschuler.verdecken_vs_ueberschreiben;

public class Main {

	public static void main(String[] args) {
		B y = new B();
		A x = new B();
		
		x.bar();		// speziellste Methode wird aufgerufen
		y.bar();		// speziellste Methode wird aufgerufen
		
		x.foo();		// statische Methode von A wird aufgerufen
		y.foo();		// statische Methode von B wird aufgerufen
		((A) y).foo();	// statische Methode von A wird aufgerufen

	}

}
