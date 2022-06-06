package oop;

public class Loan implements IRate{

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase rate");
		
	}
	
	public void setTerm (int term){
		System.out.println("Setting the terms to: " + term + " years");
	}
	
	public void setAmmortSched(){
		System.out.println("Ammortization schedule");
	}

}
