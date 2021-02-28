package arrayListPractice;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		//HashMap<Integer, String> data = new HashMap<Integer, String>();
		
		HashMap<String, String> states = new HashMap<String, String>();
		// HashMap is made of key and value. like CA is the key and California is the value
		states.put("AL", "Alabama");
		states.put("AK", "Alaska");
		states.put("CA", "California");
		states.put("CO", "Colorado");
		states.put("FL", "Florida");
		states.put("DE", "Delaware");
		
		System.out.println(states.get("FL"));
		System.out.println(states.get("CA"));
		System.out.println(states); // this will print it with keys and values 
		
		
		System.out.println(states.keySet()); // keySet option will call them all by their keys.

		

		
		

	}

}
