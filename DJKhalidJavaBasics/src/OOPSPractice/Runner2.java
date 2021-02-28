package OOPSPractice;

public class Runner2 {

	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount(123);
		
		BankAccount obj2 = new BankAccount(147,5052);
		
		BankAccount obj3 = new BankAccount(258, 1568, "Jack", "Ma");
		System.out.println(obj3);
		
		obj3.deposite(50);
		System.out.println(obj3.getBalance());
		
		obj3.withdraw(70);
		System.out.println(obj3.getBalance());

	}

}
