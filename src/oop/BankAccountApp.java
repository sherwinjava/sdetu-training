package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Create a new bank account >> think instantiate an object
		BankAccount acct1 = new BankAccount();
		acct1.accountNumber = "9532526325";
		
		//acct1.name = "Roger Hue";
		// With encapsulation: public API methods
		acct1.setName("Roger Hue");
		System.out.println(acct1.getName());
		acct1.setName("123211");
		System.out.println("SSN: " + acct1.getSsn());
		acct1.setRate();
		acct1.increaseRate();
		acct1.balance = 10000;
		acct1.deposit(1500);
		
		// Polymerphism through overriding
		System.out.println(acct1.toString());
	
		
		// Polymorphism through overloading
		BankAccount acct2 = new BankAccount("Checking Account");
		acct2.accountNumber = "349813513";
				
		BankAccount acct3 = new BankAccount("Savings Account", 999);
		acct3.accountNumber = "524234531";
		
		/*
		acct3.checkBalance();
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/	
	}

}
