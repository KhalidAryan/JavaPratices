package JavaBasics;

public class CreatingVariables {

	public static void main(String[] args) {
		
		
		System.out.print("First jave program! $");
		
		
		double price = 12.99;
		double taxrate = 3.87;
		double discount = 0.055;
		int quantity = 7;
		
		double aftertax = (price* quantity) - ( price * quantity * discount);
		double total = (price * quantity) - (price *quantity * discount);
		System.out.println(total);
		
		// create String with value " this is". you can name the string s1. 
		String s1 = "this is";
		
		//create an int with the value 10 and name it num1
		int num1 = 10;
		
		// create string s2 with value "the times that I am asking this!"
		String s2 = "Th 10 times that I am asking this! ";
		
		//create String s3 " No one answering me! but why?!"
		String s3 = "No one is answering me! but why?!";
		// using the variables above , form one sentence and print it.
		//you need to use one (Sysout). but print the text in two lines.
		// and before you print this, you need to leave two lines empty.
		System.out.println("\n\n" + s1 + num1 + s2 + "\n" + s3);
		//System.out.println("num1+ s2+ s3 = s1"); wrong
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
