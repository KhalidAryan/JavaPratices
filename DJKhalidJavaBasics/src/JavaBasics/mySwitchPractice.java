package JavaBasics;

public class mySwitchPractice {

	public static void main(String[] args) {
		
		
	//we can not use relational operators with switch, like <>
		String Day = "sat";// if we do not have the day we looking for it will print default.
				
		switch (Day) {
		case "sat":
			System.out.println("go to shopping");
		break;
		
		case "sun":
			System.out.println("go to walk");
		case "mon":
			System.out.println("study forclass");
		case "tue":
			System.out.println("work\n \tchill");
	
			default:
			System.out.println("stay home\n \t cry");
		//	if statement usage wit Switch
			
			if (Day.equals("sat")) {
				System.out.println("go to shopping and eat out");
			}else if (Day.equals("sun")) {
				System.out.println("its off day");
			}
			 char grade ='a';
			 switch(grade) {
			 case 'a':
				 System.out.println("nice,good job");
			 case 'b':
				 System.out.println("way to go, its still a good place");
			 case 'c':
				 System.out.println(" i love u");
			 case 'd':
				 System.out.println("its ok");
			 }
			 
				 
			 
			
			
		}

	}

}
