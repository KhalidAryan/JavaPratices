package JavaBasics;

public class MyArrayPractice {

	public static void main(String[] args) {
	
		String [] friends   = new String [4]; // {"Khalid", "JAmi", "Ehsan", "John"} we can do array this way too
		friends[0]= "Khalid";
		friends[1]= "John";
		friends[2]= "Jami";
		friends[3]= "Ehsan";
		for ( int i =0; i <friends.length; i++) { // this is for loop
			System.out.println(friends[i]);
		}
		for ( String x : friends) { // this is for each loop
			System.out.println(x);
		}
			// first name
		String [] fn = new String[5];
		
		//last name
		String[] ln = new String[5];
		
		//age
		int [] age= new int[5];
		
		//Khalid DJ 70
		//spider jan 80
		// bats lan 75
		// iron san 55
		// super dan 40
		
		//Khalid DJ 70
		fn[0]= "Khalid";
		ln[0]="DJ";
		age[0]= 28;
		
		//spider jan 80
		fn[1]= "Iron";
		ln[1]="man";
		age[1]= 80;
		
		//Bats lan 75
		fn[2]= "Spider";
		ln[2]="Jan";
		age[2]= 75;
		
		//iron san 55
		fn[3]= "Super";
		ln[3]="dan";
		age[3]= 55;
		
		//super dan 40
		fn[4]= "Bats";
		ln[4]="lan";
		age[4]= 40;
		
		for (int i =0; i< fn.length; i ++) {
			System.out.println("First_Name : " + fn[i] + "\tLast_Name : " + ln[i] + "\tAge :" + age [i]);}
			//*******************************************************************************************************************************************************************
			int[] oneD= new int [10]; // one dimension array with size 10
			int [][] twoD= new int [3][4]; // two dimension array with 3 rows and size 4.
			int [][][] threeD= new int [3][4][6]; // three dimension array with row 3 layers 4 size 6.
			//*****************************************************************************************************************************************************************
			String[] weekDays= new String [7];
			weekDays [0] ="sunday";
			weekDays[1] = "Monday";
			weekDays [2] = "Tuesday";
			weekDays [3] = "Wednesday";
			weekDays [4] = "Thursday";
			weekDays [5] = "Friday";
			weekDays [6]= "Saturday";
			
			
					for (int i = 5; i < weekDays.length; i++) {// when we use IF with array.
						System.out.print(weekDays[i] + ", ");
						
						if ( weekDays [i] == "Sunday") {
							System.out.println("today is off day");
						}	else if(weekDays [i]== "Tuesday") {
							System.out.println("study for class");
							
						}else {
							System.out.println("today is off class");		
						}	
						} System.out.println("******************************************");              //  how we do it with FOR  EACH loop.
					for(String string : weekDays) {
						System.out.println(string);
					}
	}
					// create 2 dimension array name it array2D. { 2, 3, 4} {7, 8, 9,}
			int[][] array2D =  new int[2][3];
			
			array2D [0][0] = 2;
			array2D [0][1] = 3;
		    array2D [0][2] = 4;
			
		    array2D [1][0] = 7;
		    array2D [1][1] = 8;
		    array2D [1][2] = 9;
		    
		    for (int[] array1D: array2D) {
		    	for (int[] num : array1D) {
		    	
			
						

}}}}
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
								
					
				
			
	

	


