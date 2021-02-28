package JavaBasics;

public class SingleDimensionArrayExamples {

	public static void main(String[] args) {
		
		int [] numbers= {10,15,20,25,30,50};
		System.out.println(" size of the Array: " +numbers.length);// we know what is the size of array
		for( int i =0; i<numbers.length; i ++) {
			System.out.println(i);
			
			numbers [6] = 50; // this is called ( single array)
			
			for (int num : numbers) { // this is called  FOR EACH loop
				System.out.println(num + " ");
			}
			String [] friends   = new String [4];
			friends[0]= "Khalid";
			friends[1]= "John";
			friends[2]= "Jami";
			friends[3]= "Ehsan";
			for ( int i =0; i <friends.length; i++) {
				System.out.println(friends[i]);
			}
			for ( String i : friends) {
				System.out.println(i);
			}
			
			

			
			
			
			
			
		}
		
		
		
	}}


