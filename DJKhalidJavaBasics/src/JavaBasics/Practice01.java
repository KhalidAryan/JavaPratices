package JavaBasics;

public class Practice01 {
public static void main ( String []args) {
	
	// create boolean isRaining assign true
	// create double temp assign 55;
	// create int wind assign 15
	
	// create the following logic
	// its raining and temp is more than 60, print " its raining but temp is fine"
	// its not raining and wind is more than 20 then print " dont need umbrella, but its windy"
	//its raining and temp is less than 20 and wind is more then 20 print " stayinside"
	
	// is raining == false
	//!isRaining
	// isRaining!= true
	
	
	boolean isRaining = true;
	double temp = 55;
	int wind = 15;
	
	if (isRaining == true  && temp >60) {
	
	       System.out.println("its raining but temp is fine");
	
	}else if (isRaining == false && wind >20) {
      System.out.println("don't need the umbrella, but it's windy");

	}else if(isRaining == true && temp <20 && wind > 20 ) {
		System.out.println(" stay inside");
	}else {
		System.out.println(" non of the condition evaluate to true ");
	}
	
	// boolean a = true
	///boolean b = true
    // boolean c = true
	
	//(!a && !b) || !(a|| b) && b
	
	// true or anything is true. if a sentence has OR|| it is true.
	// false or anything is False. if it has and && it is false, the sentence.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
