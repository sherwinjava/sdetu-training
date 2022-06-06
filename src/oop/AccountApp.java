package oop;

public class AccountApp {

	public static void main(String[] args) {
		Loan la = new Loan();
		la.increaseRate();
		la.setRate();
		la.setAmmortSched();
		la.setTerm(20);
		
		// Polymorphism changes where we are pointing
		IRate account1 = new Loan();
		account1.setRate();
		account1.increaseRate();

	}

}
