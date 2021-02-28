package BankOOPSExample;

public class Saving extends Customer{
	public Saving() {
		  super();
	  }
	  public Saving(String firstName, String lastName, int accountNumber, double balance) {
		  super(firstName, lastName, accountNumber, balance);
}
	  public double calcAccountCharges() {
		  
		  return super.calcAccountCharges()+10;
	  }
	  
}

