package InterviewQuestions;


public class Q7StringQuestions {

	public static void main(String[] args) {
		String text = "this is just to check if we can code it or not.";
		// how many vovel character do we have in the string above?
		//i e o u a if we have our vowel in lower case it will only print the lower case not uper case.
		
	int countText = 0;
	
			for(int j = 0; j < text.length(); j++) {
				if(text.charAt(j) == 'a' || text.charAt(j) == 'e' || text.charAt(j)== 'o' || text.charAt(j) == 'i' || text.charAt(j) =='a') 
					
					countText ++;
					
				}System.out.println("the number of vovel is: " + countText);
				
			}
		} 


		
	

	


