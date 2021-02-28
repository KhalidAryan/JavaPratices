package InterviewQuestions;

public class ReversedString {

	public static void main(String[] args) {
		//reverse this string
		//immutable
		String text = "This should be easy.";
		StringBuilder str = new StringBuilder(text);
		System.out.println(str.reverse());// this reverse it too
		
		// mutable
		StringBuilder x = new StringBuilder(text);// not thread safe
		StringBuffer y = new StringBuffer(text); // thread safe
		
		System.out.println(x.reverse());// this reverse it too
		System.out.println(y.reverse());// this reverse it too
		
   System.out.println(text.length()); // this tell us what is the length of our sentence above.
   
   
 //below will not print it in upperCase cuz String is not changeble
 	String x = "test";
 	x.toUpperCase(); // if we write x = toUpperCase it will work
 	System.out.println(x);
 	
 	//below we will be able to print it in upperCase.
 	StringBuilder j = new StringBuilder("test");
 	j.toUpperCase();
 	System.out.println(y);
 	
	}
}
 