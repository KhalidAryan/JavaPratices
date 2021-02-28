package JavaBasics;

public class EldosLab4 {
public static void main (String [] args) {
	
	int [] a = {1, 2, 3};
	
	for (int i : a) {
		System.out.print(i + ", " );
		System.out.println();
	}
		// create array and assign value of a. and add it by one.
		int [] b = new int [a.length];
	     int num = 0;
	    for (int i : a) {
	    	b[num]=i;
	    	System.out.print(b[num] + ", ");
	    	num ++;
	    }
	    // create array c and assign value of array A and array B.
	    System.out.println();
	    	int [] c = new int[a.length + b.length];
	    	int count = 0;
	    	
	    	for (int i=0; i < 1; i++) {
	    		for (int n: a)
	    			c[count]= n;
	    		System.out.println(c[count] + ", ");
	    		count++;	
	    		
	    		}
	    	for (int n: b) {
	    		c[count]=n;
	    		System.out.print(c[count]+ " ");
	    		count++;
	    	}
	    	}

	    }
	    	 
	     
	     
	     
	    	 
	    	 
	     
	     
		
		
		
	
	
	
	
	
	
	


