package InterviewQuestions;

public class Q1FizzBuzz {

	public static void main(String[] args) {
		// write a function that will take two numbers(start and end). print Fizz for numbers that are divisible by 3, 
		//print Buzz for numbers that are divisible by 5 and print FizzBuzz for numbers that are divisible by 3 and 5. print the other numbers??
		
		//25 this is the divisible number.
		//print numbers
		// if num% 3 and num % 5 is 0 = FizzBuzz
		//if num % 3 is 0 = Fizz
		// if num % 5 is 0 = Buzz
		//else print the num
		
		printFizzBuzz(10, 50);

	}
	public static void printFizzBuzz(int start, int end) {
		for(int num =start; num< end ; num++) {
			if(num % 3 ==0 && num % 5==0) {
				System.out.println("FizzBuzz");
			}else if(num % 3 ==0) {
				System.out.println("Fizz");
			}else if (num % 5 == 0) {
				System.out.println("Buzz");
			}else
			System.out.println(num);
			
	
	
	
	
	
	
		}}
	
	
	
	

}
