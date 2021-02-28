package JavaBasics;

public class forLoopPractice {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i % 2 == 0) { // 6%2=0 mean 6 divide on 2 is 0' so we give3 to each reminder is 0. EX 1%2=1.Ex 2%2=0 Ex 3%2=1.
				//if number is not even it is called odd
				
				
				System.out.print(i + " is even");
			}	else {
				System.out.println(i + "is odd");
				for(int i = 8; i<10 && i>5; i++) {
					System.out.println(i);
					{
		}
			String fn= "Jack ma is one of the best business man in the world";
			
			System.out.println(fn.length());// this will give us the lenght of the letters of Jack ma.
			int countOfe = 0;
			System.out.println(fn);
			//System.out.println(fn.charAt(0));
			// this will tell us what number is our letter in
			for (int index = 0; index <55; index ++) {
				System.out.print(fn.charAt(index)+" ");
			}
			String data = "this is a test"; 
			for (int i = 0; i < data (); i ++) {
				System.out.println();
				//create  for loop that will print message 5 times" coding is fun, but driving me crazy
				for (int j = 0; j < args.length; j++) {
					for(int j=0; j<5; j++) {
						
					}
				}
			}
			
			
			
			
			
		System.out.println();
		System.out.println("end of class");
		
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is EVEN");
			} else {
				System.out.println(i + " is ODD");
			}
		}
		for (int i = 8; i < 10 && i > 5; i++) {
			System.out.println(i);
		}
		// Break - will be back at 7:45
		String fn = "Jack Ma is one of the best business man in this planet!";
		System.out.println(fn.length());
		int countOfe = 0;
		System.out.println(fn);
		for (int index = 0; index < fn.length(); index++) {
			if (fn.charAt(index) == 'e') {
				System.out.print(fn.charAt(index));
				countOfe++;
			} else {
				System.out.print('*');
			}
		}
		// create a string "this is a test"
		// loop to the size of the string and on every print one char
		// and then go to the next line
		// optional - do the same thing in reverse
		System.out.println("\nThe number of lower case 'e' in this string is " + countOfe + "\n");
		System.out.println("\n********************************");
		String data = "this is a test";
		for (int i = 0; i < data.length(); i++) {
			System.out.print(data.charAt(i) + " ");
		}
		System.out.println();
		for (int i = data.length() - 1; i >= 0; i--) {
			System.out.print(data.charAt(i) + " ");
		}
		
		System.out.println("\n********************************");
		System.out.println();
		System.out.println("end of the class");
	}
}

	}
	}
}	

	
	
	
	
	
	