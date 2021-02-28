package JavaBasics;

public class ArrayPatternExcercise {
public static void main(String [] args) {
	int area = 5;
	String temp= "  ";
	for (int row = 0; row <area; row++) {
		System.out.print(row);
	//********************************************************************************************
	//	below example is patterns
int areas = 9;
		
		for (int star = 1, space = areas; star <= areas; star++, space--) {
			for(int i = 1; i <= space; i++) {
				System.out.print("  ");
			}
			for (int i = 1; i <= star; i++) {
				System.out.print(i + "    ");
			}
			System.out.println();
			//*******************************************
			// 3 array dimension.
			int [][][] data= new int [3][4][5];
			//******************************************************************************************
			// break and continue
			int nums [][]= {{1, 2, 3, 4, 5 }, {6, 7, 8, 9, 10 }, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
			
		khalid: for (int row =0; row < nums.length; row++) {
			zahra: for ( int col=0; col< nums[row].length; col++) {
				if(nums[row][col]==8) {
					
				
				continue zahra;
			}
				System.out.print(nums[row][col] + "\t");
			}
		//	if( i==3) {
			//	break; // (continue) just ignores the break and continues the code
			
				System.out.println();
			}
		}
}
	
}}

