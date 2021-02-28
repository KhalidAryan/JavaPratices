package arrayListPractice;

import java.util.ArrayList;

public class CollectionPractice1 {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>(); 
		
		
		ArrayList<String> fn = new ArrayList<String>();
		ArrayList<String> ln = new ArrayList<String>();
		
		fn.add("Khalid1");
		fn.add("Khalid2");
		fn.add("Khalid3");
		fn.add("Khalid4");
		
		ln.add("Ahadi");
		
		
		data.add(fn);
		data.add(ln);
		data.add(new ArrayList<String>());
		data.add(new ArrayList<String>());
		data.add(new ArrayList<String>());
		
		data.get(3).add("example text");
		data.get(3).add("example text2");
		
		
		// remove Khalid data
		data.get(0).remove(2);
		
		
		// remove jack2 and add "jack 2.0" in that same location.
		
//		data.get(0).set(1, "Khalid 2.0");
		data.get(0).remove(1);
		data.get(0).add(1,"Khalid 20 ");
		
		System.out.println(data);
		
		// how to remove Khalid 3. data.get(0).remove(2);
		//remove Khalid2 and add Khalid 2.0 in that same location. data.get(0).remove(1); ******data.get(0).add(1, "Khalid 2.0");
		

	}

}
