package PolyMorphism;

public class MultiDataTypesPoly {

	public static void main(String[] args) {
		final int x =10; // if we use final before int we can not change the variable anymore or inherrite from them.
		x=5;
		
		//String[] data = new String[10]; this was the first method
		Object [] data = new Object [10];// we created array of object in oder to be able to store any kind of data like , int, boolean, char etc
		data [0] = "test";
		data [1] = "test 4";
		data [2] = 5;
		data [3] = 'c';
		data [4] = false;
		data [5] = "Khalid";
		data [6] = 50.55;
		data [7] = 15;
		data [8] = true;
		data [9] = "test12";
		





		
		for(Object s : data) {
			System.out.println(s);
		}

	}

}
