package JavaBasics;

public class ArrayEldos {
public static void main(String[] args) {
	
	//create a int array the size of 5
	int[] arrayOfNum= new int[5];
//	int[] arrayOfNum= {1,2,3,4,5,6,7,8,9}; // we can do it 2 ways
	//add some value to each index, 15,6 43,62,21.
	arrayOfNum[0]=15;
	arrayOfNum[1]=6;
	arrayOfNum[2]=43;
	arrayOfNum[3]=62;
	arrayOfNum[4]=21;
	//check the length of arrayOfNum and print the msg +size.
	System.out.println(" size of array: " +arrayOfNum.length);
	// print 1 index of arrayOfNum and its value.
	// print 3rd index of array OfNum and its value.
	System.out.println(" 1 index of arrayOfNum : " + arrayOfNum [0]);
	System.out.println(" 1 index of arrayOfNum : " + arrayOfNum [2]);
	//***************************************************************************************************************************************
	//car inventory
	// Toyota
	
	// "welcome to toyota dealership"
	// String array name inventory "Highlander:200"
	//supra, corolla, prius, camry, rav4, highlander
	// 10      100      150    120    75     200
	
	System.out.println("welcome to Toyota dealership!");
	String[] inventory= new String[6];
	inventory [0] = "Supra : 10";
	inventory [1] = "Corolla : 100";
	inventory [2] = "Prius : 150";
	inventory [3] = "Camry : 120";
	inventory [4] = "Rav4 : 75";
	inventory [5] = "Highlander : 200";
// create String inventCheck and initialize this text " what many models do we have"
	// create for loop that , condition is no more then length of array +1.
	// print (call String inventCheck + Call each inventory index
	
	String inventCheck=  "what many models do we have";
	
	for ( int i = 0; i < inventory.length; i ++) {
		System.out.println(inventCheck + inventory [i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
}
