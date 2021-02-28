package FibonacchiNumbers;

import java.util.ArrayList;

public class FibonacchiNumbers {
public static void main(String[] args) {
	//12345
	//fibonacchi number is the plus of the two previews numbers
	
        ArrayList<Integer> num = new ArrayList<Integer>();
          num.add(0);
          num.add(1);
       // 0 1 add((1 index before the end) + (2 index before the end))
        for( int count = 0; count <10; count ++) {
	 num.add(num.get(num.size() -1) + num.get(num.size() - 2));
 }
        System.out.println(num);
        
        
}


public static boolean isPrime(int a) {
	int test = 2;
	boolean prime = false;
	while (test <= a / 2) {
		if(a % test == 0) {
			prime =  true;
			break;
		}
		test++;
	}
	if(!prime) {
		return true;
	}else {
		return false;
	}
}}



