package InterviewQuestions;

import java.util.HashMap;

public class Q3CountChars {

	public static void main(String[] args) {
		// write a function to count the number of chars in this string
	    // then it should print the list of the chars with the repetition number of each one of them.
		// count the space, but instead of blank space in the hashmap print "Space"
		// do not consider upper/lower case for chars T or t should be counted in same category
		String text = "The brown fox jumped on the desk. The fox is looking at the window now fox fox ";
		
		countChars(text);
	}

	public static void countChars(String str) {
		char[] chars = str.toCharArray(); // adding lower case will make all lower
		
		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		
		for(char c: chars) {
			if(count.containsKey(c)) {
			//I have the char
			count.put(c, count.get(c) +1); //we add +1 to tell us how many times the character is repeated 
			
		}else {
			//I don't have char
			count.put(c,  1);
			
		}
	}
		System.out.println(count);

	}}
