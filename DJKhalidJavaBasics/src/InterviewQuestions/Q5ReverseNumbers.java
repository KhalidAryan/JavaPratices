package InterviewQuestions;

public class Q5ReverseNumbers {

	public static void main(String[] args) {
		
   //reversing numbers 
    int x = 10;
    int y = 5; 
   
    x = x + y;
    y = x - y;
    x = x - y;
    System.out.println("x: "+ x + " y: " + y);
    
    // convert the int to string and then reverse the string using a loop.
    // then convert the reversed number to that same int.??
    int num = 15948;
    //num is 84951
    
     String myString= String.valueOf(num);
     String reverse ="";
     
     for(int i = myString.length() - 1; i >= 0; i--) {
    	 reverse += myString.charAt(i);
    	 
     }
     num = Integer.valueOf(reverse);
     System.out.println(num);

	}

}
