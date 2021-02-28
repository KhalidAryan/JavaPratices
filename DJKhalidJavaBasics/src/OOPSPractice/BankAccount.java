package OOPSPractice;
public class BankAccount {
	
	private String firstName;
	private String lastName;
	private int accountNumber;
	private double balance;
	
	public BankAccount() {
		this.firstName = "";
		this.lastName = "";
		this.accountNumber = 0;
		this.balance = 0;
		
	}
	
	
	//this keyword has two use cases
	//this.variable or method name
	//this() <<< this will call any of the constructors of your class. match the signature
	public BankAccount(int accountNumber) {
		this();
		this.accountNumber = accountNumber;
		
	}
	
	public BankAccount(int accountNumber, double balance) {
		this(accountNumber);
		this.balance = balance;
		
	}
	
	public BankAccount(int accountNumber, double balance, String firstName, String lastName) {
		this(accountNumber, balance);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
       this.firstName= firstName;
	}
	public String getLastName() {
		return lastName;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return firstName + " " + lastName;
	}
	// deposite
	public void deposite(double amount) {
		this.balance +=amount;
	}
	//withdraw
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("amount requested is more than your balance");
		}else {
			this.balance -=amount;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}