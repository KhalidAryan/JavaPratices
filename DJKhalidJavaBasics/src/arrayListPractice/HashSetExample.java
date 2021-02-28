package arrayListPractice;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> nums = new HashSet<Integer>();
		
		nums.add(10);
		nums.add(5);
		nums.add(5);
		nums.add(10); // it will only print 5 or 10 once not twice cuz it does not allow duplicate value
		
		System.out.println(nums);
		
		//how to find if there is duplicate in it below
		 String []data = {"test", "test1", "test1", "test", "test2", "test2"};
		 HashSet<String> temp = new HashSet<String>();
		 
		 for(int i=0; i < data.length; i++) {
			 if(!temp.add(data[i])) {
			System.out.println("there is duplicate in the array " + data[i] + " at index " + i + " is duplicate");	 
			
			//System.out.println(temp.add(data[i]));
		 }

	}

	}}
