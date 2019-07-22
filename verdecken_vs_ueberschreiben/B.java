package de.nicolasschuler.verdecken_vs_ueberschreiben;

public class B extends A{
	/**
	 * Ich werde verdeckt sein!
	 */
	public static void foo() {
		System.out.println("foo B");
	}
	
	/**
	 * Ich überschreibe die Methode aus A!
	 */
	@Override
	public void bar() {
		System.out.println("bar B");
	}

}
