package JavaBasics;

public class Java_lab_pratice {
public static void main(String  [] args) {
	//int num = 0;
	//int maxNum = 10;
//	 num +=1;
	 
	//while(num<maxNum) {
		//System.out.println(" Counter + "+num++);
	
	
	
	int number = 15;
	boolean condition= true;
	while(condition) { // while loop always requires the while condition to be true otherwise it will stop.
		
		//if number <10
		//      print "the number is less than 10"
	//	condition+ false;
		//else if number<15
		//       print'the number is less then 15
		//condition= false;
	     // else
		// "number is less then or more equal to 20
		//condition = false; 
		// while loop with if
		if(number<10) {
			System.out.println("the number is less then 10");
		}	else if (number <15) {
			System.out.println("the number is less then 15");
			
		}else {
			System.out.println("number is less or equal to 20");
			condition = false;
			
		}
	}
	int x =2;
	do {
		//code block
		System.out.println("hello");
		--x; // we print it two time hello.
		
	}while (x>0); //ture, if we wanna make it false we say. x=0; the result will be false
	
	int y = 10;
	do {
		System.out.println("did it run? what was the valus of y? " +y);
		y--;
	}while(y==5);
	
	// homework, requirement 
	//create a int k = 6; create a do while, do block needs to print k value, then increment by one.
	//while condition will be k <=12;
	
	int k =6;
	
	do {
		System.out.println(" The value of k = " +k++);
		
	}while (k <=12);
//	*****************************************************************************************************
	int z = 7;
	String day= "mon";
	day="mon";
	switch(day) {
	case "mon":
		System.out.println("today is monday");
		break;
		
	case"tue":
		System.out.println("today is tuesday");
		break;
	case "wed":
		System.out.println("go home");
		default:
			System.out.println("today is Holyday");
		break;
	}
		
	do {
		System.out.println("love you z = " +z++);// we add the letter with +z++ to see it each individual number
		
		
	}while (z<=14);
	
	}
	 
//**************************************************************************************************
// while loop inside a If, else statement
	
	
	
	
	
	
	
	
	
}
	
	

	
	
	
	
	
	
	
	


      
