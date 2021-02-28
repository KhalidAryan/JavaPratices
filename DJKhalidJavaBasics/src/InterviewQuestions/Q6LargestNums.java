package InterviewQuestions;

public class Q6LargestNums {

	public static void main(String[] args) {
	        	// find the largest number in this array
				// find the smallest number in this array
				// find the sum of all numbers in this array
				// find the average of all numbers in this array

		
   int[] numbers = { 5, 5, 3, 2, 19, 5, 4, 2, 5, 8, 2, 5, 2, 5, 41 };
   int max= numbers[0], min = numbers [0], sum= 0;
   
   for(int n : numbers) {
	   if(n > max) {
		   max = n;
	   }else if(n < min) {
		   min = n;
	   }
	   sum += n;
   }
   double avg = (double) sum / numbers.length;
   System.out.println("Min: " + min + " Max: " + max + " sum: " + sum + " average: " + avg);
   
   // round the avg number to 2 decimal points. (Math.round(avg * 100.0) / 100.0)); we can add this part to top sysout to get the round result.
   // give me the second highest number in the array.
   int secondMax = numbers[0];
   for(int i : numbers) {
	   if(i > secondMax && i < max) {
		   secondMax = i;
		   System.out.println("secondMax number is: " + secondMax); // secondMax is 19, 19 should not be first number in array lis or it will print it
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	   }
	   
   }
   

		
		
	}

}
