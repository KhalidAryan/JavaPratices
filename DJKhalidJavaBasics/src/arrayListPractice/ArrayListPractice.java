package arrayListPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> firstAL = new ArrayList<Integer>();
		
		firstAL.add(10);
		firstAL.add(120);
		firstAL.add(100);
		firstAL.add(105);
		firstAL.add(101);
           System.out.println(firstAL);
           
           //for(Integer i : firstAL) { for each loop
        	 //  System.out.println(i);
         
           
           for (int i =0; i < firstAL.size(); i++) {
           
           System.out.println(firstAL.get(i));

	}
	}
}
