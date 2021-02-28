package JavaBasics;

public class MultiDimentionArray {
public static void main(String[] args) {
	
//	int [][] nums= new int [3][3];
//	
//	nums [0][0] = 1;
//	nums [0][1] = 2;
//	nums [0][2] = 3;
//
//	nums [1][0] = 4;
//	nums [1][1] = 5;
//	nums [1][2] = 6;
//	
//	nums [2][0] = 7;
//	nums [2][1] = 8;
//	nums [2][2] = 9;
//	
//	//int [] [] nums2= { {1,2,3}, {4,5,6}, {7,8,9}};  // we can do it this way too
//
//      for ( int row=0; row < nums.length; row ++) {
//    	  for (int column =0; column< nums[row].length; column++) {
//    		  System.out.print(nums[row][column]+ " ");
//    		  
    	  
   // 	  System.out.println();
// 3 array dimension
    int [][][] numsArray2=new int[3][4][5];
    numsArray2[0][0][0] = 39;
    numsArray2[0][0][1] = 39;
    numsArray2[0][0][2] = 39;
    numsArray2[0][0][3] = 39;
    numsArray2[0][0][4] = 39;
    
    numsArray2[0][0][0] = 39;
    numsArray2[0][0][1] = 39;
    numsArray2[0][0][2] = 39;
    numsArray2[0][0][3] = 39;
    numsArray2[0][0][4] = 39;

    numsArray2[0][0][0] = 39;
    numsArray2[0][0][1] = 39;
    numsArray2[0][0][2] = 39;
    numsArray2[0][0][3] = 39;
    numsArray2[0][0][4] = 39;

    numsArray2[0][0][0] = 39;
    numsArray2[0][0][1] = 39;
    numsArray2[0][0][2] = 39;
    numsArray2[0][0][3] = 39;
    numsArray2[0][0][4] = 39;

    numsArray2[0][0][0] = 39;
    numsArray2[0][0][1] = 39;
    numsArray2[0][0][2] = 39;
    numsArray2[0][0][3] = 39;
    numsArray2[0][0][4] = 39;
System.out.println("numsArray2.length = " + numsArray2.length);
System.out.println("numsArray2.length[0] = " + numsArray2[0].length);
System.out.println("numsArray2.length[0][0] = " + numsArray2[0][0].length);

for (int table= 0; table < numsArray2.length; table ++) {
	// we need a loop that can process a 2 dimension array.
	for (int row = 0; row < numsArray2[table].length; row++) {
		for (int col = 0; col < numsArray2[table][row].length; col++) { // all of one row
			System.out.print(numsArray2[table][row][col] + "\t");
		}
		System.out.println();
	}
	System.out.println("----------------------");
	
	System.out.println(table);
}
    			 
      

}
	
}
	


