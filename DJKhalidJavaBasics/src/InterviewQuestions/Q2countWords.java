package InterviewQuestions;

import java.util.HashMap;

public class Q2countWords {

	public static void main(String[] args) {
		// write a function to count the number of words in this string
		// then it should print the list of the words with the repetition number of each one of them.
		
		String text = "The brown fox jumped on the desk. The fox is looking at the window now fox fox ";
		
		//lets find the count of all words - separated by space.
		// create a unique list of the words.
		// count each repetition of each word.
		
		countWords(text);

	}
	public static void countWords(String str) {
		String[] allWords = str.split(" ");
		// we used HashMap cuz it does not accept duplicate value
		HashMap<String,Integer> words = new HashMap<String, Integer>();
		
		for( int i =0; i < allWords.length; i ++) {
			if(words.containsKey(allWords[i])) {
				//if I do have word i
				words.put(allWords[i], (words.get(allWords [i]) +1));
			}else {
				// I don't have word i
				words.put(allWords[i],1);
				
			}
		}
		System.out.println(words);
	}}



