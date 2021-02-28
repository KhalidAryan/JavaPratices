package JavaBasics;

public class SwitchExamples {

	public static void main(String[] args) {
		
		
		String day = "sat";
				
		
		switch(day) {
		
		case"sat":
			System.out.println("this is the first day of the week");
			break;
		case"sun":
			System.out.println("this is Sunday! Still working?");
			break;
		case"mon":
			System.out.println("I like to print two lines");
			break;
			// break mean to separate the codes or stop where we  print
		default:
				System.out.println("this is my default text");
		
		
		}
				
		
		
	}

}
