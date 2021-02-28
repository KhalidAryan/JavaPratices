package InterviewQuestions;

import java.util.HashMap;

public class reviewOne {

	public static void main(String[] args) {
		// flow of execution. we go from top to bottom left to right
		//1 sequential
		//2 selection  is like if statments. if, else if and else 
		//3 method call
		//4 iteration
		boolean x = false;
		if( x = true) {
			System.out.println(x);
			
			for(int i = 10; i >= 0; i--) {
				for( int j  = 0; j < 10 ; j++)
				System.out.println(i == j);
				
				
				HashMap<Integer,String> khalid = new HashMap<Integer, String>();
				khalid.put(1993, "DOB");
				khalid.put(26, "Age");
				khalid.put(460, "Address");
				//System.out.println(khalid.get(1993));
				
				for(int key: khalid.keySet()) { //doing it this way will print it all at once
				System.out.println(key + " "  + khalid.get(key));
				}
			}
			}
		}
		

	}


